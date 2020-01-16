package game;
import java.util.Scanner;


/*############################# RNG GAME #########################################
DATE CREATED: 11/27/19 ##########################################################
################################################################################*/


public class RNG {

	public static void main(String[] args){
		
		int newgame=0;
		int choice;
		Scanner scan = new Scanner(System.in);
		
		while(newgame!=1){
			
		System.out.println("Welcome to the Arena: ");
		Battle battle = new Battle();
		System.out.println("Preparing the Battle Ground...");
		battle.startBattle();
		System.out.println("Play Again ?: 1.Yes or 2.No ");
	    choice =scan.nextInt();
	    
	    if(choice == 1) {newgame = 0;}
	    else
	    	newgame = 1;
		
		
		}
	    
	}
}
