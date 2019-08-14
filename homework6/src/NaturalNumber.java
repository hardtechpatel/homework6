import java.util.Scanner;
//display n limit of natural numbers and their sum.
public class NaturalNumber
{

    public static void main(String[] args)
    {
        int x,y, sum = 0;
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number");
            y = scanner.nextInt();
        }
        System.out.println("The first natural numbers are " + " num " );

        for ( x = 1; x <= y; x++)
        {
            System.out.println(x);
            sum+=x;
        }
        System.out.println("The Sum of Natural Number " + y + " limit :" + sum);

    }

}
