import java.security.Key;
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
        if(!tree.contain(st.getId())){
            this.undoState.push(CoppyRoot(this.tree.getRoot()));
            tree.insert(st);
            return true;
        }
            
        return false;
    }

    // Requirement 2
    public Student searchStudentById(int id) {
        if(tree.contain(id)){
            Node current = tree.getRoot();
            while (current != null) {
                if (current.getData().getId() == id) {
                    break;
                }
                current = current.getData().getId() < id ? current.getRight() : current.getLeft();
                }
            return current.getData();
        }
        return null;
    }

    // Requirement 3
    public boolean removeStudent(int id) {
        if(tree.contain(id)){
            this.undoState.push(CoppyRoot(this.tree.getRoot()));
            tree.delete(searchStudentById(id));   
            
        }
        return false;
    }

    // Requirement 4
    public void undo() {
        this.redoState.push(getTree().getRoot());
        Node cloneRoot = this.undoState.pop();
        tree.setRoot(cloneRoot);
       
    }

    // Requirement 5
    public void redo() {
        this.undoState.push(getTree().getRoot());
        tree.setRoot(this.redoState.pop());
        
    }

    // Requirement 6
    public ScoreAVL scoreTree(AVL tree) {
        // code here
        ArrayList<Node> order = new ArrayList<Node>();
        ScoreAVL tree2 = new ScoreAVL();
        LinkedList<Node> list = new LinkedList<>();
        list.add(tree.getRoot());
        while(!list.isEmpty()){
            Node t = list.poll();
            order.add(t);
            if(t.getLeft()!=null)
                list.add(t.getLeft());
            if(t.getRight()!=null)
                list.add(t.getRight());
        }
        for(Node x : order){
            tree2.insert(x.getData());
        }
        return tree2;

    }
    private Node CoppyRoot(Node OriRoot){
        if(OriRoot == null)
            return null;
        Node clone = new Node(OriRoot.getData());
        clone.setLeft(CoppyRoot(OriRoot.getLeft()));
        clone.setRight(CoppyRoot(OriRoot.getRight()));
        return clone;
    }
}
