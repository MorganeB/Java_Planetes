/**
* Cette classe se trouve au sommet de la hierarchie
* nom du corps, son rayon et sa masse 
*@author Morgane
**/

class CorpsCeleste{

	private String nom; 
	private double rayon;		// en km
	private double masse;		//en kg 
	
	//constructeur permettant d'initialiser les valeurs 
	public CorpsCeleste(String n, double r, double m){
		nom=n;
		if(r <= 0)
			rayon=1;
		else
		rayon=r;
		
		if(m <= 0)
			masse=1;
		else
			masse=m;
	}
	
	/** methode retournant la chaine de caracteres "Corps celeste"
	*/
	public String nomClasseCorps(){
		String s="Corps celeste";
		return s;
	}
	
	public double densite(){
		double volume=((4/3) * Math.PI * (rayon*rayon*rayon));
		double densite=masse/volume;
		return densite;
	}
	
	public String rendreNom(){
		return nom;
	}
	
	public double getRayon(){
		return rayon; 
	}
	
	public double getMasse(){
		return masse;
	}
	
	
	public static String toString(CorpsCeleste corps){
		String s=(corps.nomClasseCorps() + " de nom : " + corps.rendreNom() + " \n de rayon : " + corps.getRayon() + " kilometres"
		+ "\n de masse " + corps.getMasse() + " tonnes. \n");
		return s;
	}
	

}