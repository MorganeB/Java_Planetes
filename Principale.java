import java.util.Scanner;

class Principale{
	public static void main(String args []){
	Scanner sc=new Scanner(System.in); 
	
	//creation d'un tableau de 4 CorpsCeleste
	CorpsCeleste[] corps; 
	corps=new CorpsCeleste[4];
	
	//initialisation des objets
	Etoile soleil=new Etoile("Soleil", 695342, 1.989*Math.pow(10, 30), 5750); 
	Planete terre=new Planete("Terre", 6378.137, 5.978*Math.pow(10, 24), 288.15, soleil);
	Planete mars=new Planete("Mars",3396, 641.85*Math.pow(10, 21), 210, soleil);
	Satellite lune=new Satellite("Lune", 1734.4, 7.3477*Math.pow(10, 22), 196, terre); 
	
	//instanciation du tableau
	corps[0]=soleil;
	corps[1]=terre;
	corps[2]=mars; 
	corps[3]=lune;
	
	
	//affichage des informations 
	System.out.println(Etoile.toString(soleil));
	System.out.println("\n \n");
	
	System.out.println(Planete.toString(terre));
	System.out.println("\n \n");
	
	System.out.println(Planete.toString(mars));
	System.out.println("\n \n");
	
	System.out.println(Satellite.toString(lune) + "\n \n Appuyer sur Entree pour quitter");
	sc.nextLine();	
	
	}
}


