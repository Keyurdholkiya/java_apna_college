public class ReverseStringUsingResursion {
    public static void Strings(int index , String name){
        if (index == 0){
            System.out.println(name.charAt(index));
            return;
        }
        System.out.print(name.charAt(index));
        Strings(index-1,name);
    }

    public static void main(String[] args) {
        String name = "keyur";
        Strings(name.length()-1,name);
    }
}
