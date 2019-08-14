import java.util.Scanner;

public class CoutnTotalNumber {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Enter a word :");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (int i=0 ; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'a'){
                num ++;
            }
        }
        System.out.println("Number of a in the sentence is "+num);

            }}






