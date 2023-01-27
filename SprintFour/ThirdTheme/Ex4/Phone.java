package SprintFour.ThirdTheme.Ex4;

public abstract class Phone {
    protected final String number;

    public Phone(String number) {
        this.number = number;
    }

    public abstract void makeCall(String targetNumber);
    
    // {
    //     System.out.println("Звоним с номера " + number);
    //     System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
    //     System.out.println("Привет!");
    // }
}
