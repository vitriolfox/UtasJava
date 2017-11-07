import ember.Ellenor;
import ember.Utas;

import static java.lang.Integer.parseInt;

//név életkor jegyek_száma bérletes-e

public class UtasMain {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        Utas elsoUtas = new Utas(args[0], parseInt(args[1]),parseInt(args[2]), false);
        if (args[3].equals("igen")){
            elsoUtas.setBerletes(true);
        } else {
            elsoUtas.setBerletes(false);
        }

        Utas masodikUtas = new Utas(args[4], parseInt(args[5]),parseInt(args[6]), false);
        if (args[7].equals("igen")){
            masodikUtas.setBerletes(true);
        } else {
            masodikUtas.setBerletes(false);
        }

        System.out.println(elsoUtas.toString());
        System.out.println(masodikUtas.toString());

        elsoUtas.felszall();
        masodikUtas.felszall();

        Ellenor ellenor = new Ellenor("Laci", 2);

        ellenor.ellenoriz(elsoUtas);
        ellenor.ellenoriz(masodikUtas);



    }
}
