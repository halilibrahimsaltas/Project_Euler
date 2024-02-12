public class Project_Euler_P6 {
    public static void main(String[] args) {
    //Sum Square Difference
        long i=0L;
        long j;
        long sum1=0L;
        long sum2=0L;


        for ( ; i<101 ;i++){
            sum1 +=(i*i);
            sum2 +=i;
            if(i==100) {

                j = (sum2*sum2)- sum1;

                System.out.println("Sum Square Difference is: " + j);
            }

        }

    }
}
