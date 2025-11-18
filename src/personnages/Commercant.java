package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFavorite, int argentPossede) {
		super(nom, boissonFavorite, argentPossede);
	}
	public int seFaireExtorquer() {
        int argentperdu = argentPossede;
        parler("J'ai tout perdu ! Le monde est trop injuste...");
        argentPossede = 0;
        return argentperdu;
    }

    public void recevoir(int argent) {
        argentPossede += argent;
        parler(argent + " sous ! Je te remercie, généreux donateur !");
    }
}
