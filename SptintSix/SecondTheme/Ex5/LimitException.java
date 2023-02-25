package SptintSix.SecondTheme.Ex5;

public class LimitException  extends RuntimeException {
    final private int attempts;


    public LimitException(String message, int attempts) {
        super(String.format("%s: %d\n", message, attempts));
        this.attempts = attempts;
    }
}