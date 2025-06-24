package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public int delete(int index){
        if(index==0){
           return deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);

        int val = prev.next.value;

        prev.next = prev.next.next;

        size--;

        return val;

    }

    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node lastSec = get(size-2);
        int val = tail.value;;
        tail  = lastSec;
        tail.next = null;

        size--;

        return val;
    }


    public Node get (int index){
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public int deleteFirst(){
        int value  = head.value;
        head = head.next;

        if(head==null){
            tail = null;
        }

        size--;

       return value;

    }

    public void insert(int val , int index){
        if(index==0){
            insertFirst(val);
            return;
        }

        if(index==size){
            insertLast(val);
            return;
        }

        Node temp = head;

        for(int i = 1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(val , temp.next);
        temp.next = node;
        size+=1;

    }


    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size+=1;
    }

    //insert the element at first of the LL
    public void insertFirst(int val){
        Node node = new Node(val);

        node.next = head;
        head = node;

        if(tail==null){
            tail=head;
        }

        size+=1;

    }

    //display the linked list using the display method
    public void display(){
        Node temp  = head;

        while(temp!=null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }

        System.out.println("END");
        System.out.println(size);

    }


    //inner class for the linked list  for inner implementation
    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
