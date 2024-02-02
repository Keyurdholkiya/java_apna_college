public class ConverLettersToUpperCase {
    public static void convertToEachLetterToUpperCase(String name){
        StringBuilder addName = new StringBuilder("");
        addName.append(Character.toUpperCase(name.charAt(0)));
        for (int i = 1 ; i < name.length() ; i++){
            if (name.charAt(i) == ' ' && i < name.length()-1){
                addName.append(name.charAt(i));
                i++;
                addName.append(Character.toUpperCase(name.charAt(i)));
            }else {
                addName.append(name.charAt(i));
            }
        }
        System.out.println(addName);
    }
    public static void main(String[] args) {
        String name = "hy, my name is keyur how are your";
        convertToEachLetterToUpperCase(name);
    }
}
