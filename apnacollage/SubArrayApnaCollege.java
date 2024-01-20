public class SubArrayApnaCollege {
    public static void printSubArray(int[] number){
        int sum2 = 0;
        for (int i = 0 ; i <number.length;i++){
            for (int j = i ; j <number.length;j++ ){
                int sum = 0;
                for (int k = i ; k<=j ; k++){
                    System.out.print(number[k]+" ");
                    sum+=number[k];
                    sum2 = sum;
                }
                System.out.print(Math.max(sum2,sum));
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int []arrays = {2,4,6,8,10};
        printSubArray(arrays);
    }
}
