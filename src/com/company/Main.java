package com.company;

import java.util.*;

import static java.util.Collections.list;
import static java.util.Collections.swap;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение в первый лист: ");
            listA.add(scanner.next());
        }

        System.out.println(listA);
        System.out.println("-------------");

        ArrayList<String> listB = new ArrayList<>();

        while (listB.size() != 5) {
            System.out.println("Введите значение во второй лист: ");
            listB.add(scanner.next());
        }

        System.out.println(listB);
        Collections.reverse(listB);
        System.out.println("---------------");

        System.out.println("--------------");

        ArrayList<String> listC = new ArrayList<>(10);

        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }

        System.out.println(listC);
        System.out.println("---------------");

        listC.sort(Comparator.comparingInt(String::length));
        System.out.println(listC);
    }
}
