import java.util.Scanner;

public class ReverseScanner {

    public static void main(String[] args) {
        int n, reverse =0;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        System.out.println("reverse number is" + reverse);
        }
    }












