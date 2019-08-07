import java.util.Scanner;

public class PositiveNagitiveZero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int number = scanner.nextInt();
        if(number>0){
            System.out.println("POSITIVE"); }
        else if(number<0){
            System.out.println("NEGATIVE"); }
        else
            System.out.println("ZERO");






    }
}
