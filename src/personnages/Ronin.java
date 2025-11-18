package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argentPossede) {
		super(nom, boissonFavorite, argentPossede);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = (argentPossede/10);
		parler(beneficiaire.getNom() + " prend ces " + argentDonne + " sous.");
		beneficiaire.recevoir(argentDonne);
		argentPossede -= argentDonne;	
	}

	public int getHonneur() {
		return honneur;
	}
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (honneur >= adversaire.getReputation()) {
			parler("je t'ai eu petit Yakuza");
			argentPossede += adversaire.getArgentPossede();
			adversaire.perdre();
			honneur++;
		}
		else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(argentPossede);
			argentPossede -= argentPossede;
		}
		
	}
}
