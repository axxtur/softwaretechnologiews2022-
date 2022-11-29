package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

<<<<<<< HEAD
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
=======
public class AppTest {

   /* @Test
    void testApp() {
        assertEquals(1, 1);
    }*/

    @Test
    public void foo() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }
>>>>>>> origin/ana
}
