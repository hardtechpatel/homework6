import java.util.Scanner;
//finding total of one digit
public class DigitalSum {
    public static void main(String[] args) {
        long sum;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number ");
        long num = scanner.nextLong();
        for(sum=0 ;num!=0 ;num/=10)
        {
            sum+=num%10;
        }
        System.out.println("Sum of digits of a number is "+sum);
    }
}