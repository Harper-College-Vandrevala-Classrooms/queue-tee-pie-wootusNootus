package com.csc;

public class Main {
    public static void main(String[] args) {
        // Create some Cutie objects
        Cutie puppy = new Puppy("A little puppy with big, sad eyes", 11);
        Cutie kitty = new Kitty("A fluffy kitty with soft fur", 10);
        Cutie piggy = new Piggy("A cute piggy with a curly tail", 9);

        // Create a QueueTees instance
        QueueTees queue = new QueueTees(3);

        // Test queue operations
        System.out.println("Initial size: " + queue.size());

        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(piggy);

        System.out.println("Size after enqueueing: " + queue.size());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Final size: " + queue.size());

        // Testing enqueue on full queue
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(piggy);
        queue.enqueue(puppy); 
    }
}
