public class NumberConvertLetter {
    public static String []number={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void numberToLetter(String name,int index){
        if (index == name.length()){
            return;
        }
        char names = name.charAt(index);
        String result = number[names - '0'];
        System.out.println(result);
        numberToLetter(name,index+1);
    }
    public static void numberTo(int numbers){
        if (numbers == 0){
            return;
        }
        int last = numbers%10;
        String result =  number[last];
        numberTo(numbers/10);
        System.out.println(result);
    }
    public static void lengthOfString(String name,int index){
        if (index == name.length()){
            System.out.println(index);
            return ;
        }
        lengthOfString(name,index+1);
    }

    public static void main(String[] args) {
        String number = "1947";
        int numbers = 1947;
        numberTo(numbers);
       // numberToLetter(number,0);
        //lengthOfString(number,0);
    }
}
