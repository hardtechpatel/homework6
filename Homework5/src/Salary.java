import java.util.Scanner;
// count the hra da ta pf and gross salary.
public class Salary
{
        static double hra;
        static double da;
        static double ta;
        static double pf;

    public static void main(String[] args)
    {

            Scanner scanner = new Scanner (System.in);
            System.out.println("Input Employee ID: ");
            int employeeid = scanner.nextInt();
            System.out.println("Enter a Name");
            String name = scanner.next();
            System.out.println("Please enter Salary");
            double salary = scanner.nextDouble();

            System.out.println("HRA" + " = " + (hra = (salary*10)/100));
            System.out.println("DA" + " = " + (da = (salary*8)/100));
            System.out.println("TA" + " = " + (ta = (salary*9)/100));
            System.out.println("PF" + " = " +(pf = (salary*20)/100));
            System.out.println("Gross Salary" + " = " + (salary+hra+da+ta-pf));

        }

    }

