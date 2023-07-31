public class Fraction {
    private int num = 0;
    private int denom = 1;
    public Fraction(){
        num = 0;
        denom = 1;
    }
    public Fraction(int x, int y){
        num = x;
        denom = y;
    }
    public Fraction(Fraction f){
        this.num = f.num;
        this.denom = f.denom;
    }
    public int getDenom() {
        return denom;
    }
    public int getnum() {
        return num;
    }
    @Override
    public String toString() {
        return num + "/" + denom;
    }
    @Override
    public boolean equals(Object f) {
        if(!(f instanceof Fraction)){
            return false;
        }
        Fraction t = (Fraction) f;
        if((double) t.num/t.denom == (double) this.num/this.denom)
            return true;
        else
            return false;
    }
}
