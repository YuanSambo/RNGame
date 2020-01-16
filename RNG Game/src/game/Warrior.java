package game;
import java.util.Random;
import java.util.Scanner;


 public class Warrior {
	
	private String name;
	private int power=50,damage,health=100,block;
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	
	Warrior(){
		System.out.println("Enter Name :");
		name = scan.nextLine();	
    }
	
	
	public String getName(){
		return name;
	}
	
	public int getHealth(){
		return health;
	}
	
	
	public int attack(){	
		
		damage = rand.nextInt(power);
		
		System.out.println(name + " deals "+damage+" damage.");
		if(damage==0) {
			System.out.println("Attack Missed ");
		}
		return damage;
	}
	   
	
	

	public int block(){
		block=rand.nextInt(100);
		if(block<30) {		
			return 1;
		}
		else 
			return 0;
	}

}
