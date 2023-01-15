
public class MinStack {

    int currIndex = -1;
    int currMin = Integer.MAX_VALUE;
    int[] stack, minStack;
    int arraySize = 3*10^4 +1;
    public MinStack() {
        stack = new int[arraySize];
        minStack = new int[arraySize];
    }

    public void push(int val) {

        currIndex++;
        stack[currIndex] = val;
        currMin = Math.min(currMin, val);

        minStack[currIndex] = currMin;
    }

    public void pop() {
        currIndex--;
        currMin = minStack[currIndex];
    }

    public int top() {
        return stack[currIndex];
    }

    public int getMin() {
       return  minStack[currIndex];
    }
}