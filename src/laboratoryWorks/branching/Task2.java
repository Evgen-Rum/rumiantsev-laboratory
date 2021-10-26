package laboratoryWorks.branching;
/*
Вычислить значение функции...
 */

import Util.UtilMethods;

public class Task2 {
    public static void main(String[] args) {
        double xValue = UtilMethods.readDoubleFromConsole(2.3,"Please enter x value!");
        double calculationOfExpression;
        if (xValue <= 3) {
            calculationOfExpression = Math.pow(xValue, 2) - 3 * xValue + 9;
            System.out.println("The result of calculations is: " + calculationOfExpression);
        } else {
            calculationOfExpression = 1 / (Math.pow(xValue, 3) + 6);
            System.out.println("The result of calculations is: " + calculationOfExpression);
        }
    }
}
