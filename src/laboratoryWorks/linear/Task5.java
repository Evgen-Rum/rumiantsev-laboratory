package laboratoryWorks.linear;
/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((sin x + cos y) / (cos x - sin y)) * tg xy
 */

import Util.UtilMethods;

public class Task5 {
    public static void main(String[] args) {
        double xValue = UtilMethods.readDoubleFromConsole(2.1,"Please enter x value!");
        double yValue = UtilMethods.readDoubleFromConsole(2.1,"Please enter y value!");
        double firstExpression = Math.toDegrees(Math.sin(xValue)) + Math.toDegrees(Math.cos(yValue));
        double secondExpression = Math.toDegrees(Math.cos(xValue)) - Math.toDegrees(Math.sin(yValue));
        double thirdResultingExpression = firstExpression / secondExpression * Math.toDegrees(Math.tan(xValue)
                * Math.tan(yValue) );
        System.out.println("The result of calculation is: " + thirdResultingExpression);
    }
}
