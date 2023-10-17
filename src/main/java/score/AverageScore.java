package score;

import java.util.Scanner;

public class AverageScore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента");
        String name = sc.nextLine();

        int sumItems = 12;
        int count = 1;
        int sum = 0;

        System.out.println("Введите оценки");
        while (count <= sumItems) {
            int assessment = sc.nextInt();
            if (assessment > 0 && assessment < 6) {
                sum += assessment;
                count++;
            } else {
                System.out.println("Введено не допустимое значение");
            }
        }
        double result = sum / sumItems;
        System.out.println("Ученик " + name + " средний бал " + result);
    }
}
