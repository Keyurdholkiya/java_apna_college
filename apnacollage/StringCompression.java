public class StringCompression {
    public static void stringCompression(String name){
        StringBuilder finalName = new StringBuilder();
        for (int i = 0 ; i < name.length(); i++ ){
            int count = 1;
            while (i<name.length()-1 && name.charAt(i) == name.charAt(i+1)){
                count++;
                i++;
            }
            finalName.append(name.charAt(i));
            if (count > 1){
                finalName.append(count);
            }
        }
        System.out.println(finalName);
    }
    public static void main(String[] args) {
        String number  = "kkkeeeyyyuuurrr";
        stringCompression(number);
    }
}
