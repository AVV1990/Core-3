package ru.geekbrains.homework1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit> {

    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>(Arrays.asList());
    }

    public List<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        if (!fruits.isEmpty()) {
            return fruits.size() * fruits.get(0).getWeight();
        } else return 0.0f;
//        float weight = 0.0f;
//        for (Fruit fruit : fruits) {
//            weight += fruit.getWeight();
//        }
//        return weight;
    }


    // метод добавления фрукта в коробку
    public void addFruits(T fruit) {
        fruits.add(fruit);
    }


//    Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
// равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами

    public boolean compare(Box another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }


    // to do  Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
//    объекты, которые были в первой

    public void pour(Box<T> another) {
        List<T> anotherList = another.getFruits();
        for (T fruit : anotherList) {
            fruits.add(fruit);
        }
        another.fruits.clear();
    }


}
