import java.io.IOException;
public class MainJeux{
    public static void main(String[] args){
	
	Prepa p1,p2,p3,p4;
	p1=new Prepa(100,60,40,40);
	p3=new Prepa(150,50,40,60);
	p2=new Prepa(200,35,65,15);
	p4=new Prepa(80,80,20,10);
	int a=0;
	//Menu
	 Clean.Linux();
	    Clean.Windows();
	System.out.println(Menus.Principal());
	System.out.print("Choix : ");
	int n=Ut.saisirEntier();
	int Score=0;
	Clean.Linux();
	Clean.Windows();
	if (n==1){
	    System.out.println("Liste des personnages : \n");
	    System.out.println("Perso 1 : 100 pv, 30 attaque, 40 resistance , 40 vitesse attaque");
	    System.out.println("Perso 2 : 200 pv, 15 attaque, 65 resistance , 15 vitesse attaque");
	    System.out.println("Perso 3 : 150 pv, 30 attaque, 40 resistance , 60 vitesse attaque");
	    System.out.println("Perso 4 : 80 pv, 60 attaque, 20 resistance , 10 vitesse attaque\n");
		
	    System.out.print("choix du perso : ");
	    n=Ut.saisirEntier();
	    
	    
	    //Combat p1
	    
	    if (n==1){
		Clean.Linux();
		Clean.Windows();
		p1.Arme();
			
		while(p1.pv>0){
		    p1.pv=p1.pvmax;
		    p1.Duel();
			
		    if(p1.pv<=0){
			System.out.println("You Lose !");
		    }
		    else {System.out.println("You Win !");
			System.out.println("Prochain Combat ...");
			Ut.pause(1000);
			a=a+1;
		    }
			

		}
	    }//Combat p2
	    else if (n==2){
		Clean.Linux();
		Clean.Windows();
		p2.Arme();
		while(p2.pv>0){
		    p2.pv=p2.pvmax;
		    p2.Duel();
		    if(p2.pv<=0){
			System.out.println("You Lose !");
		    }
		    else {System.out.println("You Win !");
			System.out.println("Prochain Combat ...");
			Ut.pause(1000);
			a=a+1;
		    }
			
		}
	    }//Combat p3
	    else if (n==3){
		Clean.Linux();
		Clean.Windows();
		p3.Arme();
		while(p3.pv>0){
		    p3.pv=p3.pvmax;
		    p3.Duel();
		    if(p3.pv<=0){
			System.out.println("You Lose !");
		    }
		    else {System.out.println("You Win !");
			System.out.println("Prochain Combat ...");
			Ut.pause(1000);
			a=a+1;
		    }
			
		}
	    }
	    else{//Combat p4
		Clean.Linux();
		Clean.Windows();
		p4.Arme();
		while(p4.pv>0){
		    p4.pv=p4.pvmax;
		    p4.Duel();
		    if(p4.pv<=0){
			System.out.println("You Lose !");
		    }
		    else {System.out.println("You Win !");
			System.out.println("Prochain Combat ...");
			Ut.pause(1000);
			a=a+1;
		    }
			
		}
	    }
		
	    System.out.println("Votre score : " + a);
	}
	//Multi
	else if(n==2){
	    System.out.println(Menus.Multi());
	    System.out.print("Choix : ");
	    n=Ut.saisirEntier();
	    if(n==1){
	    }

	    else if(n==2){
		Clean.Linux();
		Clean.Windows();
		MainJeux.main(args);
	    }
	    else if(n==3){
	    }
	}
	//Classement
	else if(n==3){
	    System.out.println(Menus.Classement());
	    System.out.print("Choix : ");
	    n=Ut.saisirEntier();
	    if(n==1){
		Clean.Linux();
		Clean.Windows();
		MainJeux.main(args);
	    }
	}
	else if(n==4){
	    Clean.Linux();
		Clean.Windows();
	    System.out.println(Menus.Regle());
	     System.out.print("Choix : ");
	    n=Ut.saisirEntier();
	    if(n==1){
		MainJeux.main(args);
	    
	}
	}
	else if(n==5){
	}
	else if (n==10){
	    Clean.Linux();
	    Clean.Windows();
	    System.out.println("Alt + f4");
	}
	else if(n==0){
	    Prepa p0;
			
	    System.out.print("PV : ");
	    int e=Ut.saisirEntier();
	    System.out.print("Attaque : ");
	    int b=Ut.saisirEntier();
	    System.out.print("Resistance : ");
	    int c=Ut.saisirEntier();
	    System.out.print("Vitesse d'Attaque : ");
	    int d=Ut.saisirEntier();
		
	    p0 = new Prepa(e,b,c,d);
	   	
	    while(p0.pv>0){
		p0.pv=p0.pvmax;
		p0.Duel();
			
		if(p0.pv<=0){
		    System.out.println("You Lose !");
		}
		else {System.out.println("You Win !");
		    System.out.println("Prochain Combat ...");
		    Ut.pause(1000);
		    a=a+1;
		}
			
	    }
	    System.out.println("Votre score : " + a);
			
	}
    }
}


	    
	
