import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        //question 1
//        for(int i=0;i<5;i++) {
//            System.out.println("Hello");
//            i+=2;
//        }
        //question 2 step 1 ;
        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int sum2 = 0;
//        System.out.print("enter the number to print sum of even and odd number := ");
//        int num = sc.nextInt();
//        for (int i = 0;i < num; i++){
//            if (i%2 == 0){
//                System.out.println("even number := "+i);
//                sum += i;
//            }else {
//                System.out.println("odd number := "+i);
//                sum2+=i;
//            }
//        }
//       System.out.println("even number sum := "+sum);
//        System.out.println("odd number sum := "+sum2);
        //question 3
//
        //question 4
//        int num = sc.nextInt();
//            for (int j = 1 ; j<= 10; j++ ){
//                System.out.println(num+"*"+j+"="+(num*j));
//            }


        //question 2 step 2 ;
        int sumOdd = 0;
        int sumEven = 0;
        boolean value = true;
        do {
            System.out.print("enter the number := ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("even number := "+num);
                sumEven += num;
            } else {
                System.out.println("odd number := "+num);
                sumOdd += num;
            }
            while (true) {
                System.out.print("enter the number to continue 1 close the 0 := ");
                char choice = sc.next().charAt(0);
                if (choice == '0') {
                    value = false;
                    break;
                }
                else if (choice == '1'){
                    value = true;
                    break;
                }
                else {
                    continue;
                }
            }
            if (value == false){
                break;
            }
        } while (value == true);
        System.out.println("sum of the even number := "+sumEven);
        System.out.println("sum of the odd number := "+sumOdd);
    }
}
