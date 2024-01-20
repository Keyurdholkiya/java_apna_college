public class PalindromicStringInTheArray {
    public static void main(String[] args) {
        String []words = {"abc","car","racecar","cool"};
        for (String word : words) {
            if (ispalindrome(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean ispalindrome(String name ) {
        int l = 0;
        int r = name.length()-1;
        while (l<=r){
            if (name.charAt(l)!=name.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
