package Gyakorlas;
import java.util.Random;
import java.util.Arrays;

public class LegnagyobbSzamTombbol {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] random100 = new int[100];

        for (int i = 0; i < random100.length; i++) {
            random100[i] = rand.nextInt(100);
            System.out.print(random100[i] + " ");
        }
        Arrays.sort(random100);
        System.out.println();
        System.out.println("Maximum = " + random100[random100.length-1]);
        System.out.println("Maximum előtti = " + random100[random100.length-2]);

        }
    }