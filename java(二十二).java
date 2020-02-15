1.实现一个简单的栈
public class MyStack {
    int[] list = new int[100];
    int size = 0;

    public void push(int elem) {
        list[size] = elem;
        if(size == list.length) {
           capacity();
        }
        size++;
    }

    private void capacity() {
        int[] newList = new int[2 * this.list.length];
            for (int i = 0; i < this.size; i++) {
                newList[i] = this.list[i];
            }
            this.list = newList;
    }

    public Integer pop() {
        if(size == 0) {
            return null;
        }
        return list[--size];
    }

    public Integer peek() {
        if(size == 0) {
            return null;
        }
        return list[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return  size;
    }
}

2.用链表和数组实现队列
public class MyQueueByNode {
    Node head = null;
    Node tail = null;
    int size  = 0;
    public void offer(int elem) {
        Node node = new Node(elem);
        if(tail == null) {
            tail = node;
        }else {
            tail.next = node;
        }
        size++;
    }

    public Integer poll() {
        if(size == 0) {
            return null;
        }
        Node oldHead = head;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        --size;
        return oldHead.val;
    }

    public Integer peek() {
        if(size ==  0) {
            return null;
        }
        return head.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

class Node {
    int val;
    Node next = null;

    public Node(int val) {
        this.val = val;
    }
}



public class MyQueueByArray {
    int[] list = new int[100];
    int size = 0;

    public void offer(int val) {
        if(size == list.length) {
            capacity();
        }
        list[size] = val;
        ++size;
    }

    private void capacity() {
        int[] newList = new int[list.length * 2];
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        this.list = newList;
    }

    public Integer poll() {
        if(size == 0) {
            return null;
        }
        Integer tem = list[size];
        size--;
        return tem;
    }

    public Integer peek() {
        return list[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}


3.完成栈和队列相关OJ题目
有效的括号、
import java.util.Stack;

public class Demo_Bracket {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        if(s.length() == 0) {
            return true;
        }
        Stack<Character> newStack = new Stack<>();
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                newStack.push(s.charAt(0));
                continue;
            }
            if(newStack.size() == 0) {
                return false;
            }
            if(     (s.charAt(i) == ')' && newStack.peek() == '(') ||
                    (s.charAt(i) == ']' && newStack.peek() == '[') ||
                    (s.charAt(i) == '}' && newStack.peek() == '{') ) {
                newStack.pop();
                continue;
            }
            return false;
        }
         if(newStack.size() == 0){
        return true;
         }
        return false;
    }
}


用队列实现栈

class MyStack {
     ArrayList<Integer> A;
     ArrayList<Integer> B;
    
    public  MyStack() {
        A = new ArrayList<>();
        B = new ArrayList<>();
    }

    public void push(int x) {
        A.add(x);
    }

    public int pop() {
        if(A.isEmpty()) {
            return -1;
        }
        while(A.size() > 1) {
            B.add(A.remove(0));
        }
        int tem = A.remove(0);
        while(B.size() > 0) {
            A.add(B.remove(0));
        }
        return tem;
    }

    public int top() {
        if(A.isEmpty()) {
            return -1;
        }
        while(A.size() > 1) {
            B.add(A.remove(0));
        }
        int tem = A.get(0);
        B.add(A.remove(0));
        while(B.size() > 0) {
            A.add(B.remove(0));
        }
        return tem;
    }

    public boolean empty() {
        return A.size() == 0;
    }
}


用栈实现队列
class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> s1;
    Stack<Integer> s2;
    public  MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        if(s1.isEmpty()) {
            s1.push(x);
            return;
        }
       while(s1.size() > 0) {
           s2.push(s1.pop());
       }
       s1.push(x);
       while (s2.size() > 0){
           s1.push(s2.pop());
       }
    }

    public int pop() {
        if(s1.size() == 0) {
            return 0;
        }
        return s1.pop();
    }

    public int peek(){
        if(s1.size() == 0) {
            return 0;
        }
        return s1.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.size() == 0;
    }
}


获得最小栈
import java.util.Stack;

public class MinStack {
    int min;
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MinStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        if(s1.size() == 0) {
            s1.push(x);
            min = x;
            s2.push(min);
            return;
        }
        s1.push(x);
        min = x < s2.peek() ? x : s2.peek();
        s2.push(min);
    }

    public void pop () {
        if(s1.size() == 0) {
            return;
        }
        s1.pop();
        s2.pop();
    }

    public int top() {
        if(s1.size() == 0) {
            return  0;
        }
        return s1.peek();
    }

    public int getMin() {
        if(s1.size() == 0) {
            return 0;
        }
        return s2.peek();
    }
}


设计一个循环队列
class MyCircularQueue {

    int[] list;
    int head ;
    int tail ;  
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        if(k > 0) {
            list = new int[k + 1];
            head = 0;
            tail = 0; 
        }
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        list[tail] = value;
        tail = (tail + 1) % list.length;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        head = (head + 1) % list.length;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return list[head];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
       if(isEmpty()) {
            return -1;
        }
        return tail == 0 ? list[list.length - 1] : list[tail - 1];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
       return tail == head ;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
      return (tail + 1) % list.length == head;
    }
}




