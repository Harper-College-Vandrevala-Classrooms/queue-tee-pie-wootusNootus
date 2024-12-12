package com.csc;

import java.util.ArrayList;

public class QueueTees<T> {
  private ArrayList<T> queue;
  private int capacity;

  // Constructor
  public QueueTees(int capacity) {
    this.capacity = capacity;
    this.queue = new ArrayList<>(capacity);
  }

  public void enqueue(T cutie) {
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

    T removedCutie = queue.remove(0);
    System.out.println("Dequeued: " + removedCutie);
}

  // Overloaded method
  public int size() {
    return queue.size();
  }

  // Clears all elements from the queue
  public void clear() {
    queue.clear();
    System.out.println("All elements have been removed from the queue.");
  }
}
