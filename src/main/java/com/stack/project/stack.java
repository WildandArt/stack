package com.stack.project;

import java.util.Vector;

public interface stack<E> {

    public boolean empty();
    public E peek();
    public E pop();
    public E push(E item);
    public int search(Object o); 

}
