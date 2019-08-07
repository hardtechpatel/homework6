import java.util.Scanner;

public class AlfaSymbol{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any alphabet in uppercase :");
        String name = scanner.next();
        System.out.println(name.toLowerCase());
    }
}
