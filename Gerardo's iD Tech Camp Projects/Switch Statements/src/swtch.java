import java.util.Scanner;
public class swtch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Java Program Example (Switch Statements)");
		
		Scanner userInput = new Scanner(System.in);
        
        System.out.println("Choose a class\n1: Warrior\n2: Rogue\n3: Wizard");
                 
        int decision = userInput.nextInt();
        
        switch(decision){
        case 1:
            System.out.println("You picked Warrior.");
            break;
        case 2:
            System.out.println("You picked Rogue.");
            break;
        case 3:
            System.out.println("You picked Wizard.");
            break;
        default:
            System.out.println("That wasn't an option. Restart the program and try again.");
            break;
	}

	}}
