#include<iostream>
#include<stack>
using namespace std; 

void sortedStack(stack<int> s){
	
	if(s.empty()==false){
		int temp = s.top();
		s.pop();
		sortedStack(s);
		sortedInsert(s,temp);
	}
	printStack(s);
	
}

void sortedInsert(stack<int> s,int ele){
	if(s.empty() || ele>s.top())
		s.push(ele);
	else {
		int temp = s.top();
		s.pop();
		sortedInsert(s, ele);
		s.push(temp);
	}
}

/*

ANOTHER SOLUTION - From Practice - 
GEEKSFORGEEKS

*/


void sortedInsert(stack<int> &s, int x)
{
	if(s.empty() or x>s.top())
	{
		s.push(x);
		return;
	}
	int temp = s.top();
	s.pop();
	sortedInsert(s,x);
	s.push(temp);
}

void SortedStack :: sort()
{
	if(!s.empty())
	{
		int x = s.top();
		s.pop();
		sort();
		sortedInsert(s,x);
	}
}

