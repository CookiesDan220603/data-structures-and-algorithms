import java.util.*;

public class StudentManagement {
    private AVL tree;
    private Stack<Node> undoState;
    private Stack<Node> redoState;

    public StudentManagement() {
        this.tree = new AVL();
        this.undoState = new Stack<Node>();
        this.redoState = new Stack<Node>();
    }

    public AVL getTree() {
        return this.tree;
    }

    // Requirement 1
    public boolean addStudent(Student st) {
        // code here
        return false;
    }

    // Requirement 2
    public Student searchStudentById(int id) {
        // code here
        return null;
    }

    // Requirement 3
    public boolean removeStudent(int id) {
        // code here
        return false;
    }

    // Requirement 4
    public void undo() {
        // code here
    }

    // Requirement 5
    public void redo() {
        // code here
    }

    // Requirement 6
    public ScoreAVL scoreTree(AVL tree) {
        // code here
        return null;
    }
}
