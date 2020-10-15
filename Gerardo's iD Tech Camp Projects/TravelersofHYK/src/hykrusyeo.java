import java.util.Scanner;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hykrusyeo {
	public static void main(String[] args) {

		Scanner playerinput = new Scanner(System.in);

		Random randomgenerator = new Random();

		JPanel panel = new JPanel();

		double hourspassed;

		boolean showerworking;

		String name;
		String gender;
		String rememberednumbers;
		String kit;
		String weaponagainstpablo;
		String opinionone;
		String attackmen;
		String blueandgreen;
		String playeranswer;
		String speedtoplace;
		String norepeat;

		int enemyname;
		int playerattack = 60;
		int dollarsfound;
		int health;
		int damagedone;
		int pablohealth = 0;
		int revivehp;
		int pabloattack = 0;
		int pastpabloatk;
		int pastpablohp;
		int playerLevel;
		int floornumber;
		int kmtraveled;
		int thingsnumber;
		int xpgain;
		int hairymen = 10;
		int hairymendamage = 10;
		int basketchoice;
		int hotelormall;
		int dirty;
		int clean;
		int frederickdecision = 0;
		int sanitarylevel;
		int bearhp;

		char frederick;

		JOptionPane.showMessageDialog(null,
				"Travelers of the Hykrusyeo \nBy: Gerardo Bote \nDirected By: Rice University IDTech Staff");
		System.out.println(
				"Welcome you mighty travelers... you are on a journey to a place where people could seek fortune and greatness.");
		System.out.println("Though your are not like the others...");
		System.out.println("What is your nickname that I, Merlin, would like me to call you?");
		name = playerinput.nextLine();
		int playerLevel1 = randomgenerator.nextInt(1001);
		double health1 = randomgenerator.nextInt(50001);
		int sanitarylevel1 = randomgenerator.nextInt(251);
		System.out.println("Greetings, " + name + ", welcome to my world! You are apparently a Level " + playerLevel1
				+ " with " + health1 + " HP, from the prequel.");
		System.out.println("Though I know your name... what is your gender? (male/female)");
		gender = playerinput.nextLine();
		if (gender.equalsIgnoreCase("Male")) {
			System.out.println("Ok then you are a ferocious man!");
		} else if (gender.equalsIgnoreCase("Female")) {
			System.out.println("OK then you are a beautful woman!");
		} else {
			System.out.println("Why did you type that? Anyway fine... you are a(n)... " + gender + ".");
		}
		System.out.println(
				"Nice, nice, nice, we are in the last stage of setting up on your adventure. What class or kind of kit do you want?");
		kit = playerinput.nextLine();
		System.out.println("Ahh, I see, you would rather have the skills and possessions of a " + kit
				+ "? Well, then! Here you go!");
		System.out.println("[RECIEVED skills and possessions OF " + kit + ".]");
		System.out.println("On we go on the commencement of our adventure. starting in the Kingdom of Bavaria!");
		System.out.println(
				"Suddenly, when you were walking out into the Woods of Bavarian Darkness, a grizzly bear attacked you and dealt 12,651 HP.");
		health1 = health1 - 12651;
		System.out.println("Now, you have " + health1 + " HP.");
		System.out.println(
				"Due to that unforunate event, you have injured your leg by tripping over a small boulder by a push of the bear. Now, we have to wait...");
		System.out.println("[72 HOURS LATER...]");
		System.out.println("When you wake up, you find yourself in a building you've never seen before...");
		System.out.println("In 1 word, tell me what you feel about what happened over the three days.");
		opinionone = playerinput.nextLine();
		System.out.println(
				"Such an opinion though... Anyways, you just walk and walk trying to figure out if you are in the same world or some other dimesnsion.");
		System.out.println(
				"Until you reach 2 doors; One blue and One green... which one will you take? (type blue/green)");
		blueandgreen = playerinput.nextLine();
		if (blueandgreen.equalsIgnoreCase("Blue")) {
			System.out.println(
					"You have gone into the blue door but have suddenly dropped into a hole leading to pool of water at the end. Unfortunately, you lost ALL your stuff \nalong the way. You cannot think of a way out and die miserably.");
			System.out.println("[LOST INVENTORY ITEMS.] \n[DROWNING DEATH.]");
			System.out.println(
					"GAME OVER. GAME OVER. GAME OVER. GAME OVER. GAME OVER. GAME OVER. GAME OVER. \nGAME OVER. GAME OVER. GAME OVER. GAME OVER. GAME OVER. GAME OVER. \nGAME OVER. GAME OVER. GAME OVER. GAME OVER. GAME OVER. GAME OVER. GAME OVER. \nGAME OVER. GAME OVER. GAME OVER.");
			System.exit(0);
		} else if (blueandgreen.equalsIgnoreCase("Green")) {
			System.out.println(
					"You have gone into the green door and \nhave found luxerious golds and possesions. Greedy you are, you stole them in your enormous bag and went to the nearest staircase to Floor Number...");
		}
		floornumber = playerinput.nextInt();
		System.out.println("When you, " + name + ", have reached Floor #" + floornumber
				+ ", you found 3 unresistable things. These are a football, robot arm, and an old Samsung phone (probably from 2000). Which one will you take ansd steal?");
		System.out.println("1- Samsung Phone \n2- Football \n3- Robot Arm");
		thingsnumber = playerinput.nextInt();
		playerinput.nextLine();
		System.out.println(
				"Choosing what you wanted, you came stumbling upon 2 creepy and sunburned men. One has messy hair and the other has greasy hair. They seem threatening to you, so you \ndecided to attack... but who first? (type messy/greasy) ");
		System.out.println("[THIS IS YOUR FIRST BATTLE. PLEASE CHOOSE YOUR CHOICES CAREFULLY. GOODLUCK.]");
		attackmen = playerinput.nextLine();
		if (attackmen.equalsIgnoreCase("messy")) {
			System.out.println("[BEGIN BATTLE!] \nYou got Item #" + thingsnumber
					+ ", but the greasy-haired man threw a red brick at you and knocked you into your death. \nGAME OVER.");
			System.exit(0);
		} else {
			switch (thingsnumber) {
			case 1:
				System.out.println(
						"[BEGIN BATTLE!] \nYou threw your Samsung phone at the greasy-haired man, but it was so miserable that it only went 2 feet. Fortunately, there were scared of the 'futristic' device and ran away.");
				System.out.println("Both men have 0 HP. [DEAD]");
				break;
			case 2:
				System.out.println(
						"[BEGIN BATTLE!] \nYou threw your football at the greasy-haired man, but it was such a good throw that you literally made him unconscious. The other guy got scared and ran away. ");
				System.out.println("Both men have now 0 HP. [DEAD]");
				break;
			case 3:
				System.out.println(
						"[BEGIN BATTLE!] \nYou threw your robot arm at the greasy-haired man, and it operated by it self. Apparently it killed both of them breaking their necks.");
				hairymen = hairymen - hairymendamage;
				System.out.println("Both men have now " + hairymen + " HP. [DEAD]");
				break;
			}
		}
		System.out.println("With those men away you venture out into the new world, exiting Floor #" + floornumber
				+ " from the building... you see people that do not look like peasants where you come from in your time...");
		System.out.println(
				"Suddenly, you see a man who has a basket full of freshful meat and fruits. What would you like to do now?");
		System.out.println(
				"1 - Go into a near alleyway and try to find gold or some money to purchase it... \n2 - Steal it away like a thief and run to the nearest bush & hide. \n3 - ???");
		basketchoice = playerinput.nextInt();
		playerinput.nextLine();
		if (basketchoice == 3) {
			System.out.println(
					"Why did you choose this... Why do you always have to be curious and wonder out my story like that! If you wanna be like that? Fine... GAME OVER.");
			System.exit(0);
		} else if (basketchoice == 1) {
			dollarsfound = randomgenerator.nextInt();
			System.out.println("You go into the alleyway to your right, and you find $" + dollarsfound
					+ " behind a garbage can! Unfortunately, you find yourself defenseless when you encountered a police officer. You told an obvious lie, so it wouldn't work. \n[HOLDEN AS PRISONER.] [OBJECTIVE FAILED.] \nGAME OVER. GAME OVER. GAME OVER.");
			System.exit(0);
		} else if (basketchoice == 2) {
			System.out.println(
					"WHAT?!? Fine... \nYou ran to him and stole the basket of food and ran to the bush to hide. Fortunately, you were not caught as the policemen and the victim kept running. \nYou have your beautiful food, and you deliciously ate it... Which place do you wanna go now?");
		}
		System.out.println("1 - Hotel \n2 - Mall");
		hotelormall = playerinput.nextInt();
		playerinput.nextLine();
		System.out
				.println("Now that you wanted to go to that place... how fast do you wanna go? (slowest/fast/fastest)");
		speedtoplace = playerinput.nextLine();

		if (hotelormall == 2 && (speedtoplace.equalsIgnoreCase("fastest") || speedtoplace.equalsIgnoreCase("fasT")
				|| speedtoplace.equalsIgnoreCase("slowest"))) {
			System.out.println(
					"You start traveling to the mall, but then realized that it is to far away for you to walk. So you actually went the hotel.");
		} else if (hotelormall == 1 && (speedtoplace.equalsIgnoreCase("fastest")
				|| speedtoplace.equalsIgnoreCase("fasT") || speedtoplace.equalsIgnoreCase("slowest"))) {
			System.out.println("You decided to go to the free-priced hotel and rest to wait for the next day to come.");
		}
		System.out.println("[3RD DAY OF ADVENTURE.]");
		System.out.println("When the next day comes by, you, " + name
				+ ", wake up in a sudden mood. Feeling dirty, you take a shower that is...");
		boolean showerworking1 = randomgenerator.nextBoolean();
		if (showerworking1 == true) {
			int clean1 = randomgenerator.nextInt(21);
			sanitarylevel = sanitarylevel1 + clean1;
			System.out.println(
					"a full functional and you can have a full nice bath. Good thing it was working! :) \n[SANITARY LEVEL INCREASED BY "
							+ clean1 + ". Current Sanitary Level: " + sanitarylevel + ".]");
		} else if (showerworking1 == false) {
			int dirty1 = randomgenerator.nextInt(11);
			sanitarylevel = sanitarylevel1 - dirty1;
			System.out
					.println("not fully working and have to deal what you have with. :( \n[SANITARY LEVEL DECREASED BY "
							+ dirty1 + ". Current Sanitary Level: " + sanitarylevel + ".]");
		}
		double hourspassed1 = randomgenerator.nextInt(6) + 1;
		System.out.println(
				"You returned outside, feeling a little bit bored; there is literally no other person that relates to your time-bring and personality. \nSuddenly, "
						+ hourspassed1
						+ " hours later, you find your long lost enemy that found its way to the world you have been in. \nHis name was Pablo the Dark.");
		int pablohealth1 = randomgenerator.nextInt(21111) + 20000;
		System.out.println("[IT IS TIME FOR YOUR SECOND BATTLE. GOOD LUCK. \n" + name + ": " + health1 + " HP. Pablo: "
				+ pablohealth1 + " HP.]");
		System.out.println("What weapon shall you use from your kit, " + kit + ", to fight against Pablo?");
		weaponagainstpablo = playerinput.nextLine();
		System.out.println(
				"You'll use your " + weaponagainstpablo + " to fight against Pablo's flaming sword! \n[BEGIN BATTLE!]");
		while (health1 > 0) {
			if (pablohealth1 > 0) {

				damagedone = playerattack + randomgenerator.nextInt(2001) + 501;
				System.out.println("" + name + " took off " + damagedone + " HP away from Pablo. ");
				pablohealth1 -= damagedone;
				damagedone = pabloattack + randomgenerator.nextInt(1501) + 400;
				System.out.println("Pablo attacks " + name + " for " + damagedone + " damage.");
				health1 -= damagedone;

			} else {
				System.out.println("[BATTLE COMPLETE. WINNER: " + name + ".]");
				break;
			}
			xpgain = randomgenerator.nextInt(16) + 1;
			playerLevel1 = playerLevel1 + xpgain;
			System.out.println(
					"Wow! Such an amazing fight that you did! You have defeated Pablo and has ran away! \nWith barely enough XP, you have leveled up to Level "
							+ playerLevel1 + ".");
			System.out.println(
					"Feeling proud of yourself, you weren't about to give up yet on finding your true home back in your own world in the past, not in 2001.");
			System.out.println(
					"Suddenly, there were grizzly bears wondering around attacking people one by one, though no deaths are evident. Then, they were being taken to some transporation device that flys... WHAT?");
			System.out.println(
					"Is this what happened to you 2 days ago? You must figure out something... Those 'magical' bears accidentally dropped a paper containing a code. "
							+ name + ",  you must remember the pattern and numebers.");
			System.out.println("[TYPE 'done' if you think you got the numbers, in order, in your head.");
			for (int value = 4; value < 57; value = value + 6) {
				System.out.println(value);
			}
			rememberednumbers = playerinput.nextLine();
			if (rememberednumbers.equalsIgnoreCase("DONe")) {
				System.out.println("Good!");
			} else {
				System.out.println("It looks like that you typed something else and typed " + rememberednumbers
						+ ", so I'll assume that you're done.");
			}

			System.out.println("Which transportation device will you take in your journey to the bears' headquarters?");
			String[] transportation = { "Horse", "Time Machine (from 2105)", "Plane" };
			for (int index = 0; index < transportation.length; index++) {

				System.out.println(transportation[index]);
			}
			playerinput.nextInt();
			System.out.println(
					"Actually, this should be an obvious option that you need a \ntime machine to travel BACK IN TIME.");
			System.out.println(
					"You use the time machine to travel back to around 1000 A.D. and find yourself before you get injured.");
			System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
			System.out.println("[TIME: 1012 A.D.]");
			System.out.println("You did it! You are here! Quick... find yourself near the Woods of Bavarian Darkness.");
			System.out.println(
					"Then, you encounter a foolish man who finds you. His name is Frederick the Foolishness, and do you know who else came with him?");
			System.out.println("PABLO THE DARK!");
			System.out.println("Pablo said that he wanted to fight you because you, " + name
					+ " did not repay him the money you loaned to you.");
			pastpablohp = randomgenerator.nextInt(15002);
			System.out.println(
					"[THIS IS YOUR THIRD BATTLE. \nTHIS IS YOUR SECOND ENCOUNTER WITH PABLO THE DARK, SO PROBABLY THINK OF BETTER WAYS OF DOING YOUR ATTACKS. GOOD LUCK.] \n["
							+ name + ": " + health1 + " HP. Pablo: " + pastpablohp + ".]");
			System.out.println("What weapon will you use this time, " + name + "?");
			weaponagainstpablo = playerinput.nextLine();
			System.out.println("This time, Pablo would be using his Special-Rock Sword. \n[BEGIN BATTLE!]");
			while (health1 > 0) {
				if (pastpablohp > 0) {

					damagedone = playerattack + randomgenerator.nextInt(2011) + 501;
					System.out.println("" + name + " took off " + damagedone + " HP away from Past Pablo. ");
					pastpablohp -= damagedone;
					damagedone = pastpablohp + randomgenerator.nextInt(1502) + 452;
					System.out.println("Past Pablo attacks " + name + " for " + damagedone + " damage.");
					health1 -= damagedone;

				} else if (pastpablohp <= 0) {
					System.out.println("[BATTLE COMPLETE. WINNER: " + name + ".]");
					break;
				} else if (health1 <= 0) {
					System.out.println("[BATTLE COMPLETE. WINNER: Past Pablo.]");
					System.out.println("[LOSS OF BATTLE AGAINST PABLO] GAME OVER.");
				}

			}
			System.out.println(
					"Good job! You have defeated your nemesis again! Now what will you do to Frederick? \n1 - Kill him \n2 - Let him loose \n3 - Slap him & leave");
		}
		frederickdecision = playerinput.nextInt();
		switch (frederickdecision) {
		case 1:
			System.out.println(
					"You decided to kill him, so, being cocky, you threw the weapon directly at him, but it was like a boomerang somehow and killed you instead. WHOOOOPS \n[BRAGFUL DEATH.] \nGAME OVER.");
			System.exit(0);
		case 2:
			System.out.println(
					"You let him loose and he is on his way doing more foolish things... like killing you for example! \n[NO REASON FOR DEATH.] \nGAME OVER.");
			System.exit(0);
		case 3:
			System.out.println("You slapped him with dignity and went with on your way.");
		default:
			System.out.println("INTERNAL GAME SHUT DOWN. NO OR IMPROPER ANSWER WAS GIVEN.");
			System.exit(0);

		}
		System.out.println("Now that you are done with both ennemies, you travel to the Woods of Bavarian Darkness.");
		hourspassed = randomgenerator.nextInt(7) + 1;
		System.out.println("[" + hourspassed + " LATER...]");
		System.out.println("You have reached your past self and the grizzly bear that attacked you.");
		revivehp = randomgenerator.nextInt(156155) + 48988;
		health1 = revivehp + health1;
		System.out.println(
				"With your might, you attacked the bear with your fist and took off 6 HP him. Also, you took the chance to revive your health espicially through all those battles.");
		System.out.println("Now you have " + health1 + " HP.");
		bearhp = randomgenerator.nextInt(101010) + 888;
		bearhp = bearhp - 6;
		System.out.println("[THIS IS THE FINAL BATTLE (BOSS) IN YOUR ADVENTURE. TAKE GOOD CARE & GOOD LUCK. \n" + name
				+ ": " + health1 + " HP. Grizzly Bear: " + bearhp + ".]");
		while (health1 > 0) {
			if (bearhp > 0) {

				damagedone = playerattack + randomgenerator.nextInt(19005) + 1001;
				System.out.println("" + name + " slashed away " + damagedone + " HP away from the Grizzly Bear. ");
				bearhp -= damagedone;
				damagedone = bearhp + randomgenerator.nextInt(12000) + 452;
				System.out.println(
						"The grizzly bear roars at you and took away " + name + "'s for " + damagedone + " damage.");
				health1 -= damagedone;

			} else if (bearhp <= 0) {
				System.out.println("[BATTLE COMPLETE. WINNER: " + name + ".]");
				break;
			} else if (health1 <= 0) {
				System.out.println("[BATTLE COMPLETE. WINNER: " + name + ".]");
				System.out.println("[LOSS OF BATTLE AGAINST GRIZZLY BEAR] GAME OVER.");
				System.exit(0);

			}

		}
		System.out
				.println("YOU DID IT! You defeated the bear! You decided to leave him be since time will be up if so.");
		System.out.println(
				"Wait... wait... why are you fading and disappearing? Oh! The path of your time won't exist anymore since you just saved your Past "
						+ name + ". Good bye...");
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
		System.out.println(
				"What was that? Was that you? That wasn't in the script though, oh well! On with your journey!");
		kmtraveled = randomgenerator.nextInt();
		System.out.println("[" + kmtraveled + " KILOMETERS LATER AND MORE ADVENTURE...]");
		System.out.println(
				"Ahh! There you go! We are in the Hykrusyeo, where training grounds are held. Udr your oppurtunity to train and fight for loyalt--");
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
		JOptionPane.showMessageDialog(null,
				"Travelers of the Hykrusyeo \nBy: Gerardo Bote \nDirected By: Rice University IDTech Staff");
		System.out.println(
				"Welcome you mighty travelers... you are on a journey to a place where people could seek fortune and greatness.");
		System.out.println("Though your are not like the others...");
		System.out.println("What is your nickname that I, Merlin, would like me to call you?");
		norepeat = playerinput.nextLine();
		System.out.println(
				"Nah! Just kidding! I won't make you play again. I hope you had a fun experience playing this game for Merlin and me! \n - Gerardo Bote");
		JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING!!! :)");
		System.exit(0);

	}
}

// Travelers of the Hykrusyeo by Gerardo Bote
// Director: Rice University IDTech Staff
// Are you wondering why the game reset at the end? I'm actuall implementing the
// idea of time traveling that: 'Even though you did not make contact in the
// past, you still will change the past.
// Apparently, in one theory that scientists make is that it will create
// wormholes/black holes of resetting time. I hope you understand.
// Also, you should've not expected the title to say the story. :)