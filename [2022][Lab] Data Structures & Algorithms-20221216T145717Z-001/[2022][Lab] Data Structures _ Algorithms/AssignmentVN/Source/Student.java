public class Student {
    private int id;
    private String name;
    private int gpa;

    public Student() {
        this.id = 0;
        this.name = "";
        this.gpa = 0;
    }

    public Student(int id, String name, int gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int compareTo(Student st) {
        if (this.getId() < st.getId())
            return -1;
        else if (this.getId() > st.getId())
            return 1;
        else
            return 0;
    }

    public int compareToByScore(Student st) {
        if (this.getGpa() < st.getGpa())
            return -1;
        else if (this.getGpa() > st.getGpa())
            return 1;
        else
            return 0;
    }

    public String toString() {
        return this.id + "," + this.getName() + "," + this.gpa;
    }
}