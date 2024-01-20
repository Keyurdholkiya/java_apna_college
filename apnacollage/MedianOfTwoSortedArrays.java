import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int []arr1 = {1,3};
        int []arr2 = {2};
        int count = 0;
        int []arr3 = new int[5];
        int storage = 0;
        for (int i = 0;i<arr1.length;i++){
         for (int j = 0;j<i;j++){
             storage = arr1[i];
             storage += arr2[j];
         }
            System.out.println(storage);
        }
    }
}
