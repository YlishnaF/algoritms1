package ru.geekbrains.lession1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//         Создание массива и поиск числа 89 в созданном массиве путем перебора
              int[] masInt = new int[10];
        for (int i = 0; i < 10; i++) {
            masInt[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(masInt));

        long startInt = System.nanoTime();

        for (int i = 0; i < masInt.length; i++) {
            if (masInt[i] == 89) {
                System.out.println("в массиве есть число 95");
                break;
            }
        }

        long endInt = System.nanoTime();

        System.out.println("Затрачено времени для поиска int " + (endInt - startInt));

        String[] masString = new String[10];
        String[] s = {"sky", "sun", "wood", "earth", "grass", "water", "world", "wind", "stone", "cloud"};

        for (int i = 0; i < 10; i++) {
            masString[i] = s[(int) (Math.random() * 10)];

        }
        System.out.println(Arrays.toString(masString));

        long startString = System.nanoTime();

        for (int i = 0; i < masString.length; i++) {
            if (masString[i].equals("sky")) {
                System.out.println("В массиве есть слово sky");
                break;

            }
        }

        long endString = System.nanoTime();
        System.out.println("Затрачено времени для поиска String " + (endString - startString));

        Person[] persons = new Person[10];
        persons[0] = new Person("Vasya");
        persons[1] = new Person("Kolya");
        persons[2] = new Person("Stas");
        persons[3] = new Person("Olga");
        persons[4] = new Person("Vera");
        persons[5] = new Person("Yulia");
        persons[6] = new Person("Sasha");
        persons[7] = new Person("Ivan");
        persons[8] = new Person("Dasha");
        persons[9] = new Person("Masha");


//        for (Person p: persons) {
//            p.info();
//        }
        long startPerson = System.nanoTime();

        for (int i = 0; i < persons.length ; i++) {
            if(persons[i].name.equals("Sasha")){
                System.out.println("Существует персона с имененм  Sasha");
                break;
            }
        }
        long endPerson = System.nanoTime();
        System.out.println("Затрачено времени для поиска Персоны - "+ (endPerson - startPerson));
    }

}