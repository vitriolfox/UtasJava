package Gyakorlas;
import java.util.Random;

public class Random0100 {
    public static void main(String[] args) {

        Random rand1 = new Random();
        Random rand2 = new Random();

        int randA = rand1.nextInt(100);
        int randB = rand2.nextInt(100);

        if (randA >= randB) {
            System.out.println("random A: " + randA);
            System.out.println("random B: " + randB);
            System.out.println("A - B = " + (randA - randB));
        } else {
            System.out.println("random A: " + randA);
            System.out.println("random B: " + randB);
            System.out.println("B - A = " + (randB - randA));
        }
    }
}
