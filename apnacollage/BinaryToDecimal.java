public class BinaryToDecimal {
    public static void BinaryConvertor(int num){
        int ans = 0;
        int power = 0;
        while (num > 0){
            int last = num%10;
            ans += (int) (last*Math.pow(2,power));
            num/=10;
            power++;
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        BinaryConvertor(1000);
    }
}
