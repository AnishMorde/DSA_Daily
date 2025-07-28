package Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected  int end = 0;
    protected int front = 0;
    private int size =0;


    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("FULL");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int removed  = data[front++];
        front = front % data.length;
        size--;
        return removed;

    }

    public int front()throws Exception{
        if(isEmpty()){
            throw  new Exception("Queue is Empty");
        }

        return data[0];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("CircularQueue is Empty");
            return;
        }
       int i= front;
        System.out.print("START -> ");
       do{
           System.out.print(data[i] + " -> ");
           i++;
           i%= data.length;
       }while(i!=end);
        System.out.println("END");
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }


}
