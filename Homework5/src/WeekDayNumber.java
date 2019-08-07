import java.util.Scanner;

public class WeekDayNumber {

    public static void main(String[] args) {
        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a weekday number (1 to 7): ");
        day = scanner.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("Invalid weekday number.");
        }
        //print weekday name when enter valid number
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}



