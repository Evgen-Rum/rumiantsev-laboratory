package laboratoryWorkString;
/*
Дан массив строк в camelCase. Преобразовать входные данные в snake_case.
 */

import laboratoryWorkString.util.DemoStrings;

import java.util.Locale;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < DemoStrings.testLinesArray.length; i++) {
            String testLine = DemoStrings.testLinesArray[i].replaceAll("([a-z])([A-Z])",
                    "$1_$2");
            System.out.println(testLine.toLowerCase());
        }
    }
}
