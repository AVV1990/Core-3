package ru.geekbrains.generics.homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array<T> {

    public void swap (T [] elements, int index1, int index2 ) {
        T c = elements [index1];
        elements[index1] = elements [index2];
        elements [index2] = c;
    }

    public ArrayList <T> changeArrayToList (T [] elements) {
        ArrayList <T> list = new ArrayList<>(Arrays.asList(elements));
        return list;
    }



}
