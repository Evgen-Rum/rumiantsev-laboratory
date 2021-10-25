package laboratoryWorkString;
/*
Найдите наибольшее количество пробелов идущих подряд в тексте.
 */

import laboratoryWorkString.util.DemoStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        int maxNumberOfSpaces = 0;
        for (int i = 0; i < DemoStrings.testLinesArray.length; i++) {
            Matcher matcher = Pattern.compile("(.)\\1+").matcher(DemoStrings.testLinesArray[i]);
            while (matcher.find()) {
                String subString = matcher.group();
                if (subString.length() > maxNumberOfSpaces) {
                    maxNumberOfSpaces = subString.length();
                }
            }
        }
        System.out.printf("Maximum spaces number is: %d", maxNumberOfSpaces);
    }
}
