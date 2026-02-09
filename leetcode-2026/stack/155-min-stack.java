import java.util.Stack;

class MinStack {

    // Stack to store all elements
    Stack<Integer> stack;

    // Stack to store minimum elements at each level
    Stack<Integer> minStack;

    // Constructor to initialize both stacks
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto stack
    public void push(int val) {
        stack.push(val);

        // Push into minStack if it's empty or
        // the current value is smaller than or equal to current minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Remove the top element from stack
    public void pop() {
        // If the popped element is the current minimum,
        // remove it from minStack as well
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    // Get the top element of the stack
    public int top() {
        return stack.peek();
    }

    // Retrieve the minimum element in constant time
    public int getMin() {
        return minStack.peek();
    }
}
