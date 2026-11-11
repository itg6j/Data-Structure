public class Stack{
    private int[] arr;
    private int top;
    private int capacity;
    public Stack(int size){
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }
    public void push(int x){
        if (top == capacity-1){
            System.out.println("Stack Overflow");
        }
        else{
            arr[++top] = x;
            System.out.println("add complete : " + x);
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return arr[top];
        }
    }
    public int size(){
        return top + 1;
    }
    public boolean isEmpty(){
        if (top < 0){
            return true;
        }
        else{
            return false;
        }
    }
}