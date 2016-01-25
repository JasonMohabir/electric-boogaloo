// BEGENEN: Health Center, Wealth Shop, [Training Area], Pub
import cs1.Keyboard;

public class TownOne extends Town {
    Character chara;
    Inventory inventory;
    public TownOne(Character ch, Inventory in){
	chara = ch;
	inventory = in; 
    }


    // creates the monster, that will attack 
    public void play(){
	System.out.println("You enter the town of BEGENEN. Few residents are around, but hopefully you can get on your way.");
	System.out.println("You should probably explore the TAVERN");
	prompt();
    }
    
    public void prompt(){
	
	String prompt = "Choose your action:\n1 - Explore the town\n2 - Check your inventory\n3 - Go to the tavern\n4 - Go to the pub\n5 - Go to the next zone";
	System.out.println(prompt);
	String input = Keyboard.readString();

	if (input.equals("1")){
	    System.out.println("Literally nothing interesting is in any of these towns. Well, you walk around the town a little bit and see JASON a developer.");
	    int moves = 0;
		if (moves == 0) {
		    System.out.println("JASON is a bit jittery, as he didn't get alot of sleep for the past few nights, but he looks proud to see you.");
		    System.out.println("\"I am sorry I could not give your camel higher intelligence. It was simply too large of a task to accomplish.\", he whispers.");
		    inventory.addCoinpurseCount(1000);
		    System.out.println("The invisible hand provides you with worthless currency.");
		    System.out.println("He vanishes.");}
		else {
		    System.out.println("There is no sign of the developer.");
		    moves += 1;
		}
	    prompt();
	}
	else if (input.equals("2")){
	    inventory.prompt(chara);
	    prompt();
	}

	else if (input.equals("3")){
	    System.out.println("You enter the TAVERN.");
	    System.out.println("The Cantina theme from STAR WARS is playing in the background. You channel your inner MARK HAMIL.");
	    System.out.println("Too bad, you aren't really in a STAR WARS game.");
	    System.out.println("The bartenders look at you and smiles, \"I tell you friend, in the future a great struggle you shall face. Remember these words 'JO' \"");
	    prompt();
	}
	else if (input.equals("4")){	
	    System.out.println("Under development");
	    System.out.println("To be honest, these signs that say 'Under development', are pretty suspicous. Gossip around town says the pub closed down because Old Man Mohabir didn't get around to coding in this functionality.");

prompt();
	}
	else if (input.equals("5")){
	    exit();
	}
	else {
	    System.out.println("Try again");
	    prompt();
	}
    }

   public void exit(){
       System.out.println("You move onto the next Zone, Zone Two");
       Zone z2 = new ZoneTwo(chara,inventory);
       z2.play();
    }

}
