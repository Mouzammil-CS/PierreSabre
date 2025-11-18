package personnages;

public class Yakuza extends Humain {
	private String clan;

	public Yakuza(String nom, String boissonFavorite, int argentPossede,String clan) {
		super(nom, boissonFavorite, argentPossede);
		this.clan = clan;
	}
	public void extorquer(Commercant victime) {
		System.out.println(parler() + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		System.out.println(victime.getNom() + "si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		argentPossede += victime.argentPossede;
		System.out.println(parler() + "J'ai piqué les " + victime.getArgentPossede() + "sous de " + victime.getNom() + " , ce qui me fait " + argentPossede + " sous dans ma poche. Hi! Hi");
		
	}

}
