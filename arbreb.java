package projetinfo;


public class arbreb {
	int ordre; 
	int nbrCles;
	int cles[];
	arbreb fils[];
	
	void creerArbrebVide(int ordre) {
		this.ordre = ordre;
		this.nbrCles = 0;
		this.cles = new int[2*ordre];
		this.fils = new arbreb[ordre*2+1];
		}
	
	
}

