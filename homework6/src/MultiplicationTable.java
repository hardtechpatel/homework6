import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int i,j;
        System.out.println("Input number of terms :");
        Scanner scanner = new Scanner(System.in);
        j = scanner.nextInt();
        System.out.println("\n");

        for (i = 0; i<=j; i++)
        {
            System.out.println(j+"*"+i+" = "+ i*j);
        }


    }
}

