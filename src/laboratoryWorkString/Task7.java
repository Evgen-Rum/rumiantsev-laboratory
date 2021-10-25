package laboratoryWorkString;
/*
В строке после каждого символа "а" вставить символ "b".
 */

import laboratoryWorkString.util.DemoStrings;

public class Task7 {
    public static void main(String[] args) {
        putSymbol("a", "b");
    }

    public static void putSymbol(String beforeSymbol, String afterInsertingSymbol) {
        for (int i = 0; i < DemoStrings.testLinesArray.length; i++) {
            System.out.println(DemoStrings.testLinesArray[i].replaceAll(beforeSymbol,
                    beforeSymbol + "\"" + afterInsertingSymbol + "\""));
        }
    }
}
