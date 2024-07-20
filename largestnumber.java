import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter Three Numbers: ");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int max = 0;
            int x = 0;

            if (a > b && a > c) {
                max = a;
            } else if (b > a && b > c) {
                max = b;
            } else if (a == x || b == x || c == x){
                break;
            }
            else{
                max = c;
            }
            System.out.println("The Largest Number is: " + max);
            System.out.println("Type 'x' to stop !!");
            //approach 2
//        int max = Math.max(c,Math.max(a,b));
//        System.out.println(max);
        }
    }
}
