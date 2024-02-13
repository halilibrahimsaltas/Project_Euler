public class Project_Euler_P7 {
    public static void main(String[] args) {
        // 10001st Prime Number
        //
        long i =3L; // starts from odd number so we can add 2 each time prime number is always odd
        long j=2L; //every number can divide 1 therefore j must be 2
        int k=2; //  k st prime number it starts from 2 because  the loop starts from 3 therefore we must to count for
                 // 2 prime number

        while ( i < 999999999 ) { // loop
            for ( ;  j<i ; j++) { // checking prime number
                if (i%j == 0) { // checking prime number
                    i+=2;
                    j=2L; // this is the key for "ME**" we must set up j = 2 for each time
                    break;

                }
                else {
                    if (j == i - 1) { // if this section is True , we add 1 for k
                        if (k == 10001) {
                            System.out.println("10001st Prime is: " + i);
                            System.exit(0); // we must exit from all loop when we find 10001 st Prime otherwise
                                                   // the loop continues
                        }
                        i+=2; //Also loop continue
                        j=2L; // we must set up j = 2 for each time
                        k += 1;


                    }
                }
            }


        }
    }
}
// **