import java.util.Random;
public class loopbattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int playerhealth = 200;
int enemyhealth = 100;
int playerattack = 4;
int enemyattack = 4;	
int damagedone; 	
int enemiesdefeated =  0;	
Random numberGenerator = new Random();

System.out.println("Welcome to the endless, looping tower!");

while(playerhealth > 0){	
	if(enemyhealth > 0){
		 
        System.out.println("Your HP: "+ playerhealth + " Enemy HP: " + enemyhealth);
         
       
        damagedone = playerattack + numberGenerator.nextInt(3);
        System.out.println("You attack the enemy for " + damagedone + " damage.");
        enemyhealth -= damagedone;
        damagedone = enemyattack + numberGenerator.nextInt(3);
        System.out.println("The enemy attacks you for " + damagedone + " damage.");
        playerhealth -= damagedone;
         
    }
    else { enemiesdefeated++;
    playerattack++;
    System.out.println("You Leveled up. Your attack is now " + playerattack
            + "\n\nA new challenger approaches!");

    // Randomly generate stats
    enemyhealth = 10 + numberGenerator.nextInt(5); // Get a new enemy hp
    enemyattack += numberGenerator.nextInt(2); // Get a new enemy Attack
    System.out.println("The enemy has " + enemyhealth + " health and " + enemyattack + " attack.");
    }	
	
	
	
	
	
	
	
	
	
}  System.out.println("You defeated " + enemiesdefeated + " enemies."); }}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


