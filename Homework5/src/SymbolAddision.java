import java.util.Scanner;

public class SymbolAddision {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter any number ");
            int a = scanner.nextInt();
            System.out.println("Please enter any number");
            int b = scanner.nextInt();
            System.out.println("Enter the symbol");
            char c = scanner.next().charAt(0);
            if(c == '+'){
                System.out.println("addition of two number:"+ (a+b)); }
            else if(c == '*'){
                System.out.println("multiplication of two number:"+ (a*b)); }
            else if(c == '-'){
                System.out.println("subtraction  of two number:"+ (a-b)); }
            else if(c == '/'){
                System.out.println("Division  of two number:"+ (a/b)); }
            else{System.out.println("invalid input");}
    }
}
