package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFavorite, int argentPossede) {
		super(nom, boissonFavorite, argentPossede);
	}
	public int seFaireExtorquer() {
		int argentperdu = argentPossede;
		System.out.println(parler() + "J'ai tout perdu ! Le monde est trop injuste...");
		argentPossede -= argentPossede;
		return argentperdu;
	}
	public void recevoir(int argent) {
		argentPossede += argent;
		System.out.println(parler() + argent + " sous ! Je te remercie généreux donateur!");
	}
}
