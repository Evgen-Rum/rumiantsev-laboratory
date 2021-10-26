package laboratoryWorks.linear;
/*
Вычислить значение выражения по формуле (все переменные принимают действительные значенияю):
((b + Math.sqrt(b^2 + 4 * a * c)) / 2 * a) - a^3 + b^-2
 */

import Util.UtilMethods;

public class Task4 {
    public static void main(String[] args) {
        int aValue = UtilMethods.readIntFromConsole(2,"Please enter a value!");
        int bValue = UtilMethods.readIntFromConsole(2, "Please enter b value!");
        int cValue = UtilMethods.readIntFromConsole(2,"Please enter c value!");
        double firstPartOfExpression = Math.pow(bValue, 2) + 4 * aValue * cValue;
        double secondPartOfExpression = Math.pow(aValue, 3) * cValue + Math.pow(bValue, -2);
        double thirdPartOfExpression = ((bValue + Math.sqrt(firstPartOfExpression)) / 2 * aValue)
                - secondPartOfExpression;
        System.out.println("The result of this expression is: " + thirdPartOfExpression);
    }
}