package ember;

public class Utas extends Ember {
    private int jegyekSzama;
    private boolean isBerletes;
    private boolean isErvenyesitett = false;


    public Utas(String nev, int kor, int jegyekSzama, boolean isBerletes) {
        super(nev, kor);
        this.jegyekSzama = jegyekSzama;
        this.isBerletes = isBerletes;
    }


    public int getJegyekSzama() {
        return jegyekSzama;
    }

    public void setJegyekSzama(int jegyekSzama) {
        this.jegyekSzama = jegyekSzama;
    }

    public boolean isBerletes() {
        return isBerletes;
    }

    public void setBerletes(boolean berletes) {
        isBerletes = berletes;
    }

    public boolean isErvenyesitett() {
        return isErvenyesitett;
    }

    public void setErvenyesitett(boolean ervenyesitett) {
        isErvenyesitett = ervenyesitett;
    }

    public void felszall(){
        if (!isBerletes && jegyekSzama > 0){
            isErvenyesitett = true;
            jegyekSzama --;
            System.out.println("Felszálltam, de nincs berletem,érvényesítettem egy jegyet, " + jegyekSzama + " jegyem maradt.");
        } else if (!isBerletes && jegyekSzama <= 0){
            System.out.println("Felszálltam, de nincs berletem, és mar jegyem sincs, ezert lehet megbuntetnek.");
        } else {
            System.out.println("Felszálltam, bérlettel.");
        }

    }

    @Override
    public String toString() {
        return "Utas{" +
                "jegyek száma: " + jegyekSzama +
                ", Van bérlete?: " + isBerletes +
                ", Érvényesítette a bérletét?:" + isErvenyesitett +
                "} " + super.toString();
    }
}
