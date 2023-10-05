package wagons;

import java.util.Scanner;

public class Wagon {


    public static void valueTransporting (){

        int wagon;
        int weight = 75;
        int result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите колличество вагонов");
        int enter = sc.nextInt();
        wagon = enter;
        result = wagon * weight;
        System.out.println(result);

    }

    public static void wagonLength (){

        int wagonLength = 13920;
        int locomotiveLength = 21700;
        double mmInMeters = 0.001;
        double wagonLengthMeters;
        double locomotiveLengthMeters;
        double result;
        int wagon;
        int ceil;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите колличество вагонов");
        int enter = sc.nextInt();
        wagon = enter;
        wagonLengthMeters = wagonLength * mmInMeters;
        locomotiveLengthMeters = locomotiveLength * mmInMeters * 2;
        result = (wagon * wagonLengthMeters + locomotiveLengthMeters);
        ceil = (int) Math.ceil(result);;
        System.out.println(ceil);
    }

    public static void valueWagons (){

        int width;
        int length;
        int height;
        double metr = 0.001;
        double widthInMetrs;
        double lengthInMetrs;
        double heightInMetrs;
        double result;


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ширину в мм");
        int enter = sc.nextInt();
        width = enter;
        widthInMetrs = width * metr;
        System.out.println("Введите длину в мм");
        int enter2 = sc.nextInt();
        length = enter2;
        lengthInMetrs = length * metr;
        System.out.println("Введите высоту в мм");
        int enter3 = sc.nextInt();
        height = enter3;
        heightInMetrs = height * metr;
        result = widthInMetrs * lengthInMetrs * heightInMetrs;
        double scale = Math.pow(10, 1);
        double finalResult = Math.ceil(result * scale) / scale;
        System.out.println((finalResult));

    }
    public static void costTransaction (){
        int width = 2940;
        int length = 12692;
        int height = 2425;
        double metr = 0.001;
        double widthInMetrs;
        double lengthInMetrs;
        double heightInMetrs;
        double result;
        int complect = 227;
        double cost;
        double prise;

        Scanner sc = new Scanner(System.in);

        widthInMetrs = width * metr;
        lengthInMetrs = length * metr;
        heightInMetrs = height * metr;
        result = widthInMetrs * lengthInMetrs * heightInMetrs;

        System.out.println("Введите стоимость");
        double enter = sc.nextDouble();
        cost = enter;
        prise = result * complect * cost * 0.97;
        double scale = Math.pow(10, 2);
        double finalResult = Math.ceil(prise * scale) / scale;
        System.out.println((finalResult));
    }
}
