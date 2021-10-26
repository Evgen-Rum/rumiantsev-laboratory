package laboratoryWorks.branching;
/*
Найти max{min(a,b), min(c,d)} - т.е. максимальное значение из двух выражений, в первом из которых
мы находим минимальное из двух чисел, а во втором - минимальное из двух других. Использовать только
оператор условного перехода или тернарный оператор. Запрещается использовать Math.max() и Math.min().
*/

import Util.UtilMethods;

public class Task1 {
        public static void main(String[] args) {
            int aValue = UtilMethods.readIntFromConsole(2, "Please enter some integer" +
                    " value for a number!");
            int bValue = UtilMethods.readIntFromConsole(3, "Please enter some integer" +
                    "value for b number!");
            int minAB;
            if (aValue > bValue && aValue != bValue) {
                minAB = bValue;
            } else {
                minAB = aValue;
            }
            int cValue = UtilMethods.readIntFromConsole(4,"Please enter some integer" +
                    "value for c number!");
            int dValue = UtilMethods.readIntFromConsole(5,"Please enter some integer" +
                    "value for d number! ");
            int minCD;
            if (cValue > dValue && cValue != dValue) {
                minCD = dValue;
            } else {
                minCD = cValue;
            }
            if (minCD > minAB) {
                System.out.println("Maximum value of two expression: " + minCD);
            } else if (minCD < minAB) {
                System.out.println("Maximum value of two expression: " + minAB);
            } else {
                System.out.println("Both expression values are equal!");
            }
        }
    }
