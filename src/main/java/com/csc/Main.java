package com.csc;

public class Main {
    public static void main(String[] args) {
        // Create a stack of Integers
        QueueTees<Integer> intStack = new QueueTees<>(3);

        intStack.enqueue(10);
        intStack.enqueue(20);
        intStack.enqueue(30);
        intStack.enqueue(40); // This should fail due to capacity constraint

        System.out.println("Current stack size: " + intStack.size());

        intStack.dequeue();
        intStack.dequeue();

        System.out.println("Stack size after popping 2 elements: " + intStack.size());

        // Clear the stack
        intStack.clear();
        System.out.println("Stack size after clearing: " + intStack.size());

        // Create a stack of Strings
        QueueTees<String> stringStack = new QueueTees<>(2);

        stringStack.enqueue("Hello");
        stringStack.enqueue("World");

        // Attempting to push another when full
        stringStack.enqueue("!");

        System.out.println("String stack size: " + stringStack.size());
        stringStack.clear();
    }
}
