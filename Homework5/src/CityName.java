import java.util.Scanner;
// find out city name
public class CityName {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F");
        char z = scanner.next().charAt(0);
        if(z == 'a'||z == 'A') {
            System.out.println("the city is Ahmedabad"); }
        else if(z == 'b'||z == 'B'){
            System.out.println("the city is Baroda "); }
        else if(z == 'c'||z == 'C'){
            System.out.println("the city is Canor"); }
        else if(z == 'd'||z == 'D') {
            System.out.println("the city is Delhi"); }
        else if(z == 'e'||z == 'E') {
            System.out.println("the city is Emreli"); }
        else if(z == 'f'||z == 'F') {
            System.out.println("the city is Fatehganj");}
        else{
            System.out.println("invalid entry"); }
    }
}


