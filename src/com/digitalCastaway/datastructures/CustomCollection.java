package com.digitalCastaway.datastructures;

public class CustomCollection<T> {

    private static final int DEFAULT_CAPACITY = 5;
    private Object data[] = null;
    private int length = 0;

    public CustomCollection(int initialCapacity) {
        data = new Object[initialCapacity];
    }

    public int length () {
        return length;
    }

    public CustomCollection() {
       data = new Object[DEFAULT_CAPACITY];
    }

    public Object getElement(int position) {
        return data[position];
    }



    public void insert(Object element, int position) {
        if (length == data.length) {
            Object[] aux = data;
            data = new Object[data.length * 2];
            for (int i = 0; i < aux.length; i++) {
                data[i] = aux[i];
            }
            aux = null; // elimina el array aux//
        }
        for (int i = length - 1; i >= position; i--) {
            data[i + 1] = data[i];
        }
        data[position] = element;
        length++;
    }

    public void add(T element) {
        insert(element, length);
    }

    public int search(T element) {
        for (int i = 0; i < length; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public T delete(int position) {
        Object aux = data[position];

        for (int i = position; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        data[length -1] = null;
        length--;
        return (T)aux;
    }

    @Override
    public String toString() {
        if (length() == 0) {
            return "<Empty>";
        }
        String out = "";
        for (int i = 0; i < length(); i++) {
            out += i + " -[" + data[i].toString() + "] \n";
        }

        return out;
    }
}


