package projetinfo;

public class fonctions {
	
	boolean estVideArbreb(arbreb a) {
		if (a.nbrCles == 0) return true;
		else return false;
		
	}
	
	boolean rechercherArbreb(arbreb a,int cle) {
		if (estVideArbreb(a)) {return false;}
		else {
			int i = 0;
			while (cle > a.cles[i] && i< a.nbrCles) {
				i = i+1;	
			}
			if (cle == a.cles[i]) return true;
			else rechercherArbreb(a.fils[i], cle);
		}
		return false; // ne sera jamais effectué, utile pour ne pas avoir une erreur.
	}
	
	void insererArbreb(arbreb a, int valeur) {
		
	}
	
	
	
}
