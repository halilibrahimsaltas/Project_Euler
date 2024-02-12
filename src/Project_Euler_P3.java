public class Project_Euler_P3 {
    public static void main(String[] args) {
        // Largest Prime Factor

        long i =2L; //divisor number
        long j =600851475143L;// this is our evil number which we must find its largest prime factor
        long k =3L; // prime number

        while (j>1){ // we need to loop for checking factors
            if ( j%i ==0){
                k=i; // this is prime number assignment
                j=j/i; // new number assignment for dividing again

            }
            else // in this part we increase our divisor number also prime number value
                if (j%2==1) { // this part only for 2 to 3 transition because after 3 we just add 2 for each else
                    i += 1;
                }
                else
                    i+=2; // after 3 we just add 2 for each else

        }


        System.out.println("Largest Prime Factor İs : "+ k); // output k is prime number
    }
}
