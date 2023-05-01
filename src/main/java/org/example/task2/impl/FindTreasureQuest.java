package org.example.task2.impl;

import org.example.task2.IQuest;
import org.example.task2.InputHelper;

import java.util.Scanner;

public class FindTreasureQuest implements IQuest {
    private static String task;
    private int correctCount = 0;

    public FindTreasureQuest() {
        task = "Вам необходимо найти путь к сокровищу!\nДля этого выполните три задания!";

    }

    @Override
    public void passQuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(task);

        System.out.println("Задание 1:  2 + 2 = ");
        int i = InputHelper.getIntInput();
        if (i == 4) {
            System.out.println("Верно!");
            correctCount++;
        } else System.out.println("Неверно! :(");

        System.out.println("\nЗадание 2:  5 * 5 = ");
        i = InputHelper.getIntInput();
        if (i == 25) {
            System.out.println("Отлично!");
            correctCount++;
        } else System.out.println("Увы, неправильно! :(");

        System.out.println("\nЗадание 3:  121 : 11 = ");
        i = InputHelper.getIntInput();
        if (i == 25) {
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
