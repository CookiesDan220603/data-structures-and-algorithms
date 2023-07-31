import java.util.Comparator;

public class StudentComparatorAsc implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        double avg = s1.getAvg() - s2.getAvg();
        if(avg < 0) return -1;
        if(avg > 0) return 1;
        return 0;
    }
}
