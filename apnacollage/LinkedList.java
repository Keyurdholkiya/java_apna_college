public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head =  tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ---> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addMiddle(int index,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int search(Node head , int key){
        if (head == null){
            return -1;
        }
        if (head.data == key){
            return 0;
        }
        int index = search(head.next,key);
        return index+1;
    }
    public int helper(int key){
        return search(head,key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public int size(){
        Node temp = head;
        int size = 0;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public void removeFirst(){
        head = head.next;
    }
    public void removeLast(){
        Node temp = head;
        Node second = head.next;
        while (second.next != null){
            second = second.next;
            temp = temp.next;
        }
        temp.next = null;
    }
    public int searching(int key){
        Node temp = head;
        int size = 0 ;
        while (temp !=  null){
            size++;
            if (temp.data == key){
                return size;
            }
            temp = temp.next;
        }
        return -1;
    }
    public Node middle(){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Boolean palindrome(){
        Node middle = middle();
        Node prev = null;
        Node curr = middle;
        Node next;
        while (curr!= null){
//            next = curr.next;
//            curr.next = prev;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        while (right != null && right.next != null){
            if (left.data == right.data){
                return true;
            }
            left = left.next;
            right = right.next;
        }
        return false;
    }
    public static  Boolean circular (){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       // LinkedList ll = new LinkedList();
        head = new Node(2);
        head.next = new Node(3);
        //Node newNode  = new Node(6);
        head.next.next = new Node(5);
        head.next.next.next = head;
        System.out.println(circular());
        //LinkedList ll = new LinkedList();
        //ll.addFirst(1);
        //ll.printList();
        //ll.addLast(2);
        //ll.addLast(2);
        //ll.addLast(1);
       // System.out.println(ll.palindrome());
       // ll.removeLast();
        //ll.removeFirst();
        //System.out.println(ll.searching(100));
        //ll.printList();
       // System.out.println(ll.size());
        //ll.addMiddle(0,9);
//        ll.reverse();
//        ll.printList();
       // System.out.println(ll.helper(12));

    }
}
