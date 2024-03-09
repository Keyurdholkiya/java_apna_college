import java.util.Stack;

public class ReverseStringUsingStack {
    public static void reverse(String s , int index){
        Stack<Character> sc = new Stack<>();
        if (index == s.length()){
            return;
        }
        sc.push(s.charAt(index));
        reverse(s,index+1);
        StringBuilder se = new StringBuilder("");
        se.append(sc.pop());
        System.out.println( se.toString());
    }
    public static  void pushBottom (Stack<Integer> sd,int data){
        if (sd.isEmpty()){
            sd.push(data);
            return;
        }
        int top = sd.pop();
        pushBottom(sd,data);
        sd.push(top);
    }
    public  static void reverse(Stack<Integer> sc){
        if (sc.isEmpty()){
            return;
        }
        int top = sc.pop();
        reverse(sc);
        pushBottom(sc,top);
    }
    public static void main(String[] args) {
//        String s = "keyur";
//        reverse(s,0);
        Stack<Integer> ke = new Stack<>();
        ke.push(1);
        ke.push(2);
        ke.push(3);
        reverse(ke);
        while (!ke.isEmpty()){
            System.out.println(ke.pop());
        }
    }
}
