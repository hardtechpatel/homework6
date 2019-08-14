import java.lang.reflect.Array;
import java.util.Arrays;

public class NumericStrring {
    public static void main(String[] args) {

        int [] array1 = {27, 879, 759, 8561};
        String[] array2 = {"home", "house", "bungalow", "flat"};
        System.out.println("numeric array : "+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array :" + Arrays.toString(array1));
        System.out.println("string array :" + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("sorted string array : " + Arrays.toString(array2));
    }
}
