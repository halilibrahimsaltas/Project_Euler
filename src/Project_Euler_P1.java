public class Project_Euler_P1 {
    public static void main(String[] args) {
        //calculate the sum of all multiples of 3 or 5 up to 1000.

        int sum1 =0 ;

        for (int i=0; i<1000 ; i++ ){ // Arranging loop condition
                if (i % 3 == 0 || i % 5 == 0) { //Arranging if  condition for multiple 3 or 5
                   sum1  += i; // All value sum in the sum1 variable
                }
        }
        System.out.println("The sum of multiples : " + sum1);
    }
}
