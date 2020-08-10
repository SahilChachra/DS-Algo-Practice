#include<iostream>
using namespace std;

void heapify(int arr[], int n, int i) 
{ 
    int minimum = i;  
    int l = 2 * i + 1; 
    int r = 2 * i + 2;
  

    if (l < n && arr[l] < arr[minimum]) 
        minimum = l; 
 
    if (r < n && arr[r] < arr[minimum]) 
        minimum = r; 
  
    
    if (minimum != i) { 
        swap(arr[i], arr[minimum]); 
        heapify(arr, n, minimum); 
    } 
} 
  

void buildHeap(int arr[], int n) 
{ 
    int startIdx = (n / 2) - 1; 
  
    for (int i = startIdx; i >= 0; i--) { 
        heapify(arr, n, i); 
    } 
}

void deleteRoot(int arr[], int &n){
	
	int lastEle = arr[n-1];
	arr[0] = lastEle;
	n = n - 1;
	heapify(arr,n,0);
	
}

void print(int arr[], int n){
	
	int i=0;
	for(i=0;i<n;i++)
		cout<<arr[i]<<" ";
	cout<<endl;
	
}

int main(){
	
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		int arr[n];
		int i=0;
		for(i=0;i<n;i++)
			cin>>arr[i];
		buildHeap(arr,n);
		print(arr,n);
		
		deleteRoot(arr, n);
		print(arr,n);
	}
	
	
	return 0;
}
