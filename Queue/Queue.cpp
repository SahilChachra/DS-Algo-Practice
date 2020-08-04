#include<iostream>
#include<vector>
using namespace std;

int front=-1;
int rear=-1;

void enqueue(int arr[],int a,int n){
	if(rear==-1 && front==-1){
		rear=front=0;
		arr[rear] = a;
		return;
	}
	else if(rear==n-1){
		//cout<<"Queue Full"<<endl;
		return;
	}
	else{
		rear = rear+1;
		arr[rear] = a;
	}
}

void dequeue(int arr[]){
	if(rear==-1 && front==-1){
		//cout<<"Empty Queue"<<endl;
		return;
	}
	else {
		int t = arr[front];
		front = front+1;
		//cout<<t<<" removed"<<endl;
	}
}

void print(int arr[]) {
	int i=0;
	for(i=front;i<=rear;i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}

int main(){
	int n;
	cin>>n;
	int arr[n];
	int i=0;
	for(i=0;i<n;i++){
		int x;
		cin>>x;
		enqueue(arr,x,n);
		print(arr);
	}
	for(i=0;i<n;i++){
		dequeue(arr);
		print(arr);
	}
}
