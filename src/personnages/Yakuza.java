package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boisonFavorite, int bourse, String clan) {
		super(nom, boisonFavorite, bourse);
		super.setForce(reputation);
		this.clan = clan;
	}

	@Override
	public void parler(String texte) {
		System.out.println("(" + getNom() + ")-" + texte);
	}

	public void extorquer(Commercant victime) {
		if (victime.getBourse() > 0) {
			int argentExtorque = victime.seFaireExtorquer();
			gagnerArgent(argentExtorque);
			parler("J'ai pique les " + argentExtorque + " sous de " + victime.getNom() + " , ce qui me fait "
					+ getBourse() + " sous dans ma poche. Hi ! Hi !");
			
			reputation++;

		}

	}

	public void gagner(int gain) {
		reputation++;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ?Je l'ai dépouillé de ses "
				+ gain + " sous.");

	}

	public void perdre() {
		reputation--;
		parler("J'ai perdu mon duel et mes " + getBourse() + " sous,snif... J'ai déshonoré le clan de " + clan + ".");
		perdreArgent(getBourse());

	}
	@Override
	public void direBonjour() {
		String texte =" Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoisonFavorite()+" .";
		parler(texte);
		parler("Mon clan est celui de "+ clan);
	}

}
