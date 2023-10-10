package shop.fruits;

public abstract class Fruits {

    double priceWeekday;

    double priceWeekend;

    public Fruits(double priceWeekday, double priceWeekend) {
        this.priceWeekday = priceWeekday;
        this.priceWeekend = priceWeekend;
    }

    public abstract void pricePerKilogramWeekday();

    public abstract void pricePerKilogramWeekend();
}
