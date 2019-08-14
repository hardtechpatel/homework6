public class Duplicate {
    public static void main(String[] args) {
        int [] array = new int []{1,2,3,4,8,2,3,4};
        for (int i=1; i<8;i++){
            for (int j =i+1; j<8; j++){
                if(array[i]==array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
