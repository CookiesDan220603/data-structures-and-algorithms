public class Fraction {
    private int numer;
    private int denom;

    public Fraction(int x, int y) {
        this.numer = x;
        this.denom = y;
    }

    public Fraction() {
        this.numer = 0;
        this.denom = 1;
    }

    public Fraction(Fraction f) {
        this.numer = f.numer;
        this.denom = f.denom;
    }

    public String toString() {
        return numer + "/" + denom;
    }

    public boolean equals(Object f) {
        Fraction f1 = (Fraction) f;
        double a = this.numer / this.denom;
        double b = f1.numer / f1.denom;
        if (a == b) {
            return true;
        }
        return false;

    }
}