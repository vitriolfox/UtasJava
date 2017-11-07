package Allat;

public class Main {
    public static void main(String[] args) {
        Allat[] falka = new Allat[5];

        Kutya bloki = new Kutya("Blöki",1,1,4);
        Kutya jeno = new Kutya("Jenő",2,2,4);
        Kutya beno = new Kutya("Benő",3,3,4);

        Macska vilmos = new Macska("Vilmos", 4,4);
        Macska luca = new Macska("Luca", 5,5);


        falka[0] = bloki;
        falka[1] = jeno;
        falka[2] = beno;
        falka[3] = vilmos;
        falka[4] = luca;

        for(int i = 0; i < falka.length; i ++){
            if (falka[i] instanceof Macska) {
                bloki.eszik(falka[i]);
                System.out.println(bloki.nev + " megette " + falka[i].nev + "t.");
            }
        }

        for(int i = 0; i < falka.length; i ++){
            System.out.println(falka[i].getClass());
        }

        for(Allat allat: falka) {
            System.out.println(allat.getClass());
        }


    }
}
