import java.util.Scanner;

public class countingoccurance {
    /*    Counting occurrence :
      “ Input  two numbers, find that hoe many times second number digit is present in first number”*/
    public static void main(String[] args){
        System.out.println("enter two number : ");
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        while (a>0){
            int rem = a%10;
            if (rem == b){
                count++;
            }
            a = a/10;
        }
        System.out.println(count);
    }
}

