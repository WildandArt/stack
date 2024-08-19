package com.stack.project;

/**
 * @brief 
 * The stack<T> interface provides methods for common stack operations such as 
 * pushing, popping, peeking, checking if the stack is empty, and searching for elements.
 *
 * @param <T> the type of elements in this stack
 */
public interface stack<T> {

    /**
     * @brief Checks if the stack is empty.
     *
     * This method determines whether the stack contains any elements.
     *
     * @return true if the stack is empty; false otherwise
     */
    public boolean isEmpty();

    /**
     * @brief Returns the top element of the stack without removing it.
     *
     * This method allows the caller to view the element at the top of the stack
     * without modifying the stack.
     *
     * @return the top element of the stack
     * @throws RuntimeException if the stack is empty
     */
    public T peek();

    /**
     * @brief Removes and returns the top element of the stack.
     *
     * This method removes the top element from the stack and returns it.
     *
     * @return the top element of the stack
     * @throws RuntimeException if the stack is empty
     */
    public T pop();

    /**
     * @brief Pushes an item onto the top of the stack.
     *
     * This method adds an item to the top of the stack.
     *
     * @param item the item to be pushed onto the stack
     * @return the item argument that was pushed onto the stack
     */
    public T push(T item);

    /**
     * @brief Searches for an element in the stack.
     *
     * This method searches the stack for a specific element and returns its 
     * 1-based position from the top of the stack. If the element is not found, 
     * the method returns -1.
     *
     * @param e the element to search for
     * @return the 1-based position of the element from the top of the stack,
     *         or -1 if the element is not found
     */
    public int search(T e); 

}
