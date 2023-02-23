

import lesschtroumpfs.Village;

public class MainVillage {

	public static void main (String[] argv) {
		Village village;
		
		String[] nomsSchtroumpfs = {
		        "Grand Schtroumpf", "Schtroumpf courant (et pas ordinaire)", "Schtroumpf ordinaire (et pas courant)", "Schtroumpf moralisateur � lunettes",
		        "Schtroumpf boudeur", "Schtroumpf volant", "Schtroumpf �tonn�", "Schtroumpf acrobate", "Schtroumpf paresseux"
		};
		
		village = new Village("Bonjour", 0, nomsSchtroumpfs);
		village.solstice_d_ete();
		
		
		System.out.println("Chef du village :");
		village.chefDuVillage().sePresenter(); //On pr�sente le chef du village.
		System.out.println();
		
		village.envoyerAuTravail(); //On envoie des schtroumpfs au trvail.
		
		System.out.println("Schtroumpfs heureux :");
		village.schtroumpsfHeureux(); //On affiche les Schtroumpfs heureux.
		
		
		//On affiche le stock de salsepareille puis on demande au schtroumpfs d'aller en cueillir.
		System.out.println("Stock de salsepareille : " + village.getStockSalsepareille());
		village.envoyerCueillirSalsepareille();
		System.out.println("Stock de salsepareille : " + village.getStockSalsepareille());
		
		System.out.println("Schtroumpfs heureux :");
		village.schtroumpsfHeureux(); //On affiche les Schtroumpfs heureux.
		
		//On fait diner tous les schtroumpfs du Village puis on affiche le stock de salsepareille et on fait une f�te.
		village.dinserTousEnsemble();
		System.out.println("Stock de salsepareille : " + village.getStockSalsepareille());
		
		village.solstice_d_ete();
		
	}

}
