import java.util.Scanner;

public class Alphabetcasecheck {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter an Alphabet");
            Scanner scan = new Scanner(System.in);
            char ch = scan.next().trim().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("Lowercase");
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println("Uppercase");

            } else {
                System.out.println("Invalid Statement!!");
                break;
            }
        }
    }
}