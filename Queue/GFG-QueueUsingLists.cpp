/* Structure of a node in Queue
struct QueueNode
{
    int data;
    QueueNode *next;
    QueueNode(int a)
    {
        data = a;
        next = NULL;
    }
};

And structure of MyQueue
struct MyQueue {
    QueueNode *front;
    QueueNode *rear;
    void push(int);
    int pop();
    MyQueue() {front = rear = NULL;}
}; */

/* The method push to push element into the queue*/
void MyQueue:: push(int x)
{
        QueueNode *t = new QueueNode(x);
        
        if(rear==NULL)
        {
            front = t;
            rear = t;
            return;
        }
        else
            {
                rear->next = t;
                rear = t;
            }
        
}

/*The method pop which return the element
  poped out of the queue*/
int MyQueue :: pop()
{       
    int  x;
        if(front==NULL)
            return -1;
        else{
            QueueNode *t = front;
            x = front->data;
            front = front->next;
            if(front==NULL)
                rear = NULL;
            delete(t);
        }
        return x;
}

