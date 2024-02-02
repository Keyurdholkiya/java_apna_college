public class RemoveDuplicatesString {
    public static void removeDuplicateString(String name,StringBuilder newName,boolean []arr,int index){
        if (index == name.length()){
            System.out.print(newName.toString());
            return;
        }
        char chr = name.charAt(index);
        if (arr[chr - 'a'] == true){
            removeDuplicateString(name,newName,arr,index+1);
        }else {
            arr[chr - 'a'] = true;
            removeDuplicateString(name,newName.append(chr),arr,index+1);
        }
    }

    public static void main(String[] args) {
        String name = "hymynameisskkkeyurdhholkiyaviipulkumar";
        removeDuplicateString(name,new StringBuilder(""),new boolean[26],0);
    }
}
