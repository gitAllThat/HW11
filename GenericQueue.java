package edu.gcccd.csis;

import java.util.ArrayList;

public class GenericQueue<T> {

    private final ArrayList<T> elements;

    // default constructor, call constructor with a minimum size of 10
    public GenericQueue()
    {
        this(10);
    }

    // main constructor, check if size is > 0. If so initialize array list, if not initialize arraylist with size of 10
    public GenericQueue(int size)
    {
        if (size > 0)
        {
            elements = new ArrayList<T>(size);
        }
        else{
            elements = new ArrayList<T>(10);
        }
    }

    // Take out of queue from first element. Store the element in data, then remove it and return the element
    public T dequeue()
    {
        if (elements.size() > 0) {
            T data = elements.get(0);
            elements.remove(0);
            return data;
        }
        else
        {
            return null;
        }
    }

    // Add an element to the end of the list
    public void enqueue(T t)
    {
        elements.add(t);
    }

    // current length of the queue
    public int length()
    {
        return elements.size();
    }
}
