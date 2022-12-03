/*
 * (c) 2013-2021  Heinrich Hussmann und Uwe Aßmann, TU Dresden
 */
package com.example;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * Achtung! Einige der Methoden sind fehlerhaft und müssen repariert werden.
 */
public class SimpleLinkedList<E> extends AbstractCollection<E> implements Collection<E> {
    private class Elem {
        private E elem;
        private Elem next;

        public Elem(E elem, Elem next) {
            this.elem = elem;
            this.next = next;
        }
    }

    private Elem start = null;
    private Elem end = null;
    private int size = 0;

    @Override
    public boolean add(E o) {
        Elem e = new Elem(o, null);
        if (start == null) { //if list is empty, start and end point to e
            start = e;
            end = e;
        }else{	
            end.next = e; //insert e at the end of the list
            end = e; //e become new end of the list
        }
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }
    
  //Method to print the LinkedList for testing and debugging
    public void printList(){
        Elem currNode = start;
    
        System.out.print("LinkedList: ");
    
        //Traverse through the LinkedList
        while (currNode != null) {
            // Print the element at current node
            System.out.print(currNode.elem + " ");
    
            //Go to next node
            currNode = currNode.next;
        }
    }

    private class Iter implements Iterator<E> {
        private Elem current;

        public Iter() {
            current = start;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            current = current.next;
            return current.elem;
        }

        @Override
		public void remove() {
			//if list empty, throw exception, otherwise remove head
			if (start == null) {
				throw new NullPointerException("List is empty, cannot delete element"); 
			}else {
				//if list has more than one element
				if (size > 1) {
					start = start.next; //start pointing to next element
					size -= 1;
					//old start will be lost (unreachable) and automatically deleted by garbage collector
				}else {
					//if list contains only one element;
					start = null;
					end = null;
					size -= 1;
				}
			}
			
		}
    }

    @Override
    public Iterator<E> iterator() {
        return new Iter();
    }
}
