package com.stack.project.Impl;

import java.util.Vector;

import com.stack.project.stack;

public class stackImpl <E> implements stack<E>  {

    private Vector<E> vec = new Vector<>(); 
    
    @Override
    public boolean empty() {

        return vec.isEmpty();
    
    }

    @Override
    public E peek() {

        return vec.lastElement();
        
    }

    @Override
    public E pop() {

        return vec.removeLast();

    }

    @Override
    public E push(E item) {

        vec.addElement(item);
        return item;

    }

    @Override
    public int search(E e) {
        
       return vec.lastIndexOf(e);

    }


    
}
