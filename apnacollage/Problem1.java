import java.util.Scanner;

public class Problem1 {
    public static void main(String []args){
        //this is bulate plat
        /*
        Question1:In a program,input3 numbers:A,B and C.You have to output the average of these 3 numbers.
        (Hint : Average of N numbers is sum of those numbers divided by N)
         */
         Scanner sc = new Scanner(System.in);
        //System.out.print("enter the  number  a := ");
         //int a = sc.nextInt();
       // System.out.print("enter the number  b := " );
        // int b = sc.nextInt();
        //System.out.print("enter the number c := ");
        //int c = sc.nextInt();
        //int average = (a+b+c)/3;
        //System.out.println("average is := "+average);

        /*
        Question2:In a program,input the side of a square.
        You have to output the area of the square.
        (Hint : area of a square is (side x side))
         */
        //System.out.print("Enter the side of square := ");
        //int side = sc.nextInt();
       // System.out.println("The area of square is := "+ (side*side));

        int  pencil =(int) sc.nextFloat();
        int pen = (int)sc.nextFloat();
       // float eraser = sc.nextFloat();
        float total = (pencil+pen);
        System.out.println(total);
        //add GST
        float gst = total+(0.18f*total);
        System.out.println(gst);

        /*
        byte b = 4;
        int $ = 45;
        System.out.println($);
        char c = 'a';
        short s = 512;
        int i =1000;
        float f = 3.14f;
        double d = 99.9954;
        System.out.println((f*b)+(i%c)-(d*s));
        $= 100;
        System.out.println($);
         */
        System.out.print("Product price := ");
        int product = sc.nextInt();
        System.out.print("Product price := ");
        int product1 = sc.nextInt();
        int sum = product+product1;
        System.out.print("Enter GST");
        float a = sc.nextFloat();
        float GST = sum+(a*sum);
        System.out.println(GST);

    }
}
