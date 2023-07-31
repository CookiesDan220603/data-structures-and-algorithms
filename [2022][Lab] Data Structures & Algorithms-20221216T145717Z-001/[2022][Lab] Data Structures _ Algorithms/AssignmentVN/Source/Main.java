import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static ArrayList<Student> readFile(String path) throws ClassNotFoundException, FileNotFoundException {
        ArrayList<Student> students = new ArrayList<Student>();
        File f = new File(path);
        Scanner reader = new Scanner(f);
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            String[] student = data.split(",");
            students.add(new Student(Integer.parseInt(student[0]), student[1], Integer.parseInt(student[2])));
        }
        reader.close();
        return students;
    }

    public static StudentManagement addStudent(String path) {
        StudentManagement studentManagement = new StudentManagement();
        try {
            List<Student> students = readFile(path);
            students.forEach(s -> {
                studentManagement.addStudent(s);
            });
        } catch (Exception e) {
            System.out.println("Readfile Error");
        }
        return studentManagement;
    }

    public static Student findStudentById(ArrayList<Student> students, int id) {
        for (Student s : students) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    public static void writeNodes(ArrayList<Node> nodes, FileWriter fo) throws IOException {
        ArrayList<String> result = new ArrayList<String>();
        for (Node n : nodes) {
            result.add(n.getData().getName());
        }
        fo.write(String.join(" -> ", result));
        fo.write("\n");
    }

    public static void solve(StudentManagement studentManagement, ArrayList<Student> students, String path,
            String outputPath) throws NumberFormatException, Exception {
        File f = new File(path);
        Scanner readerCommand = new Scanner(f);
        FileWriter fo = new FileWriter(outputPath);
        while (readerCommand.hasNextLine()) {
            String[] data = readerCommand.nextLine().split(" ");
            if (data[0].equals("0")) {
                Student s = findStudentById(students, Integer.parseInt(data[1]));
                studentManagement.addStudent(s);
            } else if (data[0].equals("1")) {
                ArrayList<Node> nodes = studentManagement.getTree().NLR();
                writeNodes(nodes, fo);
            } else if (data[0].equals("2")) {
                Student s = studentManagement.searchStudentById(Integer.parseInt(data[1]));
                if (s != null) {
                    fo.write(s.toString() + "\n");
                } else {
                    fo.write("This id not exist\n");
                }
            } else if (data[0].equals("3")) {
                studentManagement.removeStudent(Integer.parseInt(data[1]));
            } else if (data[0].equals("4")) {
                studentManagement.undo();
            } else if (data[0].equals("5")) {
                studentManagement.redo();
            } else if (data[0].equals("6")) {
                ScoreAVL score = studentManagement.scoreTree(studentManagement.getTree());
                ArrayList<Node> nodes = score.NLR();
                writeNodes(nodes, fo);
            }
        }
        readerCommand.close();
        fo.close();
    }

    public static void main(String[] args) throws Exception {
        String studentPath = "list_student.txt";
        int numberOfTestcase = Integer.parseInt(args[0]);
        String testcase = "testcase" + numberOfTestcase + ".txt";
        String testcasePath = "./testcase/" + testcase;
        String output = "output" + numberOfTestcase + ".txt";
        String outputPath = "./output/" + output;
      
        ArrayList<Student> students = readFile(studentPath);
        StudentManagement studentManagement = new StudentManagement();
        solve(studentManagement, students, testcasePath, outputPath);
    }
}
