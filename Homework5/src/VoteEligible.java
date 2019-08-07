import java.util.Scanner;

public class VoteEligible {

    public static void main(String[] args){
        // find out weather the person is eligible for vote or not.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = scanner.nextInt();
        if (age>=18){
            System.out.println("Person is eligible for vote"); }
        else
            System.out.println("Person is not eligible for vote");
    }
}
