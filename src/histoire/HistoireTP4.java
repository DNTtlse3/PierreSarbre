package histoire;
import personnages.*;
public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		
		Humain paul = new Humain("paul","Vin Rouge",54);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Commercant marco = new Commercant("Marco", "thé", 15);
		Yakuza yang = new Yakuza("Yaku Le Noir", "Whisky", 30, "Yamotooh");
		Commercant kumi = new Commercant("Kumi", "thé", 15);
		Commercant chonin = new Commercant("Chonin", "Mojito", 40);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		
		
		paul.direBonjour();
		paul.acheter("boisson", 12);
		paul.boire();
		paul.acheter("jeu", 2);
		paul.acheter("kimono", 50);
		
		
		
		marco.direBonjour();
		marco.boire();
		
		
		yang.direBonjour();
		yang.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là  ?");
		yang.parler("Si tu tiens à  la vie donne moi ta bourse.");
		yang.extorquer(marco);
		
		roro.parler(marco.getNom()+" prends ces "+((roro.getBourse()*10)/100)+" sous");
		roro.donner(marco);
		
		roro.provoquer(yang);
		
		
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		kumi.faireConnaissanceAvec(marco);
		roro.faireConnaissanceAvec(yaku);
		
		marco.listerConnaissane();
		
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissane();
	
		
		


		
	}

}
