import java.util.Scanner;

public class AverageNumber {

    public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input first number: ");
            int first = scanner.nextInt();
            System.out.print("Input second number: ");
            int second = scanner.nextInt();
            System.out.print("Input third number: ");
            int third = scanner.nextInt();
            System.out.print("Input fourth number: ");
            int fourth = scanner.nextInt();
            System.out.print("Enter fifth number: ");
            int fifth = scanner.nextInt();

            System.out.println("Average of five numbers is: " + (first + second + third + fourth + fifth) / 5);



    }
}
