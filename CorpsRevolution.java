/** Cette classe est utilisee pour representer l’ensemble 
 * des corps qui tournent, soit autour d’un soleil, 
 * soit autour d’un autre corps.
 **/

class CorpsRevolution extends CorpsCeleste{

	private double rayon_orbital; 
	private CorpsCeleste centre_revolution; 
	
	
	//constructeur permettant d'initialiser les valeurs.
	CorpsRevolution(String n, double r, double m, double ro, CorpsCeleste cr){
		super(n, r, m);
		rayon_orbital=ro;
		centre_revolution=cr;
	}
	
	public double rendreRayonOrbital(){
		return rayon_orbital;
	}
	
	public String nomClasseCorps(){
		String s="Corps en revolution";
		return s; 
	}
	
	public CorpsCeleste autourDe(){
		return centre_revolution;
	}	
	
}