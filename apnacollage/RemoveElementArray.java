package problemsolve;

import javax.swing.*;

public class RemoveElementArray {
    public static void main(String[] args) {
        int []arr = {3,2,2,3};
        int val = 3;
        int []new_arr = new int[5];
        int index = 0;
        for (int i= 0 ;i<arr.length ; i++){
            if (arr[i] != 3){
                new_arr[index] = arr[i];
                index++;
            }
        }
        for (int i : new_arr){
            System.out.println(i);
        }
    }
}
