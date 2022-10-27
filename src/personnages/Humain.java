package personnages;

public class Humain {
	
	private String nom;
	private String boisonFavorite;
	private int bourse;
	private int force=1;
	
	public Humain(String nom, String boisonFavorite, int bourse) {
		this.nom = nom;
		this.boisonFavorite = boisonFavorite;
		this.bourse = bourse;
	}
	
	public void setForce(int force) {
		this.force = force;
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
	public void acheter(String bien, int prix) {

		switch(bien) {
		case "boisson":
						assezDargent(prix,bien);
						break;				
		case     "jeu":
						assezDargent(prix,bien);
						break;
						
		case  "kimono":
			            assezDargent(prix, bien);
			            break;
		default       :			
					parler("J'ai pas compris votre demande");
					break;				
		}
	}
	
	public void gagnerArgent(int gain) {
		this.bourse += gain;
	}
	
	public void perdreArgent(int perte) {
		this.bourse -= perte;
	}
	
	private void assezDargent(int prix, String bien) {
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
	
	
}
