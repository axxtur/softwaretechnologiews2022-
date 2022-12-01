package com.example;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

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

    private class Iter implements Iterator<E> {
        private Elem current;

        public Iter() {
            current = start;
        }

    /*    public Elem getCurrent() {
            return current;
        }*/

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
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iter();
    }
}
