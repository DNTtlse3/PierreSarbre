package personnages;

public class Humain {
	
	private String nom;
	private String boisonFavorite;
	private int bourse;
	
	protected Humain(String nom, String boisonFavorite, int bourse) {
		this.nom = nom;
		this.boisonFavorite = boisonFavorite;
		this.bourse = bourse;
	}
	
	public void setBourse(int bourse) {
		this.bourse = bourse;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getBourse() {
		return bourse;
	}
	public void direBonjour() {
		String texte = "Bonjour ! Je m'appelle" + getNom() + " et j'aime boire du " + this.boisonFavorite;
		parler(texte);	
	}
	public void boire() {
		String texte = "Mmmm, un bon verre de " + this.boisonFavorite +".... ! GLOUPS !";
		parler(texte);	
	}
	public void acheter(String bien, int prix) {
		int cout;
		switch(bien) {
		
		case "boisson":
						cout= 12;
						assezDargent(prix, cout, bien);
						break;
						
		case     "jeu":
						cout = 2;
						assezDargent(prix, cout, bien);
						break;
		default       :
			
					parler("J'ai pas compris votre demande");
					break;				
		}
	}
	
	private void assezDargent(int prix, int cout, String bien) {
		if(prix > cout) {
			parler("J'ai"+getBourse()+" sous en poche. Je vais pouvoir m'offrir un"+ bien +" à "+prix+" sous.");
			setBourse(getBourse()-cout);	
		}
		else {
			parler("Je n'ai plus que"+ getBourse() +" sous en poche. Je ne peux même pas m'offrir un "+ bien +"à "+cout+" sous.");
		}	
	}
	
	private void parler(String texte) {
		System.out.println(texte);
	}
	
}
