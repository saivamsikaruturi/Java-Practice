import java.util.Arrays;

public class SwapAdjacentElementsInAnArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        int i;
        for( i=0;i<(array.length/2);i+=2) {

            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        System.out.println (Arrays.toString (array));
    }

}
