public class OperationInBits {
    public static void getIthBit(int n,int i){
//        int bit = (n&(1<<i));
//        System.out.println(bit);
        int bitMask = 1 << i;
        if ((n&bitMask) == 0){
            System.out.println("in the"+n+"bit place"+i+"bit is 0");
        }else {
            System.out.println("bit is 1");
        }
    }
    public static void setIthBit(int num , int index){
        int bit = (num|(1<<index));
        System.out.println(bit);
        getIthBit(bit,1);
    }
    public static void clearIthBit(int num , int position){
        int bitMask = (num & (~1<<position));
        System.out.println(bitMask);
        System.out.println("positon " + position +" bit is clear" );
    }
    public static void updateIthBit(int num , int potion , int newValue){
        if (newValue == 0){
            clearIthBit(num,potion);
        }else {
            setIthBit(num,potion);
        }
        //method 2
      //  num = clearIthBit(num,potion);

    }
    public static void main(String[] args) {
//        getIthBit(5,1);
//        setIthBit(5,2);
        updateIthBit(5,0,0);
    }
}
