package calculation;

import java.util.Scanner;

public class Calculator {

    public static void calculator() {
        double a;
        double b;
        double result;
        double value;
        double scale;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите вид операции (+ , - , * , / , ^)");
        String enter = sc.next();

        if (enter.equals("+")) {
            System.out.println("Введите аргумент один");
            double enter2 = sc.nextDouble();
            a = enter2;
            System.out.println("Введите аргумент два");
            double enter3 = sc.nextDouble();
            b = enter3;
            value = a + b;
            scale = Math.pow(10, 3);
            result = Math.ceil(value * scale) / scale;
            System.out.println(a + " + " + b + " = " + result);
        } else if (enter.equals("-")) {
            System.out.println("Введите аргумент один");
            double enter2 = sc.nextDouble();
            a = enter2;
            System.out.println("Введите аргумент два");
            double enter3 = sc.nextDouble();
            b = enter3;
            value = a - b;
            scale = Math.pow(10, 3);
            result = Math.ceil(value * scale) / scale;
            System.out.println(a + " - " + b + " = " + result);
        } else if (enter.equals("*")) {
            System.out.println("Введите аргумент один");
            double enter2 = sc.nextDouble();
            a = enter2;
            System.out.println("Введите аргумент два");
            double enter3 = sc.nextDouble();
            b = enter3;
            value = a * b;
            scale = Math.pow(10, 3);
            result = Math.ceil(value * scale) / scale;
            System.out.println(a + " * " + b + " = " + result);
        } else if (enter.equals("/")) {
            System.out.println("Введите аргумент один");
            double enter2 = sc.nextDouble();
            a = enter2;
            System.out.println("Введите аргумент два");
            double enter3 = sc.nextDouble();
             b = enter3;
            if (b == 0) try {
                throw new Exception(
                        "division by zero");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            value = a / b;
                scale = Math.pow(10, 3);
                result = Math.ceil(value * scale) / scale;
                System.out.println(a + " / " + b + " = " + result);
            } else if (enter.equals("^")) {
            System.out.println("Введите аргумент один");
            double enter2 = sc.nextDouble();
            a = enter2;
            System.out.println("Введите аргумент два");
            double enter3 = sc.nextDouble();
            b = enter3;
            value = Degree.degree(a,b);
            scale = Math.pow(10, 3);
            result = Math.ceil(value * scale) / scale;
            System.out.println(a + " ^ " + b + " = " + result);
        }
    }
}
