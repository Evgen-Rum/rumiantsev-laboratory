package Util;

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

    //    public static String readStringFromConsole(String defaultValue) {
//        Scanner scanner = new Scanner(System.ioLaboratory.resources.in);
//        int attempts = 0;
//        System.out.println("Please enter your line!");
//        while (true) {
//           String enteredLine = scanner.nextLine();
//            if (!enteredLine.matches(".*\\d+.*")) {
//                return enteredLine;
//            } else if (attempts < 2) {
//                System.out.println("Incorrect value! Please re-enter!");
//                attempts++;
//            } else {
//                System.out.println("3 times incorrect value entered! Used default value!");
//                return defaultValue;
//            }
//        }
//    }
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
