package ru.geekbrains.homework1.part3;

public class MainApp {
    public static void main(String[] args) {
        Box <Apple> appleBox = new Box<>();
        Box <Orange> orangeBox = new Box<>();
        Box <Orange> orangeBox1 = new Box<>();

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

        orangeBox1.pour(orangeBox);

        System.out.println(orangeBox.getWeight());

        System.out.println(orangeBox1.getWeight());


//        System.out.println(orangeBox.getWeight());
//        System.out.println(appleBox.getWeight());
//        System.out.println(appleBox.compare(orangeBox));

    }


}
