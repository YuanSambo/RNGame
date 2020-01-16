package game;



public class Battle extends PlayerTurn {

       private int hp1,hp2,turn,b=2;
       private int win = 0;
       
       Warrior player1 = new Warrior();
       Warrior player2 = new Warrior();
       
       
       public void startBattle(){
    	   
    	
    	
    	hp1 = player1.getHealth();
    	hp2 = player2.getHealth();
    	
    	
    	while(win==0) {
    		
        	turn = turn(player1);
        	if(turn==1) {
        		  if(b!=1){		
        		      if(b==0) {System.out.println("Block Failed");}
        			   hp2 -= player1.attack();
        		       System.out.println("\n"+player2.getName()+ "'s health : "+hp2);
        		       win = checkwin();    
        		       if(win!=0) {break;}
        		 }
        		
        		
                  else
        		  System.out.println("Blocked Successfully");
        		  b=2;
        	}
        	
        	else if (turn==2) {
        	     b =  player1.block();   
        	     System.out.println(player1.getName()+" used block");
        	}
    	     
        	
        	
    	    turn=turn(player2);
    	    if(turn==1) {
    	    	if(b!=1){ 	
    	    		 if(b==0) {System.out.println("Block Failed");}
    	             hp1 -=player2.attack();
        		     System.out.println(player1.getName()+ "'s health : "+hp1);
        		     win = checkwin();
        		 
        		if(win!=0) {break;}
        		
    	    	}
    	    	else
    	    	
    	    	System.out.println("Blocked Successfully");
    	    	b=2;
    	    }
    	    else if(turn==2) {
    	    	b=player2.block();
       	       System.out.println(player2.getName()+" used block");
       	  }
    	    
    	    	
 
    	}
    	
    	
    }
       public int checkwin ()
   	{
   		
   		if(hp2<=0) {
   		    System.out.println("Battle Ended: "+ player1.getName() +" Win !");
   		    return 1;
   		}
   		
   		else if (hp1<=0) {
       		System.out.println("Battle Ended: "+ player2.getName() +" Win !");
               return 1;
   		}
   		
   		else
   			return 0;
   		
   	}
       
       
}
    		
    		
    	
    	  	
    	
    
    
