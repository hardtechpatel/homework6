import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int num;
        int rem;
        int orig;
        int rev = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = scanner.nextInt();

        orig = num;

        while (num != 0)
        {
            rem = num%10;
            rev = rev*10+rem;
            num =num/10;
        }
        if (rev == orig){
            System.out.println("this is palindrome number:");
        }
        else{
            System.out.println("this is not a palindrome number");}
    }
}
