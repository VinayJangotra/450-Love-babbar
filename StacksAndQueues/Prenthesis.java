class Solution
{
    //Function to check if brackets are balanced or not.
 static boolean ispar(String x) {
        Stack<Character> st = new Stack<>();
        int n = x.length();
        for (int i = 0; i < n; i++) {
            char ch = x.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false; // Check if the stack is empty before peeking
                char chr = st.peek();
                if ((ch == ']' && chr == '[') || (ch == '}' && chr == '{') || (ch == ')' && chr == '(')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

}
