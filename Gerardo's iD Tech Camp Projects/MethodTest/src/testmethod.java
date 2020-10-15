
public class testmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int playerAttack =10;
int enemyArmor = 5; 
int damage = dealDamage(playerAttack, enemyArmor);
System.out.println("Your attack did " + damage +" damage to the enemy.");
	}
	public static int dealDamage( int damage, int armor){
	int damageDealt = damage - armor;
	
	
    if(damageDealt < 0){
        damageDealt = 0;
    }
    return damageDealt;
}}
