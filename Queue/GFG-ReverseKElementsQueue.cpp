// REVERSE FIRST K elements
// inp - 1 2 3 4 5, K = 3
// ans = 3 2 1 4 5

#include<stack>
queue<ll> modifyQueue(queue<ll> q, int k)
{
    int i=0,c=1;
    queue<ll> ans;
    stack<ll> s;
    int x;
    while(q.empty()==false){
        if(c<=k){
          x = q.front();
          q.pop();
          s.push(x);
          c=c+1;
        }
        if(c>k)
            break;
    }
    while(s.empty()==false){
        x = s.top();
        s.pop();
        ans.push(x);
    }
    while(q.empty()==false)
        {   
            x = q.front();
            q.pop();
            ans.push(x);
        }
    return ans;
}
