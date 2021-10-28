package Exceptions;
/*
Создать исключительную ситуацию, при которой будет брошено исключение
IndexOutOfBoundsException, выход за пределы массива. Обработать ее в блоке try
catch и вывести на экран сообщение "Выход за пределы массива"
 */

import Util.UtilMethods;

public class Task1 {
    public static void main(String[] args) {
        int arrayLength = UtilMethods.readIntFromConsole(3, "Please enter array length" +
                " value!");
        int [] myArray = new int[arrayLength];
        for (int i = 0; i <= myArray.length; i++) {
            try {
                myArray[i] += i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bounds of an array!");
            }
            System.out.printf("Number of test iteration: %d \n", i);
        }
    }
}
