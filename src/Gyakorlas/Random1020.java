package Gyakorlas;
import java.util.Random;

public class Random1020 {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();

        int randA = rand1.nextInt(50) + 1;
        int randB = rand2.nextInt(50) + 1;

        System.out.println("==========================");
        System.out.println("random A: " + randA);
        System.out.println("random B: " + randB);
        System.out.println("==========================");
        System.out.println("A + B = " + (randA + randB));
        System.out.println("A * B = " + (randA * randB));

    }
}
