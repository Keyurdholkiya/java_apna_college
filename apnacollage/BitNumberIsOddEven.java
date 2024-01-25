import java.util.Scanner;

public class BitNumberIsOddEven {
    public static void oddEven(int num){
        int bitMask = (num & 1);
        //System.out.println(bitMask);
        if (bitMask == 1){
            System.out.println("number is odd");
        }else {
            System.out.println("number is even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number := ");
        int a = sc.nextInt();
        oddEven(a);
    }
}
