public class PalindromeNumber {
    public static void main(String[] args) {
        int name = 121;
        int name2 = name;
        int sum = 0;
        while(name >0){
            int rem = name%10;
            sum = (sum*10)+rem;
            name/=10;
        }
        System.out.println(sum);
        System.out.println(sum==name2);
    }
}
