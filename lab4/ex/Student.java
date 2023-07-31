public class Student {
    private String name;
    private double mathematics, programming, DSA1;

    public Student(){
        this("", 0, 0, 0);
    }

    public Student(String name, double mathematics, double programming, double DSA1){
        this.name = name;
        this.mathematics = mathematics;
        this.programming = programming;
        this.DSA1 = DSA1;
    }

    public String getName(){
        return this.name;
    }

    public double getAvg(){
        return (double)1/3*(mathematics + programming + DSA1);
    }

    @Override
    public String toString(){
        return this.name + " : " + this.mathematics + " - " + this.programming + " - " + this.DSA1;
    }
}
