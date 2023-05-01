package org.example.task2;

import org.example.task2.impl.FindTreasureQuest;
import org.example.task2.impl.SavePrincessQuest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight(new FindTreasureQuest());
        knight.getQuest().passQuest();
        Knight knight2 = new Knight(new SavePrincessQuest());
        knight2.getQuest().passQuest();
    }
}