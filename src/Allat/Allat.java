package Allat;

public abstract class Allat {
    protected String nev;
    protected int jollakottsag;
    protected int ero;

    public Allat(String nev, int jollakottsag, int ero) {
        this.nev = nev;
        this.jollakottsag = 100;
        this.ero = 0;
    }

    public abstract String hangotAd();

}
