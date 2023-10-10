package shop.day;

import shop.fruits.*;

import java.util.ArrayList;
import java.util.Scanner;

public class DayOfWeekday {

public static void priceOfValue () {
    ArrayList<String> day = new ArrayList<>();
    ArrayList<String> weekend = new ArrayList<>();
    ArrayList<String> fruit = new ArrayList<>();


    day.add("Понедельник");
    day.add("Вторник");
    day.add("Среда");
    day.add("Четверг");
    day.add("Пятница");
    weekend.add("Суббота");
    weekend.add("Воскресенье");

    fruit.add("Бананы");
    fruit.add("Апельсины");
    fruit.add("Яблоки");
    fruit.add("Грейпфрукты");
    fruit.add("Киви");
    fruit.add("Ананасы");
    fruit.add("Виноград");

    Scanner sc = new Scanner(System.in);

    System.out.println("Введите фрукт");
    String enter = sc.nextLine();
    Fruits fruits = setFruit(enter);
    if (fruit.contains(enter)) {

        System.out.println("Введите день");
        String enter2 = sc.nextLine();
        if (day.contains(enter2)) {
            fruits.pricePerKilogramWeekday();
        } else if (weekend.contains(enter2)) {
            fruits.pricePerKilogramWeekend();
        } else try {
            throw new Exception(
                    "error");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    } else try {
        throw new Exception(
                "error");
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
public static Fruits  setFruit(String fruit){
Fruits fruits = null;

    switch (fruit) {
        case "Бананы": fruits = new Banana(2.50, 2.70);
            break;
        case "Апельсины": fruits = new Orange(0.85, 0.90);
            break;
        case "Яблоки": fruits = new Apple(1.20, 1.25);
            break;
        case "Грейпфрукты": fruits = new GrapeFruit(1.45, 1.60);
            break;
        case "Киви": fruits = new Kiwi(2.70, 3.00);
            break;
        case "Ананасы": fruits = new PineApple(5.50, 5.60);
            break;
        case "Виноград": fruits = new Grapes(3.85, 4.20);
            break;
        default:
            break;
    } return fruits;

}

}


