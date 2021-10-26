package laboratoryWorks.cycles;
/*
Вывести на экран соответствие между символами и их численными обозначениями в памяти комьпютера
т.е. таблицу ASCII.
 */
public class Task4 {
    public static void main(String[] args) {
        for(int i = 32; i <=128; i++) {
            char symbol = (char) i;
            System.out.println("Number of symbol " + symbol + " is: " + i);
        }
    }
}