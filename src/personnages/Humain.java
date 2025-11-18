package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	protected int argentPossede;
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
		return argentPossede + gain;
	}
	
	public int perdreArgent(int perte) {
		return argentPossede - perte;
	}
	
	public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boissonFavorite + ".");
        
    }
	public String parler() {
        return "(" + getNom() + ") - ";
    }
	
	public void parler(String texte) {
        System.out.println(parler() + texte);
    }
	
	public void boire() {
        parler("Mmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }
	
	public void acheter(String bien, int prix) {
        if (prix <= argentPossede) {
            parler("J'ai " + argentPossede + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
            argentPossede = perdreArgent(prix);
        } else {
            parler("Je n'ai plus que " + argentPossede + " sous en poche. Je ne peux même pas m'offrir " 
                   + bien + " à " + prix + " sous.");
        }
    }
	
	
	

}
