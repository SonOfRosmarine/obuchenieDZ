package geometry;


import java.util.Scanner;

import static geometry.ExceptionCheckAll.nullPointerAll;

public class Calculation {

    public static void Calculation() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите форму фигуры");
        String enter = sc.next();

            if (enter.equals("Квадрат")) {
                System.out.println("Укажите длину сторон");
                int enter2 = sc.nextInt();
                   Square square = new Square(enter2);
                try {
                    nullPointerAll(square);
                    square.ploshad();
                }catch (NullPointer e){
                    System.out.println(e.getMessage());
                }
            } else if (enter.equals("Прямоугольник")) {
                System.out.println("Укажите длину стороны А");
                Double enter2 = sc.nextDouble();
                System.out.println("Укажите длину стороны B");
                Double enter3 = sc.nextDouble();
                Rectangle rectangle = new Rectangle(enter2, enter3);
                try {
                    nullPointerAll(rectangle);
                    rectangle.ploshad();
                }catch (NullPointer e){
                    System.out.println(e.getMessage());
                }
            } else if (enter.equals("Круг")) {
                System.out.println("Укажите радиус круга");
                double enter2 = sc.nextDouble();
                Circle circle = new Circle(enter2);
                try {
                    nullPointerAll(circle);
                    circle.ploshad();
                }catch (NullPointer e){
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Укажите длину основания");
                Double enter2 = sc.nextDouble();
                System.out.println("Укажите высоту");
                Double enter3 = sc.nextDouble();
                Triangle triangle = new Triangle(enter3, enter2);
                try {
                    nullPointerAll(triangle);
                    triangle.ploshad();
                }catch (NullPointer e){
                    System.out.println(e.getMessage());
                }
            }
    }
}
