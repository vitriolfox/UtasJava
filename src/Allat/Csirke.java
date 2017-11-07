package Allat;

public class Csirke extends SzarazfoldiAllat implements Novenyevo {

    public Csirke(String nev, int jollakottsag, int ero) {
        super(nev, jollakottsag, ero, 2);
    }

    public String hangotAd() {
        return "Csipp-csipp";
    }

    public void eszik(){
        System.out.println("Magokat eszik.");
    };
    public void pihen(){
        System.out.println("Éccakavan pipinek");
    };
}
