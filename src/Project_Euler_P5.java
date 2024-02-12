public class Project_Euler_P5 {
    public static void main(String[] args) {
      //the smallest number divisible by each of the numbers 1 to 20?
        int i ;

        for(i=1;i<372888888;i++){
            if(i%20==0 && i%19==0 && i%18==0 && i%17==0 &&i%16==0 &&i%14==0 &&i%13==0 && i%11==0 ){
                System.out.println("The number is :" + i );
                System.exit(0);
            }
        }
    }
}
