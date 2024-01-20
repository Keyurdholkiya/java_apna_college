package problemsolve;
public class SplittingString {
        public int maxScore(String s) {
            int ans = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                int curr = 0;
               // System.out.println("i :=  "+i);
                for (int j = 0; j <= i; j++) {
                    //System.out.println("j := "+j);
                    if (s.charAt(j) == '0') {
                        curr++;
                    }
                   // System.out.println(j);
                }
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == '1') {
                        curr++;
                    }
                }
                ans = Math.max(ans, curr);
            }
            return ans;
        }
    public static void main(String[] args) {
        SplittingString sp = new SplittingString();
        System.out.println(sp.maxScore("00111"));
    }
}
