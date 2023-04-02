package ru.geekbrains.homework1.part3;

public class MainApp {
    public static void main(String[] args) {
        Box <Apple> appleBox = new Box<>();
        Box <Orange> orangeBox = new Box<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        appleBox.addFruits(apple1);
        appleBox.addFruits(apple2);
        appleBox.addFruits(apple3);


        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        orangeBox.addFruits(orange1);
        orangeBox.addFruits(orange2);


        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

    }
//    Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

//    Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
//фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

//    Для хранения фруктов внутри коробки можно использовать ArrayList;

// Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
//и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);




}
