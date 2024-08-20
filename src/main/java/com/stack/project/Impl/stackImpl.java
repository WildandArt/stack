package com.stack.project.Impl;

import com.stack.project.Stack;

public class stackImpl <T> implements Stack<T>  {

    private T[] array;
    private int top;
    private final int capacity;

    @SuppressWarnings("unchecked")
    public stackImpl(int capacity) {

        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        top = -1;
    
    }
    
    @Override
    public boolean isEmpty() {

        return (-1 == top);
    
    }

    @Override
    public T peek() {

        if (-1 == top) {
           throw new RuntimeException("Stack Is empty. Can not peek.");
        }

        return array[top];
    }

    @Override
    public T pop() {

        if (-1 == top) {
            throw new RuntimeException("Stack Is empty. Can not pop.");
        }

        T item = array[top];
        top--;

        return item;
    }

    @Override
    public T push(T item) {

        if (capacity == (top + 1))
        {
            throw new RuntimeException("Stack is full. Cannot push.");
        }

        top++;
        array[top] = item;

        return array[top];
    }

    @Override
    public int search(T e) {
    
       if (array.length < 1) {

        return -1;

       }

       for (int i  = top; i >= 0; i--) {

            if (array[i].equals(e)) {

                return top - i + 1;

            }

       }
        return -1;
    
    }
    @Override
    public String toString() {

        StringBuilder objectString = new StringBuilder("|");

        for (int i = 0; i <= top; i++) {

            objectString.append(array[i]);

            if (i < top){

                objectString.append(", ");

            }
        }

        objectString.append("|");

        return objectString.toString();

    }

    @Override
    public boolean isFull() {
        
        return top == capacity - 1;
    }

    @Override
    public int size() {
    
        if (top == -1) {
            return 0;
        }

        return top + 1;

    }

    @Override
    public int capacity() {
        
        return capacity;

    }
}
