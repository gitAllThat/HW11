package edu.gcccd.csis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    GenericQueue<Integer> testQueueInt = new GenericQueue<>(10);
    GenericQueue<String> testIntString = new GenericQueue<>(4);

    @Before
    public void SetupQueue()
    {
        testQueueInt.enqueue(10);
        testQueueInt.enqueue(9);
        testQueueInt.enqueue(8);
        testQueueInt.enqueue(7);
        testQueueInt.enqueue(6);
        testQueueInt.enqueue(5);
    }

    @Test
    public void TestIntQueue()
    {
        assertEquals(10,(int)testQueueInt.dequeue());
        assertEquals(9,(int)testQueueInt.dequeue());
        assertEquals(8,(int)testQueueInt.dequeue());
        assertEquals(3, testQueueInt.length());
        assertNotNull(testQueueInt.dequeue());
    }

    @Test
    public void TestStringQueue()
    {
        assertNull(testIntString.dequeue());
        testIntString.enqueue("Hello");
        testIntString.enqueue("World");
        assertEquals(2,testIntString.length());
        assertEquals("Hello", testIntString.dequeue());
        assertEquals("World", testIntString.dequeue());
    }

}