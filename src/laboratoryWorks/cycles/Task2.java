package laboratoryWorks.cycles;
/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

import Util.UtilMethods;

public class Task2 {
    public static void main(String[] args) {
        double numberForReverse = UtilMethods.readDoubleFromConsole(123.456,"Please enter" +
                " the number in the nnn,ddd format!");
        double reversedNumber = (numberForReverse * 1000) % 1000 + (int) numberForReverse / 1000.0;
        System.out.println("Entered number for reversing: " + numberForReverse +  "\nReversed number is: "
                + reversedNumber);
    }
}
