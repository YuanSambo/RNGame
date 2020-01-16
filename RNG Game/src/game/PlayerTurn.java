package game;
import java.util.Scanner;

abstract public class PlayerTurn {
	
	
	 public int turn (Warrior player)
     {   
  	   int choice;
  	   
  	   Scanner scan = new Scanner(System.in);
  	   System.out.println(player.getName() + " Turn: ");
  	   System.out.println("1 . Attack  2.Block \n");
  	   choice = scan.nextInt();
  	   
  	   
  	   return choice;    
     }
     
		
	}
	


