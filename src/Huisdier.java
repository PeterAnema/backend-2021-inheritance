public abstract class Huisdier {

    // attributen
    String naam;
    int leeftijd;

    // constructor
    public Huisdier() {
        this.leeftijd = 0;
        this.naam = "onbekend";
    }
    public Huisdier(int leeftijd, String naam) {
        this.leeftijd = leeftijd;
        this.naam = naam;
    }

    // getters en setters
    public String getNaam() {
        return naam;
    }

    // methode
    public String info() {
        return "Ik ben " + naam + " ik ben " + leeftijd + " jaar oud.";
    }

    public abstract String getRas();
    public abstract String maakGeluid();

}
