import java.util.Scanner;

public class MultiTable {

    public static void main(String[] args) {
        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        j = scanner.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(i + " * " + j + " = " +(i * j));
            i++;

    }
        }
    }

