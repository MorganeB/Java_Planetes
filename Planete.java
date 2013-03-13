class Planete extends CorpsRevolution{

	/** Classe héritant de CorpsRevolution
	* et n'ayant aucun attribut supplementaire
	* Le 1er constructeur fait appel au constructeur de
	* la classe CorpsRevolution
	*/ 
	Planete(String n, double r, double m, double ro, CorpsCeleste cr){
		super(n, r, m, ro, cr);
	}
	
	/** Methode indiquand si la planete 
	* tourne autour du soleil
	* @param une planete
	*/
	boolean memeSoleil(Planete p){
		if(p.autourDe() == this.autourDe())
			return true;
		else
			return false; 
	}
	
	public String nomClasseCorps(){
		String s="Planete";
		return s; 
	}
	
	/** methode qui renvoie une chaine de caracteres
	 * contenant le type de corps 
	 * ainsi que les caracteristiques de ce corps 
	 * @param Planete p
	 */
	public static String toString(Planete p){
		String s=(p.nomClasseCorps() + " de nom : " + p.rendreNom() + " \n de rayon : " + p.getRayon() + " kilometres"
		+ "\n de densite : " + p.densite() + " par m3. \n de masse " +p.getMasse() + " tonnes. \n et tourne autour de " + p.autourDe().rendreNom() );
		return s;
	}
	
}