package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	
	@Override
	public void parler(String texte) {
		System.out.println( "("+getNom()+")-"+texte);
	}
	
	public void seFaireExtorquer() {
		perdreArgent(getBourse());
		if(getBourse()<=0) {
			parler(" J’ai tout perdu! Le monde est trop injuste...");
		}
		
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(getBourse()+" sous ! Je te remercie généreux donateur...");
	}
	
	
	
}
