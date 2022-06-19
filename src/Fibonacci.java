public class Fibonacci {
    public static void main(String[] args) {
        int n =3; // index n for F(n) starting from n=3
        int fn = 0;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;

        System.out.println("The first " + nMax + " Fibonacci numbers are: "); 
        // First two terms are pre-defined 
        System.out.print(1);
        System.out.print(" " + 1 + " ");

        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2; // F(n) = F(n-1) + F(n-2)
            System.out.print(fn + "  ");   
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
    } 
}