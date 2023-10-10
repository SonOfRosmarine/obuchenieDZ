package shop.fruits;

import java.util.Scanner;

public class Apple extends Fruits {
    public Apple(double priceWeekday, double priceWeekend) {
        super(priceWeekday, priceWeekend);
    }

    @Override
    public  void pricePerKilogramWeekday() {

        double cost;

        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько килограмм ?");
        double enter = sc.nextDouble();
        cost = priceWeekday * enter;
        System.out.println(cost);
    }

    @Override
    public  void pricePerKilogramWeekend() {

        double cost;

        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько килограмм ?");
        double enter = sc.nextDouble();
        cost = priceWeekend * enter;
        System.out.println(cost);

    }
}
