import java.lang.reflect.Array;
import java.util.Arrays;

public class KadansAlgorithms {
    public static void main(String[] args) {
        int []arr = {-2,-3,-4,-1,-2,-9,-5,-3};
        int small = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            int k = arr[i];
            small=Math.max(small,k);
        }
        System.out.println(small);


    }
}
