import java.io.*;//Windows
public class Clean{
    
    public static void Linux () {
	// Action : efface la console (le terminal de linux)
      
	System.out.print("\033[H\033[2J");
    }
    
    public static void Windows(){
	// Action : efface la console (le terminal de windows)
	
	//Fonctionne ?
	try{
	    Runtime.getRuntime().exec("cls");
	}catch(IOException e){
	    System.out.println("erreur lors de 'efface de l'ecran"+e);
	}
	//?
    }
}
