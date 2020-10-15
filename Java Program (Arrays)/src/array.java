import java.util.Random;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] nameList = {"Jeff", "Steve", "Kroger", "CaligMonk", "DJ", "Peter", "Gary", "Jon"};

Random randomGenerator = new Random();	

System.out.println(nameList[0]);
// This will print "Jeff"
 
System.out.println(nameList[1]);
// This will print "Steve"
 
System.out.println(nameList[2]);
// This will print "Krogar"
 
nameList[1] = "Rob";
// This would change the string "Steve" to "Rob"
System.out.println(nameList[1]);
// This will now print "Rob"	

//Pick a random index
int randomIndex = randomGenerator.nextInt(nameList.length);
 
// Print the element at the random index
System.out.println(nameList[randomIndex]);	
	
//This loop will print each element in the array.
for( int index = 0; index < nameList.length; index++){
	// This will print the name at the current index
    System.out.println(nameList[index]);
}
	}

}
