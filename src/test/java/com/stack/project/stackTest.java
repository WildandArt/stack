package com.stack.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.stack.project.Impl.stackImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class stackTest {

    private stack<Integer> st;

    @BeforeEach
    public void setUp() {
        // Initialize the stack with a capacity of 3 for testing
        st = new stackImpl<>(3);
    }

    @AfterEach
    public void tearDown() {
        st = null;
    }

    @Test
    public void testPush() {
        st.push(1);
        st.push(2);
        st.push(3);
        assertEquals(3, st.peek());

        // Test pushing to a full stack
        assertThrows(RuntimeException.class, () -> st.push(4), "Stack is full. Cannot push.");
    }

    @Test
    public void testPop() {
        st.push(1);
        st.push(2);
        int popped = st.pop();
        assertEquals(2, popped);
        assertEquals(1, st.peek());

        popped = st.pop();
        assertEquals(1, popped);

        // Test popping from an empty stack
        assertThrows(RuntimeException.class, () -> st.pop(), "Stack is empty. Cannot pop.");
    }

    @Test
    public void testSearch() {
        st.push(1);
        st.push(2);
        st.push(3);
        assertEquals(1, st.search(3));
        assertEquals(2, st.search(2));
        assertEquals(3, st.search(1));
        assertEquals(-1, st.search(4));
    }

    @Test
    public void testExceptions() {
        assertThrows(RuntimeException.class, () -> {
            st.pop();
        }, "Stack is empty. Cannot pop.");

        assertThrows(RuntimeException.class, () -> {
            st.peek();
        }, "Stack is empty. Cannot peek.");
    }

    @Test
    public void testPrint() {
        
    }
}
