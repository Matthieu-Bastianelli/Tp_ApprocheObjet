package main;

import entity.AdressePostale;
import entity.Personne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test de la classe AdressePostale :
		
		// 1ere AdressePostale
		System.out.println("Test Adresse Postale : \r\n\nPremière AdressePostale :");
		AdressePostale adresse1 = new AdressePostale(85, "Rue de la sarriette",34000,"Montpellier");
		adresse1.affiche();

		// 2e AdressePostale
		System.out.println("Deuxième AdressePostale :");
		AdressePostale adresse2 = new AdressePostale(132, "Rue des Genévriers",34100,"Manosque");
		adresse2.affiche();
		

		//Test de la classe Personne :

		// 1ere Personne
		System.out.println("Test Personne : \r\n\nPremière Personne :");
		Personne personne1 = new Personne("Bastianelli","Matthieu",adresse1);
		System.out.println(personne1.toString());
		personne1.adressePostale.affiche();


		// 1ere Personne
		System.out.println("\nDeuxième Personne :");
		Personne personne2 = new Personne("Bastianelli","Abdenour",adresse2);
		System.out.println(personne2.toString());
		personne2.adressePostale.affiche();
		
	}

}
