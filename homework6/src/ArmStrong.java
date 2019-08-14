import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        int n;
        int nu;
        int num = 0;
        int i;

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        nu = n;
        while (nu!=0) {
            i = nu % 10;
            num = num + (i* i * i);
            nu = nu / 10;
        }
        if (num == n) {
            System.out.println("this is an armstrong number");
        } else {
            System.out.println("this is not an armstrong number");
        }
    }
}