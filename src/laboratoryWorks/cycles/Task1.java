package laboratoryWorks.cycles;
/*
Напишите программу, где пользователь вводит любое целое положительное число. А программа
считает суммирует все числа от 1 до введенного пользователем числа.
 */

import Util.UtilMethods;

public class Task1 {
    public static void main(String[] args) {
        int enteredNumber = UtilMethods.readIntFromConsole(4, "Please enter" +
                "some integer number!");
        if (enteredNumber > 0) {
            long sumOfAllNumbers = 0;
            for(int i = 0; i <= enteredNumber; i++) {
                sumOfAllNumbers += i;
            }
            System.out.println("The result of the sum of all numbers from 1 to the entered number: "
                    + sumOfAllNumbers);
        } else {
            System.out.println("Incorrect number! Please re-enter!");
        }
    }
}
