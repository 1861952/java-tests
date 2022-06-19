public class Recursion {
    public static void main(String[] args) {
        // System.out.println("\"This course\nis awesome!\"");
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k-1);
        } else {
            return 0;
        }
    }
}