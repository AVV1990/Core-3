package ru.geekbrains.generics.homework1;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        Integer [] intArr = {1,2,3,4,5,6};
        String [] stringArr = {"A", "B", "C", "D", "E"};

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(stringArr));

        Array <Integer> integerArray = new Array<> ();
        Array <String> stringArray = new Array<> ();

        integerArray.swap(intArr, 1,2);
        stringArray.swap(stringArr, 1,2);

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(stringArr));




    }
//    Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);



}
