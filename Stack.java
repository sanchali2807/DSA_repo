//import java.util.Scanner;
//stack is last in first out 

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> list = new ArrayList<>(); // Stack using ArrayList

    // Push operation
    void push(int data) {
        list.add(data);
    }

    // Pop operation (removes and returns top element)
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1; // Return a default value when stack is empty
        }
        return list.remove(list.size() - 1);
    }

    // Top operation (returns the top element without removing it)
    int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return list.get(list.size() - 1);
    }

    // Check if stack is empty
    boolean isEmpty() {
        return list.isEmpty();
    }

    // Display stack elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements: " + list);
    }

    // Main method to test stack operations
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: Stack elements: [10, 20, 30]

        System.out.println("Top element: " + stack.top()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        stack.display(); // Output: Stack elements: [10, 20]

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        stack.pop();
        stack.pop();
        stack.pop(); // Will print "Stack is empty!"
    }
}

