public class SubString {
    public static void subString(String name){
        for (int i = 0 ; i < name.length();i++){
            for (int j = i ; j <= name.length();j++){
                for (int k = i ; k < j ; k++){
                    System.out.print(name.charAt(k));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void secondSubString(String name,int start,int end){
        for (int i = start ; i < end ; i++){
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String name = "keyur";
        subString(name);
        secondSubString(name,0,2);
    }
}
