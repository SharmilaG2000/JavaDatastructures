package com.bridgelabz.datastructures;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== LinkedList ===");
        Linkedlist<Integer> list = new Linkedlist<>();
        list.add(70);
        list.add(30);
        list.add(56);
        list.printList();  // Output: 56 -> 30 -> 70

        System.out.println("\n=== Stack ===");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.printStack();  // Output: 56 -> 30 -> 70
        System.out.println("Pop: " + stack.pop());  // 56

        System.out.println("\n=== Queue ===");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printQueue();  // Output: 56 -> 30 -> 70
        System.out.println("Dequeue: " + queue.dequeue());  // 56
    }
}

