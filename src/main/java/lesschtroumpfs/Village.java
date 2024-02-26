package lesschtroumpfs;

import java.util.ArrayList;

public class Village {
	private String nom;
	private ArrayList<Schtroumpf> schtroumpfs;
	private int nbSchtroumpf;
	private int stockSalsepareille;

	/**
	 * Constructeur par défaut permettant de créer un village appelé pfNomV avec un stock de
	 * salsepareille pfStockSalsepareille et les nom des Schtroumpfs de pfNomsDesSchtroumpfs.
	 * 
	 * @param pfNomV IN : Nom que l'on souhaite donner au village.
	 * @param pfStockSalsepareille IN : Stocke de salsepareille que l'on souhaite donner au village.
	 * @param pfNomsDesSchtroumpfs IN : Tableau de noms des schtroumpfs qui habitent dans le village.
	 */
	public Village(String pfNomV, int pfStockSalsepareille, String[] pfNomsDesSchtroumpfs) {
		int i;

		this.nom = pfNomV;
		this.stockSalsepareille = pfStockSalsepareille;
		this.nbSchtroumpf = pfNomsDesSchtroumpfs.length;
		schtroumpfs = new ArrayList<Schtroumpf>();

		for(i = 0; i < this.nbSchtroumpf; i++) {
			this.schtroumpfs.add(new Schtroumpf(pfNomsDesSchtroumpfs[i], (int) (Math.random()*150), this));
		}
	}


	/**
	 * Permet d'obtenir le nom du village.
	 * 
	 * @return le nom du village.
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Permet d'obtenir le nombre de schtroumpf dans le village.
	 * 
	 * @return le nombre de schtroumpf dans le village.
	 */
	public int getNbSchtroumpf() {
		return this.nbSchtroumpf;
	}

	/**
	 * Permet d'obtenir le stock de salsepareille du village.
	 * 
	 * @return le stock de salsepareille du village.
	 */
	public int getStockSalsepareille() {
		return this.stockSalsepareille;
	}

	/**
	 * Permet de fêter le solstice d'été.
	 * 
	 */
	public void solstice_d_ete() {
		int nbContents;
		String presentation;
		int i;

		System.out.println("Bienvenu à la fête du solstice d'été du village de " + this.nom + ".");
		System.out.println("Il y a " + this.nbSchtroumpf + " présents à la fête !");

		nbContents = 0;
		presentation = "";
		for(i = 0; i < this.nbSchtroumpf; i++) {
			presentation += this.schtroumpfs.get(i).toString() + "\n";
			presentation += this.schtroumpfs.get(i).leChant()  + "\n";
			if(this.schtroumpfs.get(i).estContent().equals("content")) {
				nbContents++;
			}
		}
		System.out.println(nbContents + " Schtroumpfs sont contents aujourd'hui !");
		System.out.println(presentation);
	}

	/**
	 * Permet d'obtenir le chef du village.
	 * 
	 * @return le schtroumpf le plus âgé.
	 */
	public Schtroumpf chefDuVillage() {
		Schtroumpf chef;
		int i;

		chef = this.schtroumpfs.get(0);
		for(i = 1; i < this.nbSchtroumpf; i++) {
			if(this.schtroumpfs.get(i).getAge() > chef.getAge()) {
				chef = this.schtroumpfs.get(i);
			}
		}

		return chef;

	}

	/**
	 * Permet d'envoyer au travail un Schtroumpf heureux sur 2 habitant au Village.
	 * 
	 */
	public void envoyerAuTravail() {
		int i;
		boolean vaTravailler;

		vaTravailler = true;
		for(i = 0; i < this.nbSchtroumpf; i++) {
			if(this.schtroumpfs.get(i).estContent().equals("content")) {
				if(vaTravailler) {
					this.schtroumpfs.get(i).allerTravailler();
					vaTravailler = false;
				} else {
					vaTravailler = true;
				}
			}

		}
	}

	/**
	 * Permet de présenter et de faire chanter les schtroumpfs heureux du village.
	 * 
	 */
	public void schtroumpsfHeureux() {
		int i;
		String heureux;

		heureux = "";
		for(i = 0; i < this.nbSchtroumpf; i++) {
			if(this.schtroumpfs.get(i).estContent().equals("content")) {
				heureux += this.schtroumpfs.get(i).toString() + "\n";
				heureux += this.schtroumpfs.get(i).leChant() + "\n";
			}
		}

		System.out.println(heureux);
	}

	/*
	 * Permet de modifier le stock de salsepareille du village.
	 * 
	 * Précondition : pfQte doit être inférieur à this.getStockSalsepareille().
	 */
	public void modifierStockSalsepareille(int pfQte) {
		this.stockSalsepareille += pfQte;
	}

	/**
	 * Permet de faire diner tout les Schtroumpfs du village ensemble.
	 * 
	 */
	public void dinserTousEnsemble() {
		int i;

		for(i = 0; i < this.nbSchtroumpf; i++) {
			this.schtroumpfs.get(i).dinerAuVillage();
		}
	}

	/**
	 * Permet d'envoyer cueillir de la salsepareille à un Schtroumpf heureux sur 2 habitant au Village.
	 * 
	 */
	public void envoyerCueillirSalsepareille() {
		int i;
		boolean vaCueuillir;

		vaCueuillir = true;
		for(i = 0; i < this.nbSchtroumpf; i++) {
			if(this.schtroumpfs.get(i).estContent().equals("content")) {
				if(vaCueuillir) {
					this.schtroumpfs.get(i).recolterSalsepareille();
					vaCueuillir = false;
				} else {
					vaCueuillir = true;
				}
				
			}

		}
	}
}
