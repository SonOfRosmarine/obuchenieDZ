package geometry;

public class Square extends Figur {

    public Square(Integer A) {
        super(A);
    }

    @Override
    public void ploshad() {
        System.out.println(A * A);
    }
}
