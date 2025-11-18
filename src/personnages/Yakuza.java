package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boissonFavorite, int argentPossede,String clan) {
		super(nom, boissonFavorite, argentPossede);
		this.clan = clan;
	}
	public void extorquer(Commercant victime) {
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler(victime.getNom() + ", si tu tiens à la vie donne-moi ta bourse !");

        int argentVole = victime.seFaireExtorquer();

        argentPossede += argentVole;

        parler("J'ai piqué les " + argentVole + " sous de " + victime.getNom()
               + ", ce qui me fait maintenant " + argentPossede + " sous dans ma poche. Hi! Hi!");
    }
	
	public int perdre() {
		parler("J'ai perdu mon duel et mes " + argentPossede + " sous, snif... J'ai déshonoré le clan de" + getClan());
	return argentPossede -= argentPossede;
		
	}
	public String getClan() {
		return clan;
	}
	
	public void gagner(int gain) {
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + getClan() + " ? Je l'ai dépouillé de ses " + gain + " sous.");
		
		
	}
	public int getReputation() {
		return reputation;
	}
}