package Allat;

public class Kutya extends SzarazfoldiAllat implements Ragadozo {


    public Kutya(String nev, int jollakottsag, int ero, int labakszama) {
        super(nev, jollakottsag, ero, 4);
    }

    public void eszik(Allat allat){
        jollakottsag += 10;
    };
    public void pihen(){
        System.out.println("Éccakavan kutyunak");
    };

    public String hangotAd(){
        return "Vau-Vau";
    }
}
