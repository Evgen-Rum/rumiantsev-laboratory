package laboratoryWorks.cycles;
/*
Составить программу нахождения произведения квадратов первых двухсот чисел
(можно использовать java.Math.BigInteger / java.Math.BigDecimal)
 */

import Util.UtilMethods;

import java.math.BigInteger;

public class Task5 {
    public static void main(String[] args) {
        BigInteger calculatingNumber = BigInteger.valueOf(0);
        int numberOfSquaredNumbers = UtilMethods.readIntFromConsole(200, "Please enter" +
                "number of squared numbers!");
        for(int i = 0; i < numberOfSquaredNumbers; i++) {
            calculatingNumber = calculatingNumber.add(BigInteger.valueOf((long) i).pow(2));
        }
        System.out.println("The sum of the squares of the first " + numberOfSquaredNumbers + " numbers is: "
                + calculatingNumber);
    }
}
