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
        st = new stackImpl<>();
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
    }

    @Test
    public void testPop() {
        st.push(1);
        st.push(2);
        int popped = st.pop();
        assertEquals(2, popped);
        assertEquals(1, st.peek());
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
        });

        assertThrows(RuntimeException.class, () -> {
            st.peek();
        });
    }


}
