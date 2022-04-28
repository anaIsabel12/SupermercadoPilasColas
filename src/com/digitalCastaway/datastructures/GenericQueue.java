package com.digitalCastaway.datastructures;

public class GenericQueue<T> {
    private final static int CAPACIDAD_INICIAL = 5;

    private GenericCollection<T> collection = new GenericCollection<T>(CAPACIDAD_INICIAL);

    public void enqueue(T element) {
        collection.add(element);
    }
}
