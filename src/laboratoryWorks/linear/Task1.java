package laboratoryWorks.linear;
/*
Вычислить значение функции z = ((a-3) * b /2) + c
 */
import Util.UtilMethods;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = UtilMethods.readIntFromConsole(1,"Please enter some value" +
                "for number a!");
        int numberB = UtilMethods.readIntFromConsole(1,"Please enter some value" +
                "for number b");
        int numberC = UtilMethods.readIntFromConsole(1,"Please enter some value" +
                "for number c");
        int numberZ = ((numberA - 3) * numberB / 2) + numberC;
        System.out.println("The result of evaluating an expression: " + numberZ);
    }
}