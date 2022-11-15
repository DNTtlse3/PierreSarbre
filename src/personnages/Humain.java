package personnages;

public class Humain {
	
	private String nom;
	private String boisonFavorite;
	private int bourse;
	private int force=1;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[3];
	
	public Humain(String nom, String boisonFavorite, int bourse) {
		this.nom = nom;
		this.boisonFavorite = boisonFavorite;
		this.bourse = bourse;
	}
	
	public void setForce(int force) {
		this.force = force;
	}
	
	public String getBoisonFavorite() {
		return boisonFavorite;
	}
	
	public int getForce() {
		return force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getBourse() {
		return bourse;
	}
	public void direBonjour() {
		String texte =" Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + this.boisonFavorite+" .";
		parler(texte);	
	}
	public void boire() {
		String texte = "Mmmm, un bon verre de " + this.boisonFavorite +".... ! GLOUPS !";
		parler(texte);	
	}
	
	public void gagnerArgent(int gain) {
		this.bourse += gain;
	}
	
	public void perdreArgent(int perte) {
		this.bourse -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if(bourse > prix) {
			parler("J'ai "+getBourse()+" sous en poche. Je vais pouvoir m'offrir un "+ bien +" à "+prix+" sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que "+ getBourse() +" sous en poche. Je ne peux même pas m'offrir un "+ bien +" à "+prix+" sous.");
		}	
	}
	protected void parler(String texte) {
		System.out.println( "("+ getNom()+ ")-"+texte);
	}
	
	public void listerConnaissane() {
		parler("Voici mes connaissance");
		for(int k = 0 ; k < nbConnaissance; k++) {
			parler(memoire[k].getNom());
		}
	}
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);

	}
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);

	}
	private void memoriser(Humain humain) {
		if(nbConnaissance < memoire.length) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}
	}
}
