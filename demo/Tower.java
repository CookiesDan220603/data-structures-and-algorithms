import java.util.*;
import java.util.concurrent.TimeUnit;
public class Tower{
    public static void Towers(int numDisks, char src, char dest, char temp) {
        if (numDisks == 1) {
        System.out.println("Move top disk from pole " + src + " to pole " + dest);
        
        } else {
        Towers(numDisks - 1, src, temp, dest); // first recursive call
        Towers(1, src, dest, temp);
        Towers(numDisks - 1, temp, dest, src); // second recursive call
        }
       
    }
    public static void main(String[] args) {
        Towers(4, 'A', 'B', 'C');
    }
    
}

