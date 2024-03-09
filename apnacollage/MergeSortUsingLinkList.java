public class MergeSortUsingLinkList {
    static class Node{
        int data;
        Node next ;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node getMiddle(Node head){
        Node slow = head ;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node merging(Node head){
        if (head == null || head.next == null){
            return head;
        }
        //get middle node
        Node middle = getMiddle(head);
        Node rightHead = middle.next;
        middle.next = null;
        Node newLeft = merging(head);
        Node newRight = merging(rightHead);
        return merge(newLeft , newRight);
    }
    public static Node merge(Node newLeft , Node newRight){
        Node newNode = new Node(-1);
        Node temp = newNode ;
        while (newLeft != null && newRight != null){
            if (newLeft.data <= newRight.data){
                temp.next = newLeft;
                newLeft = newLeft.next;
                temp = temp.next;
            }else {
                temp.next = newRight;
                newRight = newRight.next;
                temp = temp.next;
            }
        }
        while (newLeft != null){
            temp.next = newLeft;
            newLeft = newLeft.next;
            temp = temp.next;
        }
        while (newRight != null){
            temp.next = newRight ;
            newRight = newRight.next;
            temp = temp.next;
        }
        return newNode.next;
    }
    public static void main(String []args){
        Node head = new Node(1);
        Node newNode = new Node(11);
        head.next = newNode;
        newNode = new Node(9);
        head.next.next = newNode;
        newNode = new Node(10);
        head.next.next.next = newNode;
        Node result = merging(head);
        while (result != null){
            System.out.println(result.data);
            result = result.next;
        }
    }
}
