package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argentPossede;
	public Humain(String nom, String boissonFavorite, int argentPossede) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argentPossede = argentPossede;
	}
	public String getNom() {
		return nom;
	}
	public int getArgentPossede() {
		return argentPossede;
	}
	
	public int gagnerArgent(int gain) {
		int nouv_argent = argentPossede + gain;
		return nouv_argent;
	}
	
	public int perdreArgent(int perte) {
		int nouv_argent = argentPossede - perte;
		return nouv_argent;
	}
	
	public void direBonjour() {
		System.out.println(parler() +"Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boissonFavorite);
		
	}
	public String parler() {
		return "(" + getNom() + ") - ";
	}
	
	public void boire() {
		System.out.println(parler() +"Mmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= argentPossede) {
			System.out.println(parler() + "J'ai " + argentPossede + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous." );
			argentPossede = perdreArgent(prix);
		}
		else {
			System.out.println(parler() + "Je n'ai plus que " + argentPossede + " sous en poche. je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}	
	}
	
	
	

}
