import java.util.Scanner;

public class InterChangeValue {
//code for number interchange.
    public static void main (String[] args){
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value of A and B :\n");
        System.out.println("A = ");
        int a = scanner.nextInt();
        System.out.println("B = ");
        int b = scanner.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.print("Number Interchanged Successfully..!!\n");
        System.out.println("A = " +a);
        System.out.println("\nB = " +b);
    }
}
