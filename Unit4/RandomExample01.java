package Unit4;
import java.util.Random;

public class RandomExample01 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println("From Random no 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(r1.nextInt(1000) + " ");
        }

        Random r2 = new Random();
        System.out.println("\nFrom Random no 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(r2.nextInt(1000) + " ");
        }
    }
}
