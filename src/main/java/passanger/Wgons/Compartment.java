package passanger.Wgons;

public class Compartment extends Wagons{

    public Compartment(double cost) {
        super(cost);
    }

    @Override
    public void sum(double cost,int places,int wagon) {

        Double sum;

        sum = cost * places * wagon;
        String result = String.format("%.2f",sum);
        System.out.println(result);
    }
}
