package org.example.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {
    public static int getIntInput(){
        Scanner input = new Scanner(System.in);
        do {
            try{
               // System.out.print("Enter an integer: ");
                int number = input.nextInt();
                return number;

            }
            catch (InputMismatchException ex) {
             //   System.out.println("Try again. ("Incorrect input: an integer is required)");
                System.out.println("Неправильный ввод - введите целoе число!");
                input.nextLine();
            }
        }
        while (true);
    }
    public static String getStringInput(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}

