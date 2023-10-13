package passanger.Wgons;

import passanger.exeption.NullMatter;

import java.util.Scanner;
import static passanger.exeption.ExceptionCheckCost.nullPointerPlaces;
import static passanger.exeption.ExceptionCheckCost.nullPointerWagons;

public class WagonCost {

    public static void wagonCost() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Выберете класс выгона: Compartment, SecondClass, EconomClass");
        String enter = sc.nextLine();
        System.out.println("Укажите колличество мест в вагоне");
        int enter2 = sc.nextInt();
        System.out.println("Укажите колличество вагонов");
        int enter3 = sc.nextInt();

        if (enter.equals("Compartment")) {

            Compartment compartment = new Compartment(12.00);
            try {
                nullPointerPlaces(enter2);
                nullPointerWagons(enter3);
                compartment.sum(compartment.cost, enter2, enter3);
            } catch (NullMatter e) {
                System.out.println(e.getMessage());
            }
        } else if (enter.equals("SecondClass")) {

            SecondClass secondClass = new SecondClass(7.50);
            try {
                nullPointerPlaces(enter2);
                nullPointerWagons(enter3);
                secondClass.sum(secondClass.cost, enter2, enter3);

            } catch (NullMatter e) {
                System.out.println(e.getMessage());
            }
        } else if (enter.equals("EconomClass")) {

            EconomClass economClass = new EconomClass(5);
            try {
                nullPointerPlaces(enter2);
                nullPointerWagons(enter3);
                economClass.sum(economClass.cost, enter2, enter3);
            } catch (NullMatter e) {
                System.out.println(e.getMessage());
            }


        }
    }
}