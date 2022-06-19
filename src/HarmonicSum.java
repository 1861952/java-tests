public class HarmonicSum {
    public static void main (String[] args) {
        final int MAX_DENOMINATOR = 2;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        for (double denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            double fraction1 = 1/denominator;
            sumL2R+=fraction1;
            if (denominator <= MAX_DENOMINATOR) {
                double fraction2 = 1/(MAX_DENOMINATOR-(denominator-1));
                sumR2L+=fraction2;
            }
            
        
        }
        System.out.println("The sum left to right is: " + sumL2R);
        System.out.println("The sum right to left is: " + sumR2L);

        
    }
}