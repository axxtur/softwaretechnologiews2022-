package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.util.Iterator;




public class AppTest {

   /* @Test
    void testApp() {
        assertEquals(1, 1);
    }*/


    @Test
	void testAdd() {
		SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>(); //create empty list
		assertEquals(list.size(), 0); //check size of list, should equal 0
		list.add(1); //add 3 into list 
		assertEquals(list.size(), 1); //check size of list, should equal 1
		list.add(2);//add 5 into list
		assertEquals(list.size(), 2); //check size of list, should equal 2
        list.add(3);
        assertEquals(list.size(), 3); //check size of list, should equal 2
        
        for (int i = 0; i < 10; i++) {
            if (list.iterator().hasNext()==true) {
                list.iterator().next();
            }
            else if(list.iterator().hasNext()==false){
                list.add(4);
            }      
            else{
                list.iterator().remove();
            }     
        }
        
    }

    

        

}
