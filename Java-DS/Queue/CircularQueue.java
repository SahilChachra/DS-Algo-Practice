public class CircularQueue {

    private int size = 5;
    private int arr[] = new int[size];
    private int front = -1,rear=-1;

    public void print(){
        int i=0;
        for(i = front; i!=rear; i=(1+i)%size)
            System.out.print(arr[i]+" ");
        System.out.print(arr[i]);
        System.out.println();
    }

    private boolean isFull() {
        if (front == rear + 1)
            return true;
        else if(front==0 && rear==(size-1)){
            return true;
        }
        else
            return false;
    }

    private boolean isEmpty(){
        if(front==-1 && rear==-1)
                return true;
        else
            return false;
    }

    public void insert(int a){
        if(isFull())
            System.out.println("Queue is Full!");
        else if(isEmpty()){
            front = 0;
            rear = 0;
            arr[rear] = a;
        }
        else {
            rear = (rear+1)%size;
            arr[rear]=a;
        }
    }

    public void delete(){
        if(isEmpty())
            System.out.println("Queue is empty!");
        else{
            System.out.println(arr[front]+" has been deleted!");
            if(front==rear){
                front=-1; rear=-1;
            }
            else
                front = (front+1)%size;
        }
    }

}
