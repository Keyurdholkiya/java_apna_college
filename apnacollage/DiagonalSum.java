public class DiagonalSum {
    public static int  sumOfTheArray(int [][]arr){
        int sum = 0;
        int start = 0;
        int end = arr.length-1;
        for (int i = 0 ; i < arr.length; i++){
            sum+=arr[i][end];
            sum-=arr[i][start];

        }
        return sum;
    }
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(sumOfTheArray(arr));
    }
}
