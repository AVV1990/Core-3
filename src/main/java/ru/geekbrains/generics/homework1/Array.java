package ru.geekbrains.generics.homework1;

public class Array<T> {

    public void swap (T [] elements, int index1, int index2 ) {
        T c = elements [index1];
        elements[index1] = elements [index2];
        elements [index2] = c;
    }

    public void changeArrayToList (T [] elements) {

    }



}
