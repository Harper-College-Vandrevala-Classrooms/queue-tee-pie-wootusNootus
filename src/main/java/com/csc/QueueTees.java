package com.csc;

import java.util.ArrayList;

public class QueueTees {
  private ArrayList<Cutie> queue;
  private int capacity;

  // Constructor
  public QueueTees(int capacity) {
    this.capacity = capacity;
    this.queue = new ArrayList<>(capacity);
  }

  public void enqueue(Cutie cutie) {
    if (queue.size() == capacity) {
        System.out.println("Queue is full, cannot enqueue further.");
        return;
    }

    queue.add(cutie);
  }
  
  // Dequeue also prints the removed cutie
  public void dequeue() {
    if (queue.isEmpty()) {
        System.out.println("Queue is empty. Cannot dequeue.");
        return;
    }

    Cutie removedCutie = queue.remove(0);
    System.out.println("Dequeued: " + removedCutie.description() + " with a cuteness rating of " + removedCutie.cutenessRating());
}

  // Overloaded method
  public int size() {
    return queue.size();
  }
}
