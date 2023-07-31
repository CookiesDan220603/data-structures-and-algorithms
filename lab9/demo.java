import java.util.Arrays;
public class demo {
   public static void main(String[] args) {
      Boolean[][] boolArray = new Boolean[5][5]; // initialize a boolean array
      Arrays.fill(boolArray, Boolean.FALSE);
      // all the values will be false
      for(int i = 0; i < boolArray.length; i++) {
         System.out.println(boolArray[i]);
      }
      Arrays.fill(boolArray, Boolean.TRUE);
      // all the values will be true
      for (int i = 0; i < boolArray.length; i++) {
         System.out.println(boolArray[i]);
      }
   }
}