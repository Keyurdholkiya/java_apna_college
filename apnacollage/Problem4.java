public class Problem4 {
    public static int average(int a , int b, int c){
        int sum = a+b+c;
        return sum/3;
    }
    public static boolean isPrime(int a){
        if (a%2==0){
            return true;
        }
        return false;
    }
    public static void rangeEven(int a) {
        for (int i = 0;i<a;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void palindromeNumber(int n){
        int copyNum = n;
        int reverse =0;
        while (n>0){
            int last = n%10;
            reverse = (reverse*10)+last;
            n/=10;
        }
        if (reverse == copyNum){
            System.out.println(copyNum+" is palindrome number "+reverse);
        }else{
            System.out.println(copyNum+" is  not palindrome number ");
        }
    }
    public static void sumOfNumber(int num){
        int sum = 0;
        while (num != 0){
            int last = num%10;
            sum+= last;
            num/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
//        System.out.println(average(10,20,30));
//        System.out.println(isPrime(3));
//        rangeEven(20);
        palindromeNumber(555);
        sumOfNumber(123);
    }
}
