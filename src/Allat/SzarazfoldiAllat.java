package Allat;

public abstract class SzarazfoldiAllat extends Allat {
     private int labakszama;

    public SzarazfoldiAllat(String nev, int jollakottsag, int ero, int labakszama) {
        super(nev, jollakottsag, ero);
        this.labakszama = labakszama;
    }
}

