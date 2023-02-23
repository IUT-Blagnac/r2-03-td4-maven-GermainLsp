

import lesschtroumpfs.Schtroumpf;

public class MainSchtroumpf {

	public static void main (String[] argv) {
		Schtroumpf grognon;
		
		grognon = new Schtroumpf("Grognon", 135); //On cr�e le Schtroumpf grognon
		
		grognon.sePresenter(); //Il se pr�sente
		grognon.chanter(); //Il chante
		grognon.allerTravailler(); //Il va travailler
		grognon.sePresenter(); //Il se pr�sente
		grognon.chanter(); //Il chante
		grognon.manger(10); //On lui donne 10 salsepareille � manger
		grognon.sePresenter(); //Il se pr�sente
		grognon.chanter(); //Il chante
		grognon.anniversaire(); //Il f�te son anniversaire
		grognon.sePresenter(); //Il se pr�sente
		grognon.chanter(); //Il chante
		
		
		
	}

}
