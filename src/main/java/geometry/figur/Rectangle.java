package geometry.figur;

import geometry.figur.Figur;

public class Rectangle extends Figur {

    public Rectangle(Double C, Double H ) {
        super(C, H);
    }

    @Override
    public void ploshad() {
        double value = C * H;
        double scale = Math.pow(10, 3);
        double result = Math.ceil(value * scale) / scale;
        System.out.println((result));
    }
}
