import java.util.Scanner;

public class LeapYear

 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a Year ");
        int Year = scanner.nextInt();
        if (Year % 4 == 0)
            System.out.println(" It is a Leap YEAR");
        else
            System.out.println("It is a Common YEAR");
        }
    }


