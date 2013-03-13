class Etoile extends CorpsCeleste{

	private double temperature;				//la temperature moyenne, en Kelvin
	public final static double K = 1.414213; 
	
	/* constructeur 
	* on peut appeler le constructeur de la classe CorpsCeleste
	*/
	Etoile(String nm, double ray, double mas, double temp){
		super(nm, ray, mas);					// execute le corps du constructeur CorpsCeleste
		temperature=temp; 						
	}
	
	
	/* metode nomClasseCorps   
	* ne doit pas etre declaree static car 
	* chaque objet peut appartenir a une classe differente
	*/ 
	public String nomClasseCorps(){
		String s="Etoile";
		return s;
	}
	
	/*methode energieRecue
	* permet de calculer l'energie qu'un corps situe a une certaine distance
	* devrait recevoir
	*/ 
	public double energieRecue(int distance){
		double energie=(K * temperature) / (distance * distance); 
		return energie;
	}
	
	/** methode qui renvoie une chaine de caracteres
	 * contenant le type de corps 
	 * ainsi que les caracteristiques de ce corps 
	 * @param Etoile e 
	 */
	public static String toString(Etoile e){
		String s=(e.nomClasseCorps() + " de nom : " + e.rendreNom() + " \n de rayon : " + e.getRayon() + " kilometres"
		+ "\n de densite : " + e.densite() + " par m3. \n de masse " +e.getMasse() + " tonnes. \n" + " et dont la temperature est de : " +e.temperature + " degres K.");
		return s;
	}	
}

	