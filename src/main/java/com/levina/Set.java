package com.levina;


import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Set {

    public static void main(String... args) {

        java.util.Set<String> vegetables = new LinkedHashSet<>();
        vegetables.add("Авокадо");
        vegetables.add("Батат");
        vegetables.add("Брокколи");
        vegetables.add("Огурец");
        vegetables.add("Авокадо");
        vegetables.add("Кабачок");

        System.out.println(vegetables.size());

        for (String element : vegetables) {
            System.out.println(element);
        }

        java.util.Set<String> fruitsAndVegetables = new TreeSet<>();

        System.out.println(fruitsAndVegetables.isEmpty());

        fruitsAndVegetables.add("Ананас");
        fruitsAndVegetables.add("Банан");
        fruitsAndVegetables.add("Картофель");
        fruitsAndVegetables.add("Виноград");
        fruitsAndVegetables.add("Апельсин");

        System.out.println(fruitsAndVegetables.isEmpty());
        System.out.println(fruitsAndVegetables.size());

        fruitsAndVegetables.addAll(vegetables);

        System.out.println(fruitsAndVegetables.contains("Авокадо"));

        System.out.println(fruitsAndVegetables.size());

        for (String element : fruitsAndVegetables) {
            System.out.println(element);
        }
    }
}
