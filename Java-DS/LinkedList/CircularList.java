public class CircularList {

    Node head;
    Node tail;

    public void insertAtEnd(int a){
        Node t = new Node(a);
        if(head==null){
            head = t;
            tail = t;
        }
        else {
            tail.next = t;
            tail = t;
            tail.next = head;
        }
    }

    public void insertAtBeg(int a){
        Node t = new Node(a);
        if(head==null){
            head = t;
            tail = t;
        }

        t.next = head;
        head = t;
        tail.next = head;
    }

    public void insertAtPos(int a, int pos){

        if(pos==1){
            insertAtBeg(a);
        }
        else if(pos+1==getSize()){
            insertAtEnd(a);
        }
        else if(pos>getSize()){
            System.out.println("Invalid Position");
        }
        else{
            Node t = new Node(a);
            Node prev=head,curr = head;
            int cnt=1;
            while(cnt!=pos){
                cnt++;
                prev = curr;
                curr = curr.next;
            }
            t.next = curr;
            prev.next = t;
        }

    }

    private int getSize(){
        Node curr = head;
        int cnt=0;
        while(curr.next!=head){
            curr = curr.next;
            cnt++;
        }
        curr = curr.next;
        cnt+=1;
        return cnt;
    }

    public void display(){
        Node curr;
        curr = head;
        while(curr.next!=head){
            System.out.print(curr.getData()+" ");
            curr = curr.next;
        }
        System.out.print(curr.getData());
        System.out.println();
    }

}
