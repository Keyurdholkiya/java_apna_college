public class MinMaxNumberinArray {
    public static void main(String[] args) {
        int []arr = {10,90,50,7,96,100};
        int min = arr[0];
        System.out.println(min);
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }
}
