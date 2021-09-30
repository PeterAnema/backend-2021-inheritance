public class Hond extends Huisdier {

    // attributen
    String vachtType;
    boolean vals;
    String ras;

    // constructor
    public Hond() {
    }
    public Hond(String ras, int leeftijd, String vachtType, String naam) {
        super(leeftijd, naam);

        this.ras = ras;
        this.vachtType = vachtType;
        this.vals = false;
    }

    // setters and getters


    // methodes
    @Override
    public String info() {
        String s = super.info();
        s += "Ik ben een " + vachtType + " " + ras + ".";
        return s;
    }

    public String getRas() {
        return "Ik ben een hond van het ras " + ras;
    }

    public String maakGeluid() {
        return "Blaf blaf";
    }
}
