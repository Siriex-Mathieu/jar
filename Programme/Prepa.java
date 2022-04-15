import java.util.*;

public class Prepa {

    public int pv;
    public int pvmax;
    public int dommage;
    public int resistance;
    public int vitesseAttaque;

    public Prepa(int a, int b, int c, int d){

	this.pv=a;
	this.pvmax=a;
	this.dommage=b;
	this.resistance=c;
	this.vitesseAttaque=d;

    }

    public int Arme(){
	Ut.clearConsole();
	System.out.println("Liste des armes : \n");
	System.out.println("1) Epée : +10 points de dommage");
	System.out.println("2) Bouclier : +20 points de resistance et -5 points de dommage");
	System.out.println("3) Hache : +20 points de dommage et -15 points de vitesse d'Attaque\n");
	System.out.print("Choisi une arme : ");
	
	int choix = Ut.saisirEntier();
	
	if(choix == 1){
	    this.dommage=this.dommage+10;
	}
	else if(choix == 2){
	    this.resistance=this.resistance+20;
	    this.dommage=this.dommage-5;
	}
	else{
	    this.dommage=this.dommage+20;
	    this.vitesseAttaque=this.vitesseAttaque-15;
	}
	return this.dommage+this.resistance+this.vitesseAttaque;
    }
    
    public String toString(){
	String ch=this.pv+" "+"pv"+", "+this.dommage+" "+"attaque"+", "+this.resistance+" "+"resistance"+", "+this.vitesseAttaque+" "+"vitesse attaque";

	return ch;
    }
    
    public int ArmeBot(){
	int choix = Ut.randomMinMax(1,3);
	
	if(choix == 1){
	    this.dommage=this.dommage+10;
	}
	else if(choix == 2){
	    this.resistance=this.resistance+20;
	    this.dommage=this.dommage-5;
	}
	else{
	    this.dommage=this.dommage+20;
	    this.vitesseAttaque=this.vitesseAttaque-15;
	}
	return this.dommage+this.resistance+this.vitesseAttaque;
    }
    
    public void Duel(){
	//va dueler this et b1 défini localement
	int p=3;
	//Boss Aleatoire
	Prepa b1;
	int a=Ut.randomMinMax(50,200);
	int b=Ut.randomMinMax(20,70);
	int c=Ut.randomMinMax(30,70);
	int d=Ut.randomMinMax(20,40);
	b1=new Prepa(a,b,c,d);
	b1.ArmeBot();
	
        Ut.clearConsole();
	
	
	while(b1.pv>0){
	    if(this.pv>0){
	    
		System.out.println("Votre vie : "+this.pv+"/"+this.pvmax+"pv");
		System.out.println("Potion restant : "+p);
		System.out.println("Vie de votre adversaire : "+b1.pv+"/"+b1.pvmax+"pv");
		System.out.println("1) Attaquer");
		System.out.println("2) Esquiver");
		System.out.println("3) Soins(+20 pv)");
		System.out.print("Choisi une Action : ");
		int n=Ut.saisirEntier();
		int m=Ut.randomMinMax(4,6);
	       	Ut.clearConsole();
		//	System.out.println();
		//	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//	System.out.println();
		// Attaque joueur
		if(n==1){
		    if(m==5){
		    }else{
			b1.pv = b1.pv-(this.dommage-(b1.resistance/100));
			System.out.println("il a perdu " + (this.dommage-(b1.resistance/100))+"pv" );
		    }}
		else if(n==2){
		    System.out.println("Vous avez esquivez");
		}
		if(n==3){if(p>0){{ if(this.pv< this.pvmax){
				if(this.pv+20>this.pvmax){
				    this.pv=this.pvmax;
				}else{
				    this.pv=this.pv+20;}
				p=p-1;
				System.out.println("Vous vous êtes soigner de 20 pv");
			    }}
		    }
		}else{}
		// Attaque Bot
		if(m==4){if(n==2){
		    }else{
			this.pv = this.pv-(b1.dommage-(this.resistance/100));
			System.out.println("vous avez perdu " + (b1.dommage-(this.resistance/100))+"pv" );
		    }}
		else if(m==5){
		    System.out.println("il a esquivé");
		}
		else{ if(b1.pv< b1.pvmax){
			if(b1.pv+20>b1.pvmax){
			    b1.pv=b1.pvmax;
			}else{
			    b1.pv=b1.pv+20;}
			System.out.println("il s'est soigner de 20 pv");
		
	
		    }
		}
		System.out.println();
	    }
	    else b1.pv=0;
	}
	Ut.clearConsole();
	    
	
    }
	
}

    


