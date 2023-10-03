package geometry;

public class Circle extends Figur {

    public Circle(Double R) {
        super(R);
    }

    @Override
    public void ploshad() {
        double p = 3.14;
        double value = p * (R * R);
        double scale = Math.pow(10, 3);
        double result = Math.ceil(value * scale) / scale;
        System.out.println((result));
    }
}
