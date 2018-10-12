package entity;

public class AdressePostale {
	
	//Définition des attributs
	int numeroDeRue = Integer.MIN_VALUE;
	String nomDeRue = null;
	int codePostale = Integer.MIN_VALUE;
	String nomVille = null;
	
	//Création d'un constructeur :
	public AdressePostale(int numeroDeRue, String nomDeRue, int codePostale, String nomVille){
		
		// importation du constructeur par défaut
		super();
		//Affectation de valeur au attribut de l'objet créé
		this.numeroDeRue = numeroDeRue;
		this.nomDeRue = nomDeRue;
		this.codePostale = codePostale;
		this.nomVille = nomVille;
	}
	
	//Création d'une méthode 'affiche()' pour afficher les informations des objets AdressePostale :
	public void affiche() {
		System.out.println("Numero De Rue : "+numeroDeRue);
		System.out.println("Nom De Rue : "+nomDeRue);
		System.out.println("Numéro de code Postale : "+codePostale);
		System.out.println("Nom De Ville : "+nomVille+"\r\n");
	}
	
	

}