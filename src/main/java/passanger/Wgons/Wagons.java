package passanger.Wgons;

public abstract class Wagons {

    public double cost;

    public Wagons(double cost) {
        this.cost = cost;
    }

    public abstract void sum(double cost,int places,int wagon);
}
