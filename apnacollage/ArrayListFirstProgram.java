import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFirstProgram {
    public static int maximumElementInArrayList(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < list.size() ; i++){
            if (max < list.get(i)){
                max = list.get(i);
            }
            //max = Math.max(max , list.get(i));
        }
        return max;
    }
    public static void sortTricks(ArrayList<Integer> list){
        Collections.sort(list);//ascending  order
        Collections.sort(list , Collections.reverseOrder());//descending order
    }
    public static void arrayListOperations(ArrayList<Integer> list){
        list.remove(2);
        list.set(2,90);
        boolean answer = list.contains(30);
        System.out.println(answer);
        System.out.println(list);
    }
    public static void printArrayList(ArrayList<Integer> list){
        for (int i = 0 ; i < list.size() ; i++) {
            //list.get(i)
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void swapArrayListElement(ArrayList<Integer> list , int index1 , int index2){
        int temp = list.get(index1);
        list.set(index1 , list.get(index2));
        list.set(index2 , temp);
        System.out.println(list);
    }
    public static void main(String []args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        System.out.println(maximumElementInArrayList(list));
        System.out.println(list);
        //sortTricks(list);
        //System.out.println(list);
        swapArrayListElement(list,0,2);
        //System.out.println(list);
    }
}
