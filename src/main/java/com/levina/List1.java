package com.levina;

import java.util.ArrayList;
import java.util.List;

public class List1 {

    public static void main(String... args) {

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Авокадо");
        vegetables.add("Батат");
        vegetables.add("Брокколи");
        vegetables.add("Огурец");
        vegetables.add("Авокадо");
        vegetables.add("Кабачок");

        //Проверка, есть ли элемент "Брокколи" в листе
        System.out.println(vegetables.contains("Брокколи"));
        // размер листа
        System.out.println("Размер листа ревен " + vegetables.size());
        //Выбираем часть листа
        System.out.println(vegetables.subList(2, 6));

        java.util.List<String> fruitsAndVegetables = new ArrayList<>();
        fruitsAndVegetables.add("Ананас");
        fruitsAndVegetables.add("Банан");
        fruitsAndVegetables.add("Картофель");
        fruitsAndVegetables.add("Виноград");
        fruitsAndVegetables.add("Апельсин");

        // размер листа
        System.out.println("Размер листа до добавления объектов из листа vegetables " + fruitsAndVegetables.size());

        //Добавляем объекты из листа vegetables в лист fruitsAndVegetables, начиная с 3 индекса
        fruitsAndVegetables.addAll(3, vegetables);

        System.out.println("Размер листа после добавления оъектов из листа vegetables " + fruitsAndVegetables.size());

        fruitsAndVegetables.remove(1);
        ((ArrayList<String>) fruitsAndVegetables).trimToSize();
        System.out.println("Размер листа после удаления 1 объекта " + fruitsAndVegetables.size());

        for (String s : fruitsAndVegetables) {
            System.out.println(s);
        }
    }
}
