package laboratoryWorks.branching;
/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным. (Треугольник не может существовать, если сумма
его углов не равна 180).
 */


import Util.UtilMethods;

public class Task3 {
        public static void main(String[] args) {
        double firstAngle = UtilMethods.readDoubleFromConsole(20.5,"Please enter some" +
                "value for first angle!");
        double secondAngle = UtilMethods.readDoubleFromConsole(10.5,"Please enter some" +
                "value for second angle!");
        double thirdAngle = 180 - (firstAngle + secondAngle);
        if (firstAngle > 0 && firstAngle < 178 && secondAngle > 0 && secondAngle < 178 &&
                thirdAngle > 0 && thirdAngle < 178) {
            System.out.println("Triangle is exists!");
        } else if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90) {
            System.out.println("Triangle is rectangular!");
        } else {
            System.out.println("Triangle isn't exists!");
        }
    }
}

