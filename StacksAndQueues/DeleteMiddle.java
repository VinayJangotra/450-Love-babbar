#include <bits/stdc++.h> 
	 void helper(int idx,stack<int>&st, int n){
		if(idx==n/2){
			st.pop();
			return;
		}
		int num=st.top();
		st.pop();
		helper(idx+1,st,n);
		st.push(num);
	}
void deleteMiddle(stack<int>&inputStack, int N){
	helper(0,inputStack,N);
   
}
