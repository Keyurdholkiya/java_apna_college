import java.util.Stack;

public class DuplicateParenthese {
    public static boolean isVail(String s){
        Stack<Character> sc = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == ')'){
                int count=0;
                while (sc.peek() != '('){
                    sc.pop();
                    count++;
                }
                if (count < 1){
                    return true;
                }else {
                    sc.pop();
                }
            }else {
                sc.push(c);
            }
        }
       return false;
    }
    public static void main(String[] args) {
        String s = "(((((a+b))";
        System.out.println(isVail(s));
    }
}
