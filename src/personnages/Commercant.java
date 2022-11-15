package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	@Override
	public void parler(String texte) {
		System.out.println("(" + getNom() + ")-" + texte);
	}

	public int seFaireExtorquer() {
		int argentExtorque = getBourse();
		perdreArgent(argentExtorque);
		if (getBourse() <= 0) {
			parler(" J'ai tout perdu! Le monde est trop injuste...");
		}
		return argentExtorque;
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(getBourse() + " sous ! Je te remercie généreux donateur...");
	}

}
