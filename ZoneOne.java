import cs1.Keyboard;

// DREAM DESERT tutorial
// Goals: Battle with a random monster, attack the monster, open your inventory, use a potion, use a power up, defeat the monster, gain experience points


public class ZoneOne extends Zone {

    // make automated ZoneOne
    // creates the monster, that will attack 
    public void play(){
	System.out.println("You are restless in the night. And drift off to sleep.");
	System.out.println("You imagine the adventures that will potential take place!");
	System.out.println("Your Camel and you are exploring the great DREAM DESERT.");
	prompt();
    }
    
    public void prompt(){
	
	String prompt = "Choose your action:\n1 - Explore the desert\n2 - Check your inventory\n3 - Look up to the heavens\n4 - Talk to your sand steed.";
	System.out.println(prompt);
	String input = Keyboard.readString();
	if (input.equals("1")){
	    System.out.print("The sand slips through the hooves the sand steed.");
	    attacked();
	    prompt();
	}
	if (input.equals("2")){
	    System.out.print("You ruffle through your bag.");
	    // inventoryDisplay();
	    prompt();
	}
	if (input.equals("3")){
	    System.out.println("The heavens spell out in Comic Sans font:\n \" Lol m8 you tried \"");
	    prompt();
	}
	if (input.equals("4")){
	    System.out.println("The camel is silent");
	    prompt();
	}
	else {
	    System.out.println("Try again");
	    prompt();
	}
    }   

    public void attacked(){
	System.out.println("What is that! A Sand Beatle appears!");
	System.out.println("You are going to need to fight.");
	// Camel.battle(test);
    }

}




