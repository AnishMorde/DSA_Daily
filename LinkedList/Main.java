package LinkedList;

public class Main {

    public static void main(String[] args) {
       LL list = new LL();

       list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(20);
        list.insertFirst(25);

        list.insertFirst(14);
        list.insertFirst(454);
        list.insertFirst(243);
        list.insertFirst(232);
//        list.insertLast(100);
//        list.insertLast(120);
//        list.insert(89,3);
//
//        list.deleteFirst();
//        list.deleteFirst();

//        System.out.println( list.deleteLast());

        list.display();

        System.out.println( list.delete(3));

        list.display();

    }
}
