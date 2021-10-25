package laboratoryWorkString;
/*
Найдите наибольшее количество пробелов идущих подряд в тексте.
 */

import laboratoryWorkString.util.DemoStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
public static void main(String[] args) {
    String demoLine = "  Made something         for create something    !       ";
    int maxNumberOfSpaces = 0;
    Matcher matcher = Pattern.compile("(.)\\1+").matcher(demoLine);
    while (matcher.find()) {
        String subString = matcher.group();
        if (subString.length() > maxNumberOfSpaces) {
            maxNumberOfSpaces = subString.length();
        }
    }
    System.out.printf("Maximum spaces number is: %d", maxNumberOfSpaces);
}
}
