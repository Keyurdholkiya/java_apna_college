public class CountingWordsWithGivenPrefix {
    public static void factorial(int n ,int j){
        int fac = 1;
        int fac2 = 1;
        int fact3 = 1;
        for (int i = n ; i >= 1 ; i--){
            fac*=i;
        }
        for(int i = j ; i>=1;i--){
            fac2*=i;
        }
        for (int i = n-j ; i>=1;i--){
            fact3*=i;
        }
        int condition = (fac/(fac2*fact3));
        System.out.println(condition);
    }
    public static void main(String[] args) {

//        String []names = {"pay","attention","practice","attend"};
//        String find = "at";
//        int count = 0;
//        int ans = 0;
//        for (int i = 0; i < names.length; i++){
//            int j = 0;
//            for (j = 0 ; j <names[i].length();j++){
//                    count++;
//               }
//            }
//            int n=0;
//            for ( n= 0; n < find.length();n++){
//                ans++;
//            }
//            if ()
//        }
        //System.out.println(count);
    }
}
