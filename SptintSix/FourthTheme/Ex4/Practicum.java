package SptintSix.FourthTheme.Ex4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество участников: ");
        int playersNumber = scanner.nextInt();

        List<String> words = readWordsFromFile("words.txt");

        // Если слов меньше, чем участников, то выведите сообщение:
        // "Недостаточно слов в файле. Добавьте слова и обновите файл."
        // и завершите выполнение программы
        if (words.size() < playersNumber) {
            System.out.println("Недостаточно слов в файле. Добавьте слова и обновите файл.");
            return;
        }

        Collections.shuffle(words);
        // воспользуйтесь статическим методом Collections.shuffle(List<?> list),
        // чтобы поменять порядок слов случайным образом

        int wordsNumber = words.size() / playersNumber;

        for (int i = 0; i < playersNumber; i++) {
            String filename = String.format("player%s.txt", i + 1);
            List<String> subList = words.subList(i * wordsNumber, (i + 1) * wordsNumber);

            writeListToFile(subList, filename);
        }

        System.out.println("Карточки готовы!");
    }

    private static List<String> readWordsFromFile(String filename) throws IOException {
        // добавьте построчное чтение из файла с помощью BufferedReader
        // в случае ошибки выведите сообщение: "Произошла ошибка во время чтения файла."
        List<String> words = new ArrayList<>();
        FileReader reader = new FileReader(filename, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(reader);
        try (bufferedReader) {
            while (bufferedReader.ready()) {
                String word = bufferedReader.readLine();
                words.add(word);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка во время чтения файла");
        }
        return words;
    }

    private static void writeListToFile(List<String> list, String filename) throws IOException {
        Writer fileWriter = new FileWriter(filename, StandardCharsets.UTF_8, true);

        try (fileWriter) {
            for (String item : list) {
                fileWriter.write(item + "\n");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка во время записи файла");
        }
        // добавьте запись слов в файл с помощью FileWriter
        // в случае ошибки выведите сообщение: "Произошла ошибка во время записи файла."
    }
}