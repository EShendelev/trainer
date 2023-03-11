package SptintSeven.FirstTheme.ex1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;


class FilteredSaver {
    private List<String> saved = new ArrayList<>();
    private List<Predicate<String>> filters = new ArrayList<>();
    private Consumer<String> onSaveListener;

    public void setOnSaveListener(Consumer<String> onSaveListener) {
        this.onSaveListener = onSaveListener;
    }

    public void addFilter(Predicate<String> filter) {
        filters.add(filter);
    }

    public void save(String line) {
        for (Predicate<String> filter : filters) {
            if (!filter.test(line)) {
                return;
            }
        }
        if (onSaveListener != null) {
            onSaveListener.accept(line);
        }
        saved.add(line);
    }

    public List<String> getSaved() {
        return saved;
    }
}

public class Practicum {


    public static void main(String[] args) {
        FilteredSaver saver = new FilteredSaver();
        Consumer<String> accept = line -> System.out.println("СОХРАНЕНО: " + line);
        Predicate<String> test = line -> line.contains("ВАЖНО");
        Predicate<String> test1 = line -> line.endsWith("!");
        saver.setOnSaveListener(accept);
        saver.addFilter(test);
        saver.addFilter(test1);

        saver.save("Привет!");  // не сохранится
        saver.save("ВАЖНО - это важное слово"); // не сохранится
        saver.save("ВАЖНО! Не забывай его использовать для заметок!"); // сохранится и выведется на экран
        saver.save("Но и память тренировать тоже очень ВАЖНО!");    // сохранится и выведется на экран
        System.out.println(saver.getSaved());   // список из двух сохранённых сообщений
    }
}