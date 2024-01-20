public class LongestCommonPrefix {
    public static void main(String[] args) {
        String []arr = {"flower","flow","flight"};
        String s1  = arr[0];
        String s2  = arr[1];
        String s3 = arr[2];
        int i = 0;
        while (i<s1.length()&&i<s2.length()&&i<s3.length()){
            if (s1.charAt(i) == s2.charAt(i)&&s2.charAt(i) == s3.charAt(i)){
                i++;
            }else {
                break;
            }
        }
        //System.out.println(i);
        System.out.println(s1.substring(0,i));

//        for (int i = 0 ; i <arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }
}
