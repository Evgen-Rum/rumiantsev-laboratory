package laboratoryWorkString;
/*
Подсчитать, сколько раз среди символов заданной строки встречается
заданная буква.
 */

import Util.DemoStrings;

public class Task9 {
    public static void main(String[] args) {
        int countSymbol = 0;
        for (int i = 0; i < DemoStrings.testLinesArray.length; i++) {
            char[] symb = DemoStrings.testLinesArray[i].toCharArray();
            for (int j = 0; j < symb.length; j++) {
                if (symb[j] == 'a') {
                    countSymbol++;
                }
            }
        }
        System.out.println(countSymbol);
    }
}

