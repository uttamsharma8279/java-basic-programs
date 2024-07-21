import java.util.Scanner;

public class primenumber {
    public static void main(String[] args){
        System.out.println("Enter a number : ");
        Scanner scan = new Scanner(System.in);
       while(true) {
           int n = scan.nextInt();
           boolean ans = isPrime(n);
           if (isPrime(n)) {
               System.out.println(n + " is a prime number");
           } else {
               System.out.println(n + " is not a prime number");
           }
           System.out.println("Type x to stop");
           if (n == 'x' && n == 'X'){
               break;
           }
       }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i=2; i<=n;i++ ){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
