package SprintFour.ThirdTheme.SandBox;

public class Practicum {

    public static void main(String[] args) {
        Pair pair = new Pair("4", 1);
        System.out.println("Координаты игрока на карте:");
        pair.print();
        Integer x = Integer.parseInt(String.valueOf(pair.getKey()));
        Integer y = (Integer) pair.getValue();

        System.out.println();

        Pair stringPair = new Pair("username", 1);
        System.out.println("Чит-код пользователя:");
        stringPair.print();
        String user = stringPair.getKey().toString();
        String cheatCode = String.valueOf(stringPair.getValue());
    }
}
class Pair {
    public final Object key;
    public final Object value;

    public Pair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.printf("(%s, %s)", key, value);
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}