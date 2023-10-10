package shop.fruits;

import java.util.Scanner;

public class Grapes extends Fruits{

    public Grapes(double priceWeekday, double priceWeekend) {
        super(priceWeekday, priceWeekend);
    }

    @Override
    public void pricePerKilogramWeekday() {

        double cost;

        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько килограмм ?");
        double enter = sc.nextDouble();
        cost = priceWeekday * enter;
        double scale = Math.pow(10, 2);
        double finalResult = Math.ceil(cost * scale) / scale;
        System.out.println(finalResult);
    }

    @Override
    public void pricePerKilogramWeekend() {

        double cost;

        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько килограмм ?");
        double enter = sc.nextDouble();
        cost = priceWeekend * enter;
        double scale = Math.pow(10, 2);
        double finalResult = Math.ceil(cost * scale) / scale;
        System.out.println(finalResult);
    }
}