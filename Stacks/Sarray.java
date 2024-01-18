package Stacks;
public class Sarray {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        // System.out.print(s.top()+" ");
        s.push(4);
        // System.out.print(s.top());
        System.out.print(s.pop());

    }

}

class Stack {
    int size = 10000;
    int[] arr = new int[size];
    int top = -1;

    void push(int val) {
        top++;
        arr[top] = val;
    }

    int pop() {
        int res = arr[top];
        top--;

        return res;
    }

    int top() {
        int res = arr[top];
        return res;
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        if (top == -1)
            return false;
        return true;
    }
    int[] display(){
        return arr;
    }

}
