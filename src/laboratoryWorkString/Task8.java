package laboratoryWorkString;
/*
Проверить, является ли заданное слово палиндромом используя
методы работы с текстом (не превращать строку в массив символов).
 */

import Util.UtilMethods;

public class Task8 {
    public static void main(String[] args) {
        String variable = UtilMethods.readStringFromConsole("level", "Please enter " +
                "some work to check for palindrome!");
        StringBuilder stringBuilder = new StringBuilder(variable).reverse();
        String reversingVariable = stringBuilder.toString();
        if (variable.equalsIgnoreCase(reversingVariable)) {
            System.out.printf("Entered word (%s) is palindrome!", variable);
        } else {
            System.out.printf("Entered word (%s) isn't palindrome!", variable);
        }
    }
}
