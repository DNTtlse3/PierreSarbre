package personnages;

public class Ronin extends Humain{
	
	private int honneur=1;
	public Ronin(String nom, String boisonFavorite, int bourse) {
		
		super(nom, boisonFavorite, bourse);
		super.setForce((2*honneur));
	}
	
	public void donner(Commercant beneficiaire) {
		int jeDone = (getBourse()*10)/100;
		perdreArgent(jeDone);
		beneficiaire.recevoir(jeDone);
	}
	
	@Override
	public void parler(String texte) {
		System.out.println( "("+getNom()+")-"+texte);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if(getForce()>= adversaire.getForce()) {
			gagnerArgent(adversaire.getBourse());
			adversaire.perdre();
			honneur++;
			parler("Je t'ai eu petit Yakuuuusa!");
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getBourse());
			honneur--;
			
		}
	}
}
