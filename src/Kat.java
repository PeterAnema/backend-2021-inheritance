public class Kat extends Huisdier {

    // attributen
    String vachtType;
    boolean vals;
    String ras;
    int gewicht;

    // constructor
    public Kat(String ras, int leeftijd, String vachtType, String naam, int gewicht) {
        super(leeftijd, naam);

        this.vachtType = vachtType;
        this.ras = ras;
        this.gewicht = gewicht;
    }

    // methodes
    @Override
    public String info() {
        return "Hallo ik ben " + naam + ". Ik ben kat, een " + vachtType + " " + ras + " van " + leeftijd + " jaar oud.";
    }

    public String getRas() {
        return "Ik ben een kat van het ras " + ras;
    }

    public String maakGeluid() {
        return "Miauw";
    }
}
