// Remove Middle element from Stack and return it

stack<int> deleteMid(stack<int>s,int sizeOfStack,int current)
{   
        if(s.empty() || current==sizeOfStack)
            return s;
        int t = s.top();
        s.pop();
        
        s = deleteMid(s,sizeOfStack,current+1);

        if(current!=(sizeOfStack/2)){
           s.push(t);
          }
          
     return s;
}

