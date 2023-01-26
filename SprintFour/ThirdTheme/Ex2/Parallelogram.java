package SprintFour.ThirdTheme.Ex2;

public abstract class Parallelogram implements Figure {
    protected double a;
    protected double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getArea();
}