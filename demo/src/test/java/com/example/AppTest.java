package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Iterator;

/**
 * Unit test for SimpleLinkedList Class.
 */
class AppTest {
	@Test
	void testAdd() {
		SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>(); //create empty list
		assertEquals(list.size(), 0); //check size of list, should equal 0
		list.add(3); //add 3 into list 
		assertEquals(list.size(), 1); //check size of list, should equal 1
		list.add(5);//add 5 into list
		assertEquals(list.size(), 2); //check size of list, should equal 2
	}
	
	@Test
    public void testRemoveEmpty() {    	
    	SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        Iterator<Integer> iter = list.iterator();
        list.printList();
        System.out.println(" <- printed empty list\n");
        
        Exception exception = assertThrows(NullPointerException.class, () ->
        iter.remove());
        
        assertEquals("List is empty, cannot delete element", exception.getMessage());
//        try {
//        	iter.remove();	
//        }catch(Exception e) {
//        	System.out.println(e.getMessage());
//        }
    }
    
    @Test
    public void testRemoveWithOneElement() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        Iterator<Integer> iter = list.iterator();        
        list.add(1);
        list.printList();
        System.out.println("<- printed list with one element\n");
        assertEquals(1, list.size()); //check size of list, should equal 1        
        iter.remove();
        list.printList();
        System.out.println("<- printed list with removed first element");
        assertEquals(0, list.size()); //check size of list, should equal 0
    }
      
    @Test
    public void testRemoveWithTwoElement() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        Iterator<Integer> iter = list.iterator();        
        list.add(1);
        list.printList();
        System.out.println("<- printed list with one element\n");
        assertEquals(1, list.size()); //check size of list, should equal 1
        list.add(2);
        list.printList();
        System.out.println("<- printed list with two element\\n");
        assertEquals(2, list.size()); //check size of list, should equal 2
        
        iter.remove();
        list.printList();
        System.out.println("<- printed list with removed first element");
        assertEquals(1, list.size()); //check size of list, should equal 1
    }
}
