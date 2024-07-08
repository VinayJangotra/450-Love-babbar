public class Solution{
    static class Stack {
        int capacity=0;
        int arr[];
        int top;
        Stack(int capacity) {
            this.capacity=capacity;
            this.arr=new int[capacity];
            this.top=-1;
        }
        public void push(int num) {
          if(top==capacity-1){
              return;
          }
          top++;
          arr[top]=num;
        }
        public int pop() {
            if(top==-1){
                return -1;
            }
            return arr[top--];
        }
        public int top() {
            if(top==-1)return -1;
            return arr[top];
        }
        public int isEmpty() {
            if(top==-1)return 1;
            return 0;
        }
        public int isFull() {
            if(top==capacity-1){
                return 1;
            }
            return 0;
        }
    }
}
