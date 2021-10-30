package laboratoryWorkString;
/*
Найти самое длинное слово в тексте и вывести его на экран.
 */

import Util.DemoStrings;

public class Task10 {
    public static void main(String[] args) {
        String maxLengthWord = "";
        for (int i = 0; i < DemoStrings.testLinesArray.length; i++) {
            System.out.println(DemoStrings.testLinesArray[i].trim().replaceAll("\\s{2,}", " "));
            String[] words = DemoStrings.testLinesArray[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() >= maxLengthWord.length()) {
                    maxLengthWord = words[j];
                }
            }
        }
        System.out.printf("The longest word in text is: %s", maxLengthWord);
    }
}
