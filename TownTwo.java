
import cs1.Keyboard;
public class TownTwo extends Town {
    Character chara;
    Inventory inventory;
    public TownTwo(Character ch, Inventory invent){
	chara = ch;
	inventory = invent;
    }
    public void play(){
	System.out.println("You enter the town of BLITZCAVE. Few residents are around, but hopefully you can get on your way.");
	System.out.println("You should probably explore the TAVERN");
	prompt();
    }

    public void prompt(){
	
	String prompt = "Choose your action:\n1 - Explore the town\n2 - Check your inventory\n3 - Go to the tavern\n4 - Go to the store\n5 - Go to the next zone";
	System.out.println(prompt);
	String input = Keyboard.readString();

	if (input.equals("1")){
	    System.out.println("The BLITZCAVE is cold. The forms of the metaphysical plane are questionable. You look at the beaming sun. BLITZCAVE might be an allegory in a cave. ");
	    prompt();
	}
	else if (input.equals("2")){
	    inventory.prompt(chara);
	    prompt();
	}
	else if (input.equals("3")){
	    System.out.println("You enter the TAVERN.");
	    System.out.println("The bartenders look at you and grimaces, \"Only the Sith deal in absolute. Remember these words 'HN' \"");
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

       System.out.println("You move onto the next Zone, Zone Three");
    Zone z3 = new ZoneThree(chara,inventory);
       z3.play();
    }
}
