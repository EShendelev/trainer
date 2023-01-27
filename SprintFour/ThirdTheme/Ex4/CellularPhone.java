package SprintFour.ThirdTheme.Ex4;

// Допишите реализацию класса CellularPhone
public class CellularPhone extends Phone{

    public CellularPhone(String number) {
        super(number);
    }

@Override
public void makeCall(String targetNumber) {
        System.out.println("Звоним с номера " + number);
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
}
}