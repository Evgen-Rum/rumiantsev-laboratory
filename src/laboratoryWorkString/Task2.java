package laboratoryWorkString;
/*
Заменить в строке все слова black на white без учета регистра.
 */

import Util.DemoStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < DemoStrings.testLinesArray.length; i++) {
            Pattern pattern = Pattern.compile("(?i)\\bblack\\b");
            Matcher matcher = pattern.matcher(DemoStrings.testLinesArray[i]);
            String newStr = matcher.replaceAll("white");
            System.out.println(newStr);
        }
    }
}
