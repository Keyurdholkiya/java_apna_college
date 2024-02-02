public class Recursion {
    public static void decreaseNumber(int num){
        if (num == 1){
            System.out.print(1+" ");
            return;
        }
        decreaseNumber(num-1);
        System.out.print(num+" ");
    }
    public static int factorialNumber(int num){
        if (num == 0){
            return 1;
        }
        int upper = factorialNumber(num-1);
        int down =  num * upper;
        return down;
    }
    public static int sumOfNaturalNumber(int num){
        if (num == 1){
            return 1;
        }
        int upperSmall = sumOfNaturalNumber(num-1);
        int sum = num + upperSmall;
        return sum;
    }
    public static int fibonacciNumber(int num ){
        //int second = 1;
        if (num == 0 || num == 1){
            //System.out.print(num+" ");
            return num;
        }
        int sum = fibonacciNumber(num-1) + fibonacciNumber(num-2);
//        int sums = fibonacciNumber(num-2);
//        int ans = sum + sums ;
        return  sum ;
    }
    public static boolean sortedArray(int []arr , int i ){
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }
        return sortedArray(arr,i+1);
    }
    public static void keyFind(int []arr,int key,int i){
        if (i == 0){
            return;
        }
        if (arr[i] == key){
            System.out.println(i);
            return;
        }
        keyFind(arr,key,i-1);
    }
    public static int  power(int x,int n){
        if (n == 0){
            return 1;
        }
        int pow = power(x,n-1);
        int power = x*pow;
        return power;
    }
    public static void main(String[] args) {
        int num = 6 ;
        int []arr  = {1,10,3,10,5,10,7,10,9};
        System.out.println(power(10,2));
        //keyFind(arr,10, arr.length-1);
        //System.out.println(sortedArray(arr,0));
        //decreaseNumber(num);
       // System.out.println( factorialNumber(num));
       // System.out.println(sumOfNaturalNumber(num));
       // System.out.println(fibonacciNumber(num));

    }
}
