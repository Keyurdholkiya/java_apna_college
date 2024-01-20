import javax.swing.*;
import java.util.Enumeration;

public class FindMaximumNumberOfStringPair {
    public static void main(String[] args) {
        int ans = 0;
        String []word  = {"cd","ac","dc","ca","zz"};
        for (int i = 0 ; i < word.length ; i++){
           for (int j = i+1; j < word.length ; j++){
               if (word[i].equals(reverse(word[j]))){
                   ans++;
               }
           }
       }
        System.out.println(ans);
    }
    public static String reverse(String name){
        String ans = "";
        ans += name.charAt(1);
        ans += name.charAt(0);
        return ans;
    }
}
