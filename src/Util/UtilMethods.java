package Util;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UtilMethods {
    public static int readIntFromConsole(int defaultValue, String messageToUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messageToUser);
        for (int i = 0; i < 4; i++) {
            int enteredNumber;
            if (scanner.hasNextInt()) {
                enteredNumber = scanner.nextInt();
                return enteredNumber;
            } else if (i < 3) {
                System.out.println("Incorrect value! Please re-enter!");
                scanner.next();
            } else {
                System.out.println("3 times entered incorrect value! Used default value = " + defaultValue);
                enteredNumber = defaultValue;
                return enteredNumber;
            }
        }
        return defaultValue;
    }

    public static double readDoubleFromConsole(double defaultValue, String messageToUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messageToUser);
        for (int i = 0; i < 4; i++) {
            double enteredNumber;
            if (scanner.hasNextDouble()) {
                enteredNumber = scanner.nextDouble();
                return enteredNumber;
            } else if (i < 3) {
                System.out.println("Incorrect value! Please re-enter!");
                scanner.next();
            } else {
                System.out.println("3 times entered incorrect value! Used default value = " + defaultValue);
                enteredNumber = defaultValue;
                return enteredNumber;
            }
        }
        return defaultValue;
    }

    public static String readStringFromConsole(String defaultValue, String messageToUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messageToUser);
        for (int i = 0; i < 3; i++) {
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