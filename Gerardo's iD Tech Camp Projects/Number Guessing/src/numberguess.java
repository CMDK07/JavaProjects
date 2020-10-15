import java.util.Random;
import java.util.Scanner;
public class numberguess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int secretnumber;
int numberguess;	
Random randomGenerator = new Random();		
Scanner playerinput = new Scanner(System.in);		
secretnumber =  randomGenerator.nextInt(100);
System.out.println("I'm think of a number from 0-100. What is it?");	

do 
{
	numberguess = playerinput.nextInt();
	if (numberguess < secretnumber) 
	{
		System.out.println("The number was too low... try again.");
	}
	else if (numberguess > secretnumber)
	{
		System.out.println("The number was too high... try again.");
	}
}
while(numberguess != secretnumber);
System.out.println("You have the found the number! It was "+secretnumber+". YAY!");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
