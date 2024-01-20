package problemsolve;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        problemsolve.SplittingString sc = new problemsolve.SplittingString();
//        sc.main(args);
        System.out.println(sc.maxScore("00111"));
        PatternsSolved dr = new PatternsSolved();
        dr.main(args);
        int []arr = {10,20,30,40,50,60,70,80,90};
        byte first= 0;
        int last=arr.length-1;
        //10,20,30,40,50,60,90
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j);
            System.out.print(" ");
        }
        for (byte i = 0 ; i <arr.length ; i++){
            if (arr[first] < arr[last]){
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
        }
        System.out.println();
        for (int j : arr) {
            System.out.print(j);
            System.out.print(" ");
        }
    }
}
