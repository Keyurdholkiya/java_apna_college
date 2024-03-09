public class SubsetsFind {
    public static void subSets(String str , int index ,String newStr){
        //base case
        if (index == str.length()){
            System.out.println(newStr);
            return;
        }
        subSets(str,index+1,newStr+str.charAt(index));
        subSets(str,index+1,newStr);
    }
    public static void main(String []args){
        String str = "abc";
        subSets(str,0,"");
    }
}
