public class Project_Euler_P4 {
    public static void main(String[] args) {
           //Largest Palindrome Product
        int b; int c; int d; int e;int f;
        int i;
        int k;
        int number;
        //// Function to check if a number is palindrome without using isPalindrime function
        for ( number= 999999;number>900009; number-=10){
            k=number/10;
            e=k%10;
            k=k/10;
            d=k%10;
            k=k/10;
            c=k%10;
            k=k/10;
            b=k%10;
            if (b==e && c==d){
                for (i=999;i>900; i-=1){ // Loop through all products of three-digit numbers
                    f=number/i;// checking other number for it must be three-digit numbers
                    if(f<i && number%i==0) { //
                        System.out.printf("The Largest Palindrime is : " + number);//output
                    }

                }
            }
        }

    }
}
