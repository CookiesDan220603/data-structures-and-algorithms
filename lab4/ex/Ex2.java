import java.util.Arrays;

public class Ex2 {
    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.print(student + "\n");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Nguyen An", 5, 6, 7);
        students[1] = new Student("Lee Nguyen", 9.5, 5, 10);
        students[2] = new Student("Tran Tam", 7, 7.5, 7);
        students[3] = new Student("Bao An", 8, 9, 3.8);
        students[4] = new Student("Tam", 0, 9.5, 10);
        print(students);
        Arrays.sort(students, new StudentComparatorAsc());
        System.out.println("Ascending:");
        print(students);
        Arrays.sort(students, new StudentComparatorDesc());
        System.out.println("Descending:");
        print(students);
    }
}
