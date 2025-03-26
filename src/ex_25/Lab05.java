package ex_25;

public class Lab05 {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);

            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}