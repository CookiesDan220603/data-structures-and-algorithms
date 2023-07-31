public class demo {
    public static void printstr(String strKey) {
        String[] spl = strKey.split(" ");
        for (int i = 0; i < spl.length; i++) {
            int key = Integer.parseInt(spl[i]);
            System.out.println(key);
        }
    }
    public static void main(String[] args) {
        String a = "1 2 3 4 5 6 7";
        printstr(a);
    }
    
}
