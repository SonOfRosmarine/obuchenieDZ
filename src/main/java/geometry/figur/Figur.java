package geometry.figur;

public abstract class Figur {

    public Integer A;
    public Double C;
    public Double R;
    public Double  H;

    public Figur(Double R){
        this.R = R;
    }
    public Figur(Double H,Double C){
        this.C = C;
        this.H = H;
    }
    public Figur(Integer A) {
        this.A = A;
    }
    public abstract void ploshad ();

}
