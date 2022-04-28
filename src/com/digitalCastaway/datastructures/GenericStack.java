package com.digitalCastaway.datastructures;

public class GenericStack<T> {
    private static final int CAPACIDAD_INICIAL = 5;
    private static final int TOP = 0;
    private GenericCollection<T> colLection = new GenericCollection<T>(CAPACIDAD_INICIAL);

    public void push(T element) {
        colLection.insert(element, TOP);
    }

    public T pop() {
        return colLection.delete(TOP);
    }

}
