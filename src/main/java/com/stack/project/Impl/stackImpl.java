package com.stack.project.Impl;

import java.util.Vector;

import com.stack.project.stack;


public class stackImpl <E> implements stack<E>  {

    private E[] array;

    private Integer top;

    private Integer capacity;


    @SuppressWarnings("unchecked")
    public stackImpl(int size) {
    
        this.array = (E[]) new Object[size];
    
        capacity = size;
    
        top = -1;
    
    }
    
    @Override
    public boolean empty() {

        return (-1 == top);
    
    }

    @Override
    public E peek() {

        if(-1 == top) {
           throw new RuntimeException("Stack Is empty. Can not peek.");
        }

        return array[top];
    }

    @Override
    public E pop() {

        if(-1 == top) {
            throw new RuntimeException("Stack Is empty. Can not pop.");
        }

        return array[top--];
    }

    @Override
    public E push(E item) {

        if(capacity == (top + 1))
        {
            throw new RuntimeException("Stack is full. Cannot push.");
        }

        array[++top] = item;

        return array[top];
    }

    @Override
    public int search(E e) {
    
       if(array.length < 1) {

        return -1;

       }

       for(int i  = top; i >= 0; i--) {

            if(array[i].equals(e)) {

                return top - i + 1;

            }

       }
        return -1;
    
    }
    @Override
    public String toString() {

      return array.toString();

    }
}
