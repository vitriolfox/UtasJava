package ember;

public class Ellenor extends Ember{
    private int megbuntetettekSzama;

    public Ellenor(String nev, int kor) {
        super(nev, kor);
    }


    public int getMegbuntetettekSzama() {
        return megbuntetettekSzama;
    }

    public void setMegbuntetettekSzama(int megbuntetettekSzama) {
        this.megbuntetettekSzama = megbuntetettekSzama;
    }

    public void ellenoriz(Utas utas){
        if (utas.isBerletes() == false && utas.isErvenyesitett() == false){
            System.out.println("Megbüntettem " + utas.getNev() + "-t 5000 Ft-ra!");
            megbuntetettekSzama ++;
        }
    }
}
