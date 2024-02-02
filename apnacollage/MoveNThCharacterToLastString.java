public class MoveNThCharacterToLastString {
    public static void moveCharacterToLast(String name,int count,int index,StringBuilder element){
        if (index == name.length()){
            for (int i= 0 ; i <count;i++){
                element.append('e');
            }
            System.out.println(element.toString());
            return;
        }
        char elements = name.charAt(index);
        if (elements == 'e'){
            count++;
            moveCharacterToLast(name,count,index+1,element);
        }else {
            moveCharacterToLast(name,count,index+1,element.append(elements));
        }
    }
    public static void main(String[] args) {
        String name = "keeeyur";
        moveCharacterToLast(name,0,0,new StringBuilder());
    }
}
