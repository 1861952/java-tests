public class SumAverageRunningInt {
    public static void main(String[] args) {
    int sum = 0;
    int count = 0;
    double average;
    final int LOWERBOUND = 1;
    final int UPPERBOUND = 100;
    // for (int num = LOWERBOUND; num <= UPPERBOUND; ++num) {
    //     sum+=num;
    //     count++;
    // } 
    int num = LOWERBOUND;
    do {
        sum+=num;
        num++;
        count++;
    } while (num <= UPPERBOUND);
    average = Double.valueOf(sum/count);
    System.out.println(sum);
    System.out.println(average);
    System.out.println(count);
    }
        
}
    
