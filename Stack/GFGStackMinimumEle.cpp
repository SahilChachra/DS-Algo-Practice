/*

Create while loop
pop elements from stack until empty

accept element and push unitl stack full

call getMin() to get the minimum element

*/


int minele=99999999;
/*Complete the function(s) below*/
void push(int a)
{
     s.push(a);
     if(a<minele)
        minele=a;
}

bool isFull(int n)
{   
    //if(s.size()>84)
    //cout<<"size : "<<s.size()<<" n : "<<n<<endl;
     if(s.size() == n)
        return true;
    else
        return false;
}

bool isEmpty()
{
    minele=999999999;
    return s.empty();
}

int pop()
{
    int t = s.top();
    s.pop();
    if(t<minele)
    minele=t;
    return t;
}

int getMin()
{  
   return minele;
}
