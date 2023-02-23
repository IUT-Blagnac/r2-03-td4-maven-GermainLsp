package lesschtroumpfs;

public class Schtroumpf {
	private String nom;
	private int age;
	private String estContent;
	private Village village;


	/**
	 * Constructeur permettant d'initialiser les champs nom et age aux valeurs
	 * pfNom et pfAge et le champ content à true.
	 * 
	 * @param pfNom IN : Valeur que l'on souhaite attribuer au nom.
	 * @param pfAge IN : Valeur que l'on souhaite attribuer à l'âge.
	 */
	public Schtroumpf(String pfNom, int pfAge) {
		this.nom = pfNom;
		this.age = pfAge;
		this.estContent = "content";
		this.village = null;
	}

	/**
	 * Constructeur par défaut permettant d'initialiser les champs nom, age et village aux valeurs
	 * pfNom, pfAge et pfVillage et le champ content à true.
	 * 
	 * @param pfNom IN : Valeur que l'on souhaite attribuer au nom.
	 * @param pfAge IN : Valeur que l'on souhaite attribuer à l'âge.
	 * @param pfVillage IN : Valeur que l'on souhaite attribuer au village.
	 */
	public Schtroumpf(String pfNom, int pfAge, Village pfVillage) {
		this.nom = pfNom;
		this.age = pfAge;
		this.estContent = "content";
		this.village = pfVillage;
	}

	/**
	 * Permet de récupérer le village du schtroumpf.
	 * 
	 * @return le village du schtroumpf.
	 */
	public Village getVillage() {
		return this.village;
	}

	/*
	 * Permet de définir le village du schtroumpf à pfVillage.
	 * 
	 * @param pfVillage IN : Valeur que l'on souhaite donner au village.
	 */
	public void setVillage(Village pfVillage) {
		this.village = pfVillage;
	}	

	/**
	 * Permet d'obtenir le nom du schtroumpf.
	 * 
	 * @return le nom du schtroumpf.
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Permet d'obtenir l'âge du schtroumpf.
	 * 
	 * @return l'âge du schtroumpf.
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * Permet de s'avoir si le schtroumpf est content.
	 * 
	 * @return une chaine de caractère indiquant si le schtroumpf est content, pas content ou TRES TRES PAS CONTENTS !!!.
	 */
	public String estContent() {
		return this.estContent;
	}

	/**
	 * Permet d'obtenir le String du schtroumpf.
	 * 
	 * @return le schtroumpf en String.
	 */
	public String toString() {
		String presentation;

		presentation = "Je suis " + this.nom + ", j'ai " + this.age + " ans, je suis " + this.estContent + " et";
		if(this.village != null) {
			presentation += " j'habite dans le Village " + this.village.getNom();
		} else {
			presentation += " je suis ermite";
		}

		return presentation;
	}

	/**
	 * Permet de présenter le schtroumpf.
	 * 
	 */
	public void sePresenter() {
		System.out.println(this.toString());
	}

	/*
	 * Permet de récupérer le chant du schtroumpf.
	 * 
	 * @return le chant du schtroumpf.
	 */
	public String leChant() {
		String chant;

		chant = "la, la, la Schtroumpf la, la";
		if(!this.estContent.equals("content")) {
			chant = "gloups";
		}

		return chant;
	}

	/**
	 * Permet de faire chanter le schtroumpf.
	 * 
	 */
	public void chanter() {
		System.out.println(this.leChant());
	}

	/**
	 * Permet d'ajouter 1 an au schtroumpf.
	 * 
	 */
	public void anniversaire() {
		this.age++;
	}

	/**
	 * Permet de donner à manger de la salsepareille au schtroumpf et le rend content si pfQte > 0.
	 * 
	 * @param pfQte IN : Quantité de salsepareille que l'on souhaite donner au schtroumpf.
	 */
	public void manger(int pfQte) {
		if(pfQte > 0) {
			this.estContent = "content";
		}
	}

	/**
	 * Fait aller travailler le schtroumpf et le rend pas content.
	 * 
	 */
	public void allerTravailler() {
		if(!this.estContent.equals("content")) {
			this.estContent = "TRES TRES TRES PAS CONTENTS !!!";
		} else {
			
		this.estContent = "pas content";
		}
	}
	
	/**
	 * Permet d'aller faire récolter de la salsepareille au schtroumpf et le rend pas content.
	 * 
	 */
	public void recolterSalsepareille() {
		if(this.getVillage() != null) {
			this.getVillage().modifierStockSalsepareille(5);
			if(!this.estContent.equals("content")) {
				this.estContent = "TRES TRES TRES PAS CONTENTS !!!";
			} else {
				
			this.estContent = "pas content";
			}
		} else {
			this.estContent = "content";
		}
		
	}
	
	/**
	 * Permet de faire diner au village le schtroumpf.
	 * 
	 */
	public void dinerAuVillage() {
		if(this.getVillage() != null && this.getVillage().getStockSalsepareille() >= 3) {
			this.getVillage().modifierStockSalsepareille(-3);
			this.estContent = "content";
		} else {
			this.estContent = "pas content";
		}
	}
}
