package laboratoryWorks.cycles;
/*
Даны два числа. Определить цифры, которые входят в запись как первого
так и второго числа. Вывести их на консоль.
 */
import Util.UtilMethods;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        int firstNumber = UtilMethods.readIntFromConsole(12345,"Please enter first" +
                " number!");
        int secondNumber = UtilMethods.readIntFromConsole(67890,"Please enter second" +
                " number!");
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i <= firstNumber; i++) {
            array.add(i, firstNumber % 10);
            firstNumber /= 10;
        }
        System.out.println(array);
    }
}
