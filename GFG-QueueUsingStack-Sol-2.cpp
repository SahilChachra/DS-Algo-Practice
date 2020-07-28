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
        q1.push(x);
}

int QueueStack :: pop()
{
	int ans = -1;
	if(q1.empty())
		return ans;
	q1.push(0);
	
	while(1){
		int x = q1.front();
		q1.pop();
		if(q1.front()==0){
			ans = x;
			break;
		}
		else
			q1.push(x);
	}
	q1.pop();
	return ans;      
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
