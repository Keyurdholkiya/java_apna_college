public class DeleteNNodesAfterMNodesofALinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static void solution(Node head,int m , int n ){
        Node temp = head;
        System.out.println(temp.data);
        while (temp != null){
            for (int i = 1 ; i < m ; i++){
                //System.out.println("i := "+ i);
                temp =temp.next;
                System.out.println(temp.data);
                if (temp == null){
                    return;
                }
            }
            for (int j = 0 ; j < n ; j++){
                System.out.println("j := "+ j);
                temp.next = temp.next.next;
                //System.out.println(temp.next.data);
            }
            temp = temp.next;
            System.out.println(temp.data);
        }
    }

    public static void main(String []args){
        Node head = new Node(1);
        Node newNode = new Node(2);
        head.next = newNode;
        newNode = new Node(3);
        head.next.next = newNode;
        newNode = new Node(4);
        head.next.next.next = newNode;
        newNode = new Node(5);
        head.next.next.next.next = newNode;
        newNode = new Node(6);
        head.next.next.next.next.next = newNode;
        newNode = new Node(7);
        head.next.next.next.next.next.next = newNode;
        newNode = new Node(8);
        head.next.next.next.next.next.next.next = newNode;
        solution(head,2,2);


    }
}
