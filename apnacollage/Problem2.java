import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        /*
        int x = 2;
        int b = 5;
        int result = (x*b/x); // 5
        int result2 = (x*(b/x)); // 4
        System.out.println(result);
        System.out.println(result2);
         */
//        int  x , y , z ;
//        x =  y = z = 2;
//         z /= (x+y);
//        System.out.println((float) z);
        Scanner sc = new Scanner(System.in);
//        int i = 10;
//        while (i > 0) {
//            System.out.print("enter the number : = ");
//            int number = sc.nextInt();
//            if (number > 0) {
//                System.out.println(number + " is positive");
//            } else if (number == 0) {
//                System.out.println(number + " is center number");
//            } else {
//                System.out.println(number + " is nagative");
//            }
//            i--;
//        }


//        double temperature = 100.2;
//        if (temperature < 100.0)
//            System.out.println("you are healthy");
//        else
//            System.out.println("you are sick person");


        System.out.print("enter the years := " );
        int years = sc.nextInt();
        if (years%4 == 0){
            if (years%100 == 0){
                if (years%400 == 0){
                    System.out.println("leap years");
                }else {
                    System.out.println("not leap years");
                }
            }else {
                System.out.println("leap years");
            }
        }else {
            System.out.println("not leap years");
        }

        boolean x = (years%4) ==0;
        System.out.println(x);
    }
}

