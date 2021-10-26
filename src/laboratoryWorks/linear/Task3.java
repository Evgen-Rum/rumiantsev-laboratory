package laboratoryWorks.linear;
/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительность в часах, минутах и секундах.
 */

import Util.UtilMethods;

public class Task3 {
    public static void main(String[] args) {
        int enteredSeconds = UtilMethods.readIntFromConsole(123456,"Please enter number" +
                "of seconds!");
        int numberOfHours = enteredSeconds / 3600;
        int numberOfMinutes = (enteredSeconds % 3600) / 60;
        int remainingSeconds = enteredSeconds - (numberOfHours * 3600 + numberOfMinutes * 60);
        System.out.println(numberOfHours + " h. " + numberOfMinutes + " min. " + remainingSeconds + " sec. ");
    }
}
