package geometry.figur;

import geometry.figur.Figur;

public class Triangle extends Figur {

    public Triangle(double H, double C) {
        super(H, C);
    }

    @Override
    public void ploshad() {
        double value = 0.5 * C * H;
        double scale = Math.pow(10, 3);
        double result = Math.ceil(value * scale) / scale;
        System.out.println((result));
    }
}
