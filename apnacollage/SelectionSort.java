import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SelectionSort {
    public static void main(String[] args) {
        Integer []arrs = {1,5,9,4,6};
        Arrays.sort(arrs,Collections.reverseOrder());
//        for (int i = 0 ; i < arr.length-1;i++){
//            int line = i;
//            for (int j = i+1 ; j < arr.length-1;j++){
//                if (arr[line] < arr[j]){
//                    line = j;
//                }
//            }
//            int temp = arr[line];
//            arr[line] = arr[i];
//            arr[i]  = temp;
//        }
        for (int i =0 ; i < arrs.length ; i++){
            System.out.print(arrs[i]+" ");
        }
    }
}
