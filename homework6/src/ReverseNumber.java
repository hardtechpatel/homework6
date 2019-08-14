import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number, reminder, sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number");
        int Number = scanner.nextInt();

        for (sum = 0; Number >0; Number =  Number/10){
             reminder = Number % 10;
             sum = sum+reminder;}
        System.out.println("sum of the digit number is" + sum);




}}