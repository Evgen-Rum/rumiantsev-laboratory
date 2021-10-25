package laboratoryWorkString;
/*
Удалить в строке все лишние пробелы.
 */

import laboratoryWorkString.util.DemoStrings;

public class Task5 {
    public static void main(String[] args) {
        for (int i = 0; i < DemoStrings.testLinesArray.length; i++) {
        System.out.println(DemoStrings.testLinesArray[i].trim().replaceAll("\\s{2,}", " "));
        }
    }
}
