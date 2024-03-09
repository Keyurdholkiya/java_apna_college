import java.util.Stack;

public class ValidPareenthese {
    public static boolean validBracket(String s){
        Stack<Character> sc  = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{'){
                sc.push(c);
            }else {
                if (sc.peek() == '(' && c == ')'
                || sc.peek() == '{' && c == '}'){
                    sc.pop();
                }
            }
        }
        if (sc.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(validBracket(s));
    }
}
