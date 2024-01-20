package problemsolve;
public class FindOfIndext {

    public int element(String name,String name2){
//        String name = "sadbutsad";
//        String name2 = "sad";
        for (int j = 0; j < name.length()-4; j++) {
            for (int k = 0; k < name2.length(); k++) {
                if (k == 3){
                    break;
                }
                if (name.charAt(j) == name2.charAt(k)) {
                    System.out.println(name.charAt(j)+" "+name2.charAt(k));
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindOfIndext fd = new FindOfIndext();
        int result = fd.element("sadbutsad","sad");
        System.out.println(result);
//        String []word1 = {"ab","c"};
//        String []word2 = {"a","bc"};
//        StringBuilder com= new StringBuilder();
//        StringBuilder com2= new StringBuilder();
//        for (int i=0;i<word1.length;i++){
//            com.append(word1[i]);
//        }
//        System.out.println(com);
//        for (int j=0;j<word2.length;j++){
//            com2.append(word2[j]);
//        }
//        System.out.println(com2);
    }
}
