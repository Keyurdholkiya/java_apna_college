
class Sum {
    static int a = 10;
   static  int b = 20;
   static  int c = a+b;

    public static void main(String[] args) {
        System.out.println(c);
        PrintFirstClass.main(args);
    }
}class First {
     class element {
       static int a = 10;
       static  int b = 30;
        static int k = a + b;
    }
    public  static void main(String[] args) {
        //object
//        element el = new element();
//        System.out.println(el.k);
        //using static
        System.out.println(element.k);
        Sum.main(args);
    }
}
class PrintFirstClass{
    public static void main(String[] args) {
        System.out.println("hy i am first class sum := "+Sum.c);
    }
}