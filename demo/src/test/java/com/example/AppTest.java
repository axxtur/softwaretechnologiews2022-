package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>(); //create empty list
        assertEquals(list.size(), 0); //check size of list, should equal 0
        list.add(3); //add 3 into list
        assertEquals(list.size(), 1); //check size of list, should equal 1
        list.add(5);//add 5 into list
        assertEquals(list.size(), 2); //check size of list, should equal 2
    }

    @Test
    public void testAddException() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>(); //create empty list
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iter = list.iterator();
        assertTrue(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.next());
        assertFalse(iter.hasNext());
    }


    @Test
    public void testRemove() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.add(1);
        list.add(2);
        Iterator<Integer> iter = list.iterator();

    }


}
