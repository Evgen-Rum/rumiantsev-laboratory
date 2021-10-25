package laboratoryWorkString;
/*
В строке найти количество цифр.
 */

import Util.DemoStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String testLine = DemoStrings.testLinesArray[1];
        Pattern pattern = Pattern.compile("(?<=[\\s,])\\d(?=[\\s,])");
        Matcher matcher = pattern.matcher(testLine);
        int count = 0;
        int positionInLine = 0;
        while (matcher.find(positionInLine)) {
            positionInLine = matcher.end();
            count++;
        }
        System.out.printf("Number of numbers in line: %s", count);
    }
}
