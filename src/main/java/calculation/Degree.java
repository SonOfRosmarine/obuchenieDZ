package calculation;

public class Degree {

    public static double degree (double a, double b){
        double result = 1;

        for (int i = 1; i <= b; i++){
            result = result * a;
        }return result;
    }
}
