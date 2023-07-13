package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        first = 12;
        second = 1;
        if (first > second) {
            System.out.println(first);
        } else if (first == second) {
            System.out.println(first + "" + second);
        } else if (first < second) {
            System.out.println(second);
        } else
            System.out.println("Ader");
    }
}
