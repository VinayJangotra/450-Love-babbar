        Stack<Long> st  =new Stack<>();
        long nums[] = new long[n];
        st.push(arr[n-1]);
        nums[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            long nxt=st.isEmpty()?(-1):st.peek();
            nums[i]=nxt;
            st.push(arr[i]);
        }
        
        return nums;
