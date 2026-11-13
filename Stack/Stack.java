public class Stack{
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    private int size;
    public Stack(){
        top = null;
        size = 0;
    }
    public void push(int num){
        Node newNode = new Node(num);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("[+] Stack add number : "+num);
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void pop(){
        if (isEmpty()) {
            System.out.println("[+] Stack is Empty");
        }
    
        int poppedData = top.data;
        top = top.next;   
        size--;            
        System.out.println("[+] popped element is : " + poppedData);
    }
    public void size(){
        System.out.println("[+] Size stack is : "+size);
    }
}