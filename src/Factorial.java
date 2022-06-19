public class Factorial {
    public static void main(String[] args) {
        long product = 1;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 13;
        for (int i = LOWERBOUND; i >= LOWERBOUND && i <= UPPERBOUND; i++) {
            System.out.println("This is the first one: " + i);
            product = product*i;
            // System.out.println(product);
            System.out.println(i);
        }
        System.out.println(product);
    }
}