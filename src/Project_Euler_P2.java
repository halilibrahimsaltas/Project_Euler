public class Project_Euler_P2 {
    public static void main(String[] args) {
        //The Sum Of Even Fibonacci Numbers

        long i =1; // 4000000 is a big number so we use long data type for safe
        long j =2;
        long k=0;
        long sum =2;// sum variable starts from 2 because bot of the code we didn't calculate fist j value

        while (k<=4000000){ // All numbers -until 4.000.000

            k= i+j; // Next step preparing
            if(k%2==0){ // All even numbers

                sum +=k; // The Sum Of Even Fibonacci Numbers
            }
            i=j;// New value assignment
            j=k;

        }
        System.out.println("The Sum Of Even Fibonacci Numbers İs:" + sum); // Output
    }
}
