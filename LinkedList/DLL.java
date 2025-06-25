package LinkedList;

public class DLL {
     private Node head;
     private Node tail;

     //insert first
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
       if(head != null){
           head.prev = node;
       }
        head = node;
    }

    //display method with the reverse the DLL
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }

        System.out.println("END");
        revList(head);
        System.out.println("START");


        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }

        System.out.println("START");
    }

    //reverse the linked list using the recursion
    public void revList(Node head){
        if(head == null){
            return;
        }
        revList(head.next);
        System.out.print(head.val + " -> ");

    }

    //insert the element at last
    public void insertLast(int val){
        Node temp = head;
        if(head==null){
            insertFirst(val);
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        Node node = new Node(val );

        node.next = null;
        node.prev = temp;
        temp.next = node;
        tail = node;
    }


    class Node{
       private int val;
       private Node next;
       private Node prev;


        Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;

        }
    }

}
