import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = new int[3][3];
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int max=0;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("maximum number in array "+ max);
    }
}
