// Time Complexity : For push() it is O(n)
                    // For Pull() it is O(1)
// Space Complexity :For push() it is O(n)
                    // For Pull() it is O(1)
// Did this code successfully run on Leetcode : YEs
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class MyQueue {
     private Stack<Integer> s1 = new Stack<>();
        private Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
       
    }

    private int front;

    public void push(int x) {
        if(s1.empty()) // When the stack is empty
            front = x;
        while(!s1.isEmpty()) // while pushing we need to add the item in the last. So emptying the stack1 and adding them to stack2.
            s2.push(s1.pop()); // pop from s1 and pushing that into s2
        s2.push(x); //insert the new number
        while(!s2.isEmpty()) // revert it back to s1.
            s1.push(s2.pop());
        
    }
    
    public int pop() {
        int res = s1.pop();
        if(!s1.isEmpty()){ // pop the number on top of the s1
           front = s1.peek();   
        
        }
        return res;
        
    }
    
    public int peek() {
        return front;

    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */