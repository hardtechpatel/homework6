import java.util.Scanner;
public class PassFail {

    public static void main (String [] args) {

        System.out.println("Enter The Student Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter The Roll Number");
        int roll = scanner.nextInt();
        System.out.println("Enter the Maths Marks");
        int maths = scanner.nextInt();
        System.out.println("Enter Science Marks");
        int science = scanner.nextInt();
        System.out.println("Enter English Marks");
        int english = scanner.nextInt();
        System.out.println("total marks of three subject" + " = " + (maths + science + english));
        System.out.println("total percentage" + " = " + ((maths + science + english) / (3)) + "%");

        System.out.println("the result is");
        if (maths >= 35) {
            System.out.println("pass"); }
        else
            System.out.println("fail");
        if (science >= 35) {
            System.out.println("pass");}
        else
            System.out.println("fail");
        if (english >=35){
            System.out.println("pass");}
        else
            System.out.println("fail");
        if (maths >=35 && science >=35 && english >=35){
            System.out.println("student is pass");}
            else
                System.out.println("student is fail");
        }

        }




