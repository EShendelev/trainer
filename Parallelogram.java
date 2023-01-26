public abstract class Parallelogram implements Figure {
    protected final double a;
    protected final double b;


    Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }



    public double getArea() {
        return a*b;
    };
}