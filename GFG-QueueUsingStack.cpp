class StackQueue{
private:   
    
    stack<int> s1;
    stack<int> s2;
public:
    void push(int);
    int pop();
}; 

void StackQueue :: push(int x)
 {
    s1.push(x);
 }


int StackQueue :: pop()
{	
	int x;
	if(s2.empty()){
		if(s1.empty()){
			return -1;
		}
		else {
			while(!s1.empty()){
				x = s1.top();
				s1.pop();
				s2.push(x);
			}
			x = s2.top();
			s2.pop();
			return x;
		}
	}
	else {
		x = s2.top();
		s2.pop();
		return x;
	}
}

