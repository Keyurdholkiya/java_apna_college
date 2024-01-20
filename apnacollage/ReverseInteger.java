public class ReverseInteger {
    public static void main(String[] args) {
        int num = 123456;
        while (num>0){
            int lastElement = num%10;//locate unit place
            System.out.print(lastElement);
           // rev = (rev*10)+lastElement;//6*10=60+5=65,65*10=650+4=654
            num /= 10;//remove unit place element
            //System.out.println(num);
        }
    }
}
