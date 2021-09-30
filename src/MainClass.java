import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Huisdier> huisdieren = new ArrayList<>();

        Hond hond1 = new Hond("Herder", 5, "kort harig", "Bello");
        huisdieren.add(hond1);

        Hond hond2 = new Hond("Poedel", 2, "wit krul harig", "Pinkje");
        huisdieren.add(hond2);

        Kat kat1 = new Kat("Cyprisch", 3, "lang harig", "Veerle", 7);
        huisdieren.add(kat1);

        for (Huisdier huisdier: huisdieren) {
            System.out.println(huisdier.info());
            System.out.println(huisdier.maakGeluid());
        }

    }

}
