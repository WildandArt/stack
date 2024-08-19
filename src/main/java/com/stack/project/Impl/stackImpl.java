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

        array[++top] = item;

        return array[top];
    }

    @Override
    public int search(E e) {
    
        //int index = Arrays.asList(array).lastIndexOf(e);
    
        // if (index >= 0) {
        //     return array.length - index;
        // }
        return -1;
    
    }
}
