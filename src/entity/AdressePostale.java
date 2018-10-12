package entity;

public class AdressePostale {
	
	//Définition des attributs
	int numeroDeRue = Integer.MIN_VALUE;
	String nomDeRue = null;
	int codePostale = Integer.MIN_VALUE;
	String nomVille = null;


	/**
	 * Création d'un constructeur :
	 * @param numeroDeRue
	 * @param nomDeRue
	 * @param codePostale
	 * @param nomVille
	 */
	public AdressePostale(int numeroDeRue, String nomDeRue, int codePostale, String nomVille){
		// importation du constructeur par défaut
		super();
		//Affectation de valeur au attribut de l'objet créé
		this.numeroDeRue = numeroDeRue;
		this.nomDeRue = nomDeRue;
		this.codePostale = codePostale;
		this.nomVille = nomVille;
	}
	
	
	
	/**
	 * Création d'une méthode 'affiche()' pour afficher les informations des objets AdressePostale :
	 */
	public void affiche() {
		System.out.println("Numero De Rue : "+numeroDeRue);
		System.out.println("Nom De Rue : "+nomDeRue);
		System.out.println("Numéro de code Postale : "+codePostale);
		System.out.println("Nom De Ville : "+nomVille+"\r\n");
	}



	//Création des getter et setter :
	public int getNumeroDeRue() {
		return numeroDeRue;
	}

	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}

	public String getNomDeRue() {
		return nomDeRue;
	}

	public void setNomDeRue(String nomDeRue) {
		this.nomDeRue = nomDeRue;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	
	
	
	

}
