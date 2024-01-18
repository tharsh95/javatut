package Queues;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(23);
        q.push(45);
        System.out.println(q.peek()+" ");
        q.pop();
        System.out.println(q.peek()+" ");
        System.out.println(q.size);
    }

}

class Queue {
    int count;
    int size = 5;
    int[] arr = new int[size];
    int front = -1;
    int rear = -1;

    void push(int val) {
if(count<=size){
    arr[rear%size] = val;
    rear++;
    count++;
}
    }

    int peek() {
        if (count == 0) {
            System.out.println("No Elements");
            return -1;
        }
        return arr[front % size];
    }

    int pop() {
        int res = arr[front % size];
        front++;
        count--;
        return res;
    }

    int size() {
        return count;
    }
}
