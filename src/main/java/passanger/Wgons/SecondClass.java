package passanger.Wgons;

public class SecondClass extends Wagons{

    public SecondClass(double cost) {
        super(cost);
    }

    @Override
    public void sum(double cost,int places,int wagon) {
        double sum;

        sum = cost * places * wagon;
        String result = String.format("%.2f",sum);
        System.out.println(result);
    }
}
