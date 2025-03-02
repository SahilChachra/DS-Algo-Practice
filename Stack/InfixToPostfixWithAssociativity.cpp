#include<iostream>
#include<string>
#include<stack>
using namespace std; 

//Function to return precedence of operators 
int prec(char c) 
{ 
    if(c == '^') 
    return 5; 
    else if(c == '*') 
    return 3;
    else if(c == '/')
    return 4;
    else if(c == '+') 
    return 1;
    else if(c == '-')
    return 2;
    else
    return -1; 
} 
  
// The main function to convert infix expression 
//to postfix expression 
void infixToPostfix(string s) 
{ 
    stack<char> st; 
    st.push('N'); 
    int l = s.length(); 
    string ns; 
    for(int i = 0; i < l; i++) 
    { 
        // If the scanned character is an operand, add it to output string. 
        if((s[i] >= 'a' && s[i] <= 'z')||(s[i] >= 'A' && s[i] <= 'Z')) 
        	ns+=s[i]; 
  
        // If the scanned character is an �(�, push it to the stack. 
        else if(s[i] == '(') 
        	st.push('('); 
          
        // If the scanned character is an �)�, pop and to output string from the stack 
        // until an �(� is encountered. 
        else if(s[i] == ')') 
        { 
            while(st.top() != 'N' && st.top() != '(') 
            { 
                char c = st.top(); 
                st.pop(); 
               ns += c; 
            } 
            if(st.top() == '(') 
            { 
                char c = st.top(); 
                st.pop(); 
            } 
        } 
          
        //If an operator is scanned 
        else{ 
            while(st.top() != 'N' && prec(s[i]) <= prec(st.top())) 
            { 
                char c = st.top(); 
                st.pop(); 
                ns += c; 
            } 
            st.push(s[i]); 
        } 
  
    } 
    //Pop all the remaining elements from the stack 
    while(st.top() != 'N') 
    { 
        char c = st.top(); 
        st.pop(); 
        ns += c; 
    } 
      
    cout << ns << endl; 
  
}
int main() 
{ 
    
    int t;
    cin>>t;
	  string s;
	  
    while(t--){
    	cin>>s;
    	
    	infixToPostfix(s); 
    	
	}
	return 0;
}
