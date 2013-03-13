class Satellite extends CorpsRevolution{

	/** Classe héritant de CorpsRevolution
	* et n'ayant aucun attribut supplementaire
	* Le 1er constructeur fait appel au constructeur de
	* la classe CorpsRevolution
	*/ 
	Satellite(String n, double r, double m, double ro, CorpsCeleste cr){
		super(n, r, m, ro, cr);
	}
	
	/** Methode indiquand si le satellite 
	* tourne autour du soleil
	* @param un satellite
	*/
	boolean memeSoleil(Satellite s){
		if(s.autourDe() == this.autourDe())
			return true; 
		else
			return false; 
	}
	
	public String nomClasseCorps(){
		String s="Satellite";
		return s; 
	}
	
	/** methode qui renvoie une chaine de caracteres
	 * contenant le type de corps 
	 * ainsi que les caracteristiques de ce corps 
	 * @param Satellite s
	 */
	public static String toString(Satellite sat){
		String s=(sat.nomClasseCorps() + " de nom : " + sat.rendreNom() + " \n de rayon : " + sat.getRayon() + " kilometres"
		+ "\n de densite : " + sat.densite() + " par m3. \n de masse " + sat.getMasse() + " tonnes. \n et tourne autour de " + sat.autourDe().rendreNom() );
		return s;
	}
	
}