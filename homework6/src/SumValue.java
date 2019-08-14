public class SumValue {

    //finding sum value
    public static void main(String[] args) {
        int[] array = {50, 85, 8, 15,36};
        int num = 0;

        for (int i : array)
            num += i;
        System.out.println("The sum is" + num);
    }
    }

