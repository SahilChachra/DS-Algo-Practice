public class SinglyLinkedList {

    private Node head;

    public void insertBeginning(int a){

        Node t = new Node(a);
        t.next = head;
        head = t;

    }

    public void insertAtLast(int a){
        Node t = new Node(a);
        Node curr = head;

        while(curr.next!=null){
            curr = curr.next;
        }

        curr.next = t;
    }

    public void insertAtPosition(int a,int pos){

        if(pos>getSize() || pos==-1 ||pos==0){
            System.out.println("Cannot insert element. Entered Position is invalid");
            return;
        }

        if(pos==1){
            insertBeginning(a);
            return;
        }
        Node temp = new Node(a);
        Node c = head, prev=null;
        int position=1;

        while(c!=null){
            position+=1;
            prev = c;
            c=c.next;
            if(position==pos)
                break;
        }

        temp.next = prev.next;
        prev.next = temp;

    }

    public void deleteInBeginning(){

        if(head!=null){
            int t = head.getData();
            head = head.next;
            System.out.println(t+" has been deleted!");
        }
        else
            System.out.println("List is empty!");

    }

    public void deleteInTheEnd(){
        if(head==null){
            System.out.println("List is empty!");
        }
        else{
            Node c = head;
            Node prev = head;
            while(c.next!=null){
                prev = c;
                c = c.next;
            }
            int t = c.getData();
            c = null;
            System.out.println(t+" is deleted!");
            prev.next=null;

        }
    }

    public void deleteAtPos(int pos){
        if(pos>getSize() || pos==-1 ||pos==0){
            System.out.println("Cannot Delete element. Entered Position is invalid");
            return;
        }

        if(pos == 1){
            System.out.println(head.getData()+" has been removed!");
            head = head.next;
            return;
        }

        Node c = head, prev = null;
        int position=1;

        while(c!=null){
            position+=1;
            prev = c;
            c=c.next;
            if(position==pos)
                break;
        }

        System.out.println(c.getData()+" has been removed!");
        prev.next = c.next;
    }

    public int getSize(){
        Node c = head;
        int size=0;
        while(c!=null){
            size=size+1;
            c=c.next;
        }
        return size;
    }

    public int searchValue(int a){

        if(head==null){
            return -1;
        }
        int pos=1;
        Node curr = head;
        while(curr!=null){
            if(curr.getData() == a){
                return pos;
            }
            pos=pos+1;
            curr=curr.next;
        }
        return 0;
    }

    public void reverseList(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }

        Node curr=head,prev=null,next=null,newHead;

        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr=next;
        }
        head = prev;
    }


    public void printList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.getData()+"\t");
            curr=curr.next;
        }
        System.out.println();
    }
}