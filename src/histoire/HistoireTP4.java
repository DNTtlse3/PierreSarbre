package histoire;
import personnages.Humain;
public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		
		Humain paul = new Humain("paul","Vin Rouge",54);
		paul.direBonjour();
		paul.acheter("boisson", 12);
		paul.boire();
		paul.acheter("jeu", 2);
		paul.acheter("kimono", 50);
		
	}

}
