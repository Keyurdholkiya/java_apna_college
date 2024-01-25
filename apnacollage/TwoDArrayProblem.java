import java.util.Scanner;

public class TwoDArrayProblem {
    public static void problemOne(){
        int [][]arr = {{4,7,8},{8,8,7}};
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[0].length;j++){
                if (arr[i][j] == 7){
                    sum = j;
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = {{1,4,9},{11,4,3},{2,2,3}};
        int row = 1 , col = 0 , sum = 0;
        while (col < arr[0].length){
            sum+= arr[row][col];
            col++;
        }
        System.out.println(sum);
    }
}
