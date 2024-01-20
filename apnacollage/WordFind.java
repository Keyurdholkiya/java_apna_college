package problemsolve;
import java.util.Scanner;

public class WordFind {
    public static void main(String[] args) {
        //String []words  ={"priyal","prachi"};
//        Scanner sc = new Scanner(System.in);
//        char word = 'k';
//        for (int i = 0 ; i<name.length; i++) {
//            for (int j = 0; j < name[i].length(); j++) {
//                if (word == name[i].charAt(j)) {
//                    System.out.println("name := "+ name[j]);
//                }
//            }
//        char word = 'a';
//        for(int i=0;i<words.length;i++){
//            for(int j=0;j<words[i].length();j++){
//                if(words[i].charAt(j) == word){
//                    System.out.println(words[i]);
//                    break;
//                }
//
//            }
//        }
        String name = "keyur";
        for (int i = 0 ; i<name.length();i++) {
            if (i == 0) {
                System.out.println(name.charAt(i));
            } else {
                break;
            }
        }

        }
    }

