package laboratoryWorks.cycles;

/*
Для каждого натурального числа в промежутке от m до n вывести все
делители, кроме единицы и самого числа.
 */
import Util.UtilMethods;

public class Task7{
    public static void main(String[] args) {
        int mValue = UtilMethods.readIntFromConsole(2,"Please enter m value!");
        int nValue = UtilMethods.readIntFromConsole(4,"Please enter n Value!");
        if (mValue <= nValue) {
            for (int i = mValue; i <= nValue; i++) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0 && i != j) {
                        System.out.println("For number " + i + " divider: " + j);
                    }
                }
            }
        }
    }
}
