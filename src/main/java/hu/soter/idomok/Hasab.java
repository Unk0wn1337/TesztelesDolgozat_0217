package hu.soter.idomok;

public class Hasab extends FaIdom{
    private double a,b,m;

    public Hasab(double a, double b, double m) {
        super(getFajsuly());
        this.a = a;
        this.b = b;
        this.m = m;
    }

    public int getA() {
        return (int) a;
    }

    public int getB() {
        return (int) b;
    }

    public int getM() {
        return (int) m;
    }

}
