package passanger.Wgons;

public class EconomClass extends Wagons{

    public EconomClass(double cost) {
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
