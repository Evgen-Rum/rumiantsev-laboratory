package laboratoryWorkString.util;
/*
В строке найти количество чисел.
 */

import java.util.Scanner;

public class ConsoleReader {
    public static String readStringFromConsole(String defaultValue, String messageToUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messageToUser);
        for(int i = 0; i < 3; i++) {
            String enteredLine = scanner.nextLine();
            if (!enteredLine.matches(".*\\d+.*")) {
                return enteredLine;
            } else {
                System.out.println("Incorrect value! Please re-enter");
            }
        }
        System.out.println("Incorrect value! Used default value: " + defaultValue);
        return defaultValue;
    }
}
