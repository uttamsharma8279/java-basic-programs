import java.util.Scanner;

public class fibonaccinumber {
    public static void main(String[] args){
        System.out.println("enter three numbers: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 2;

        while (count <= n){
            int temp = b;
            /* b+=a; */
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);

    }
}

