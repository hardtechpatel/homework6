import java.util.Scanner;

public class StudentReport {
    //grading system for fail, D grade, C grade, B grade, A grade and A+
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
        System.out.println("total marks of three subject" + " = " + (maths+science+english));
        System.out.println("total percentage" + " = " + ((maths+science+english)/(3)) + "%");
        if((maths+science+english)/(3)>35){
            System.out.println("the result is pass"); }
        else {
            System.out.println("the result is fail"); }
        System.out.println("the grade is");
        if((maths+science+english)/(3)>=80){
            System.out.println("A+"); }
        else if (((maths+science+english) /(3)>=60)){
            System.out.println("A"); }
        else if (((maths+science+english) / (3)>=50)){
            System.out.println("B"); }
        else if (((maths+science+english) / (3)>=40)){
            System.out.println("C"); }

    }
}
