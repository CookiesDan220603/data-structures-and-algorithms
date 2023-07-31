public class Cau2 {
    public static int recur(int n, int k) {
        if (k==0){
            return 1;
        }
        else{
            return n*recur(n, k-1);
        }
    }

    public static void main(String args[]){
		System.out.println(recur(3,4));
	}
}