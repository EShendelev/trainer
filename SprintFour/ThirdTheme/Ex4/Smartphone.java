package SprintFour.ThirdTheme.Ex4;

// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone {
    private final String appName;
    public Smartphone(String number, String appName) {
        super(number);
        this.appName = appName;
    }

    public final void makeCall(String targetNumber) {
        System.out.println("Звоним с номера " + super.number);
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    }
    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

}