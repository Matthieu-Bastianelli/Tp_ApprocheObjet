package entity;

public class Personne {
	
	//Définition des attributs :
	String nom = null;
	String prenom =null;
	AdressePostale adressePostale =null;
	
	//Création d'un constructeur : (source -> Generate constructor using Fields)
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}

	//Création de la méthode toString() pour afficher les informations liées à la Personne :
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ",\n prenom=" + prenom + ",\n adressePostale=" + adressePostale + "]";
	}
	
	
	

}
