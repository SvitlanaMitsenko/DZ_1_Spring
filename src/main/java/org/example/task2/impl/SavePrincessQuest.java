package org.example.task2.impl;

import org.example.task2.IQuest;
import org.example.task2.InputHelper;

import java.util.Scanner;

public class SavePrincessQuest implements IQuest {
    private static String task;
    private int correctCount = 0;

    public SavePrincessQuest() {
        task = "Чтобы спасити принцессу необходимо отгадать три загадки!";

    }

    @Override
    public void passQuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(task);

        System.out.println("Загадка 1: Сто одёжек и и все без застёжек, это - ...");
        String s = InputHelper.getStringInput();
        if (s.equals("лук") || s.equals("капуста")) {
            System.out.println("Верно!");
            correctCount++;
        } else System.out.println("Неверно! :(");

        System.out.println("\nЗагадка 2: Без окон без дверей полна горница людей = ");
        s = InputHelper.getStringInput();
        if (s.equals("арбуз")) {
            System.out.println("Отлично!");
            correctCount++;
        } else System.out.println("Увы, неправильно! :(");

        System.out.println("\nЗагадка 3: Сговорились две ноги делать дуги и круги = ");
        s = InputHelper.getStringInput();
        if (s.equals("циркуль")) {
            System.out.println("Круто!");
            correctCount++;
        } else System.out.println("Неправильно! :(\n");

        if (correctCount >= 2) {
            System.out.println(getSuccess());
        } else System.out.println(getFault());

    }

    private void printTask() {

    }

}

