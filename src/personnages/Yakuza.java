package personnages;

public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 4;
	
	public Yakuza(String nom, String boisonFavorite, int bourse, String clan) {
		super(nom, boisonFavorite, bourse);
		super.setForce(reputation);
		this.clan = clan;
	}
	
	
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	
	
	@Override
	public void parler(String texte) {
		System.out.println( "("+getNom()+")-"+texte);
	}
	
	public void extorquer(Commercant victime) {
		if(victime.getBourse() > 0) {
			gagnerArgent(victime.getBourse());
			parler("J’ai piqué les "+victime.getBourse() +" sous de " +victime.getNom()+" , ce qui me fait "+getBourse()+
			" sous dans ma poche. Hi ! Hi !");
			victime.seFaireExtorquer();
			reputation++;
	
		}
		
	}
	
	public void gagner(int gain) {
		setReputation((reputation+1));
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre "+ getNom()+ " du clan de " +clan+ " ?Je l'ai dépouillé de ses "+ gain+" sous.");
		
	}
	
	public void perdre() {
		setReputation((reputation-1));
		parler("J'ai perdu mon duel et mes "+getBourse()+" sous,snif... J'ai déshonoré le clan de "+clan+".");
		perdreArgent(getBourse());
		
	}
	

	
	

}
