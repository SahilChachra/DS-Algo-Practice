#include<queue>
#include<iostream>
using namespace std;

class QueueStack{
private:
    queue<int> q1;
    queue<int> q2;
public:
    void push(int);
    int pop();
};

void QueueStack :: push(int x)
{
        if(q1.empty()==true){
        	q2.push(x);
		} 
		else {
			q1.push(x);
		}
}

int QueueStack :: pop()
{
		int  k = 0;
        if(q1.empty()==true){
        	if(q2.empty()==true){
        		return -1;
			}
			else {
				while(q2.size()!=1){
					k = q2.front();
					q1.push(k);
					q2.pop();
				}
				k = q2.front();
				q2.pop();
				return k;
			}
		}
		else
		{
			while(q1.size()!=1){
				k = q1.front();
				q2.push(k);
				q1.pop();
			}
			k = q1.front();
			q1.pop();
			return k;
		}       
}


int main(){
	
	int t;
	cin>>t;
	while(t--){
		int q;
		cin>>q;
		QueueStack *qs = new QueueStack();
			
		while(q--){
			int qt = 0;
			cin>>qt;
			if(qt==1){
				int a;
				cin>>a;
				qs->push(a);
			}
			else if(qt==2){
				cout<<qs->pop()<<" ";
			}
		}
		cout<<endl;
	}
	return 0;
}
