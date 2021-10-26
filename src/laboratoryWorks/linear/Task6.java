package laboratoryWorks.linear;
/*
Для данной области составить линейную программу, которая печатает true если точка
с координатами (x, y) принадлежит закрашенной области, и false - в противном случае.
 */

import Util.UtilMethods;

public class Task6 {
    public static void main(String[] args) {
        double xValue = UtilMethods.readDoubleFromConsole(2.1,"Please enter x value!");
        double yValue = UtilMethods.readDoubleFromConsole(2.1,"Please enter y value!");
        if (yValue <= 4 && yValue >= -3 && xValue <= 4 && xValue >= -4) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}