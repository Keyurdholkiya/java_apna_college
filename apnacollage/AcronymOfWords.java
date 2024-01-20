import java.util.StringJoiner;

public class AcronymOfWords {
    public static void main(String[] args) {
        String []word = {"apple","bob","cat"};
        String name ="abc";
        StringBuilder result = new StringBuilder();
        for (int i = 0;i <word.length;i++){
            //System.out.println(word[i]);
            for (int j=0;j<word[i].length()-1;j++){
                if (j == 0){
                    result.append(word[i].charAt(j));
                }
            }
        }
        System.out.println(result);
        System.out.println(name);
        if (name.compareTo(String.valueOf(result)) == 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        String sentence = "hello how are you contestant";
        System.out.println(sentence.length());
    }
}
