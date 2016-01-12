public class ZoneOne extends Zone {


    // make automated ZoneOne
    // creates the monster, that will attack 
    public class play(){
	System.out.println("You are restless in the night. And drift off to sleep.");
	System.out.println("You imagine the adventures that will potential take place!");
	System.out.println("Your Camel and you are exploring the great DREAM DESERT.");
	prompt();
    }
    
    public void prompt(){
	
	String prompt = "Choose your action:\n1 - Explore the desert\n2 - Check your inventory\n3 - Look up to the heavens\n4 - Talk to your sand steed.";
	String input = Keyboard.readString();
	if (input.equals("1")){
	    System.out.print("The sand slips through the hooves the sand steed.");
	    // move();
	}
	if (input.equals("2")){
	    System.out.print("You ruffle through your bag.");
	    // inventoryDisplay();
	}
	if (input.equals("3")){
	    System.out.println("The heavens spell out in Comic Sans font:\n \" Lol m8 you tried \"");
	    prompt();
	}
	if (input.equals("4")){
	    System.out.println("The camel dies.");
	}
	else {
	    System.out.println("Try again");
	    prompt();
	}
    }   
}



