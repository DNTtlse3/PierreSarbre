package personnages;

public class Samourai extends Humain{
	
	private String seigneur;

	public Samourai(String seigneur,String nom, String boisonFavorite,int bourse) {
		super(nom, boisonFavorite, bourse);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		super.direBonjour();
		parler("Je suis fier de servir "+ seigneur);
	}
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? "
				+ "Tiens je vais prendre du "+ boisson);
	}

}
