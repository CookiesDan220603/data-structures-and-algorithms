public class Node {
    private Student data;
    private Node left, right;
    private int height;

    public Node() {
        this.data = new Student();
        this.left = this.right = null;
        this.height = 0;
    }

    public Node(Student data) {
        this.data = data;
        this.left = this.right = null;
        this.height = 0;
    }

    public Node(Student data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.height = 0;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}