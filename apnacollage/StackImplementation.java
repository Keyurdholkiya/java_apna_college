import java.util.ArrayList;

public class StackImplementation {
    static class Node{
        int data;
        Node next;
    }
   static  class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0 ;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String []args){
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
