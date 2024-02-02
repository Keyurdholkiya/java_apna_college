public class KeypadCombination {
    public static String []key = {".","abc","def","jkl","mno","pqrs","tu","vwx","yz"};
    public static void oldPhoneKeypad(String number,int index,StringBuilder newString){
        if (index == number.length()){
            System.out.println(newString);
            return;
        }
        char curr = number.charAt(index);
        String map = key[curr - '0'];
        for (int i = 0 ; i < map.length() ; i++){
            oldPhoneKeypad(number,index+1,newString.append(map.charAt(i)));
        }
    }

    public static void main(String[] args) {
        String number = "23";
        oldPhoneKeypad(number,0,new StringBuilder());
    }
}
