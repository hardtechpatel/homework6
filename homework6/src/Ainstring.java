import java.util.Scanner;

public class Ainstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wright the String; ");
        String line = sc.nextLine().toLowerCase();
        System.out.print("Number of  a in the string: " + line);
        char c = sc.next().toLowerCase().charAt(0);
        int cn = 0;
        for (int i=0; i<line.length(); i++) {
            if (c == line.charAt(i)) {
                cn++;
            }
        }
        System.out.println(c + "is in the line for"+ cn + "in the" + line);
        sc.close();
    }
}
