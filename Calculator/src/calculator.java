import java.util.Scanner;


public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner playerinput = new Scanner(System.in);
String operation;
double addend;
double sum;
double quotient;
double product;
double difference;
double subtractionnumber;
double start;
double factor;
double dividend;

System.out.println("This is a calculator; enter a number to begin.");	
start = playerinput.nextDouble();
playerinput.nextLine();	
System.out.println("You have entered the number "+start+". What operation needs to be done on it?");
operation = playerinput.nextLine();	

if ( operation.equalsIgnoreCase("addition"))
{
	System.out.println("You have chosen addition. What number would you like it to add to "+start+"?");
	addend = playerinput.nextDouble();
	sum = start + addend;
	System.out.println("The sum is "+sum+".");		
}	
else if (operation.equalsIgnoreCase("subtraction"))
{
	
	System.out.println("You have chosen subtraction. What number would you like it to subtract from "+start+"?");
	subtractionnumber = playerinput.nextDouble();
	difference = start - subtractionnumber;
	System.out.println("The difference is "+difference+".");
}
else  if (operation.equalsIgnoreCase("multiplication") )
{
	
	System.out.println("You have chosen multplication. What number would you like multiply to "+start+"?");
	factor = playerinput.nextDouble();
	product = factor * start;
	System.out.println("The product is "+product+".");
}	 	
else if (operation.equalsIgnoreCase("division"))	
{	
	
	System.out.println("You have chosen division. What number would you like to divide by "+start+"?");
	dividend = playerinput.nextDouble();
	quotient = dividend * start;
	System.out.println("The quotient is "+quotient+".");	
}}}
