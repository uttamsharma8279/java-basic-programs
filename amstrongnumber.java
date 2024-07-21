// THIS PROGRAM WILL PRINT ALL THE AMSTRONG NUMBER BETWEEN THE GIVEN LIMIT
import java.util.Scanner;

public class amstrongnumber {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the starting limit ");
        int n= scan.nextInt();
        System.out.println("enter the last limit");
       int i = scan.nextInt();
        boolean ans = isAmstrong(n);
        for ( n = n ; n<i; n++) {
            if (isAmstrong(n)) {
                System.out.println(n + " ");
//            } else {
//                System.out.println(n + " is not an amstrong number.");
            }
        }

    }
    static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;

        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;

        }
        return sum == original;
    }
}
