import cs1.Keyboard;


// Tutorial
// Goals: Battle with a random monster, attack the monster, open your inventory, use a potion, use a power up, defeat the monster


public class ZoneOne extends Zone {
    Character chara;
    Inventory inventory;
    private int moves = 0;

    public ZoneOne(Character ch){
	chara = ch;
	length = ch.getDiff();
    }

    // make automated ZoneOne
    // creates the monster, that will attack 
    public void play(){
	System.out.println("\nYour plane crash lands in a vast desert.\nYou are confused as to what has happened and where you are.\nYou try to traverse through the thick desert but its too hot and dry\nYou pass out!\nYou wake up to feeling of being carried and realize a camel is carrying you on its back!\nThe camel puts you down and looks at you. An immediate bond is formed.\nThe two of you begin to travel to the desert together!\n");
	prompt();
    }
    
    public void prompt(){
	if (chara.isAlive()){
	    String prompt = "\nChoose your action:\n1 - Explore the desert\n2 - Check your inventory\n3 - Look up to the heavens\n4 - Talk to your sand steed\n\nMoves made so far: " + moves + "\n\nTp Left: " + chara.getTp() + "!\nEach move costs 5 Tp, remember that! Hit 0 and you will die!\n";
	    System.out.println(prompt);
	    String input = Keyboard.readString();
	    if (input.equals("1")){
		if (moves < length){
		    attacked();
		    chara.lowertp(5);
		    prompt();
		}
		else{
		    exit();
		}
	    }	
	    else if (input.equals("2")){
		System.out.println("\nYou ruffle through your bag.\n");
		Inventory inventory = new Inventory();
		inventory.prompt(chara);
	    }
	    else if (input.equals("3")){
		System.out.println("\nThe heavens spell out in Comic Sans font:\n \" Lol m8 you tried \"\n");
		prompt();
	    }
	    else if (input.equals("4")){
		System.out.println("\n" + camelDia() + "\n");
		prompt();
	    }
	else {
	    System.out.println("\nTry again\n");
	    prompt();
	}
	}
	else{
	    died();
	}
    }   
    
    public String camelDia(){
	double rng = Math.random() * 100;
	if (rng < 20){
	    return "The camel smiles at you and nudges you foward.";
	}
	else if (rng < 40){
	    return "The camel smiles at you with a tired face.";
	}
	else if (rng < 60){
	    return "The camel winks at you and looks foward";
	}
	else if (rng < 80){
	    return "The camel does a little dance to entertain you";
	}
	else{
	    return "The camel looks at you silently";
	}
    }
    
    public void attacked(){	
	Monster en = new M_Sandbeetle();
	System.out.println("\nWhat is that! A " + en + " appears!\n");
	System.out.println("\nYou are going to need to fight.\n");
	chara.battle(en);
	moves++;
    }

    public void exit(){
	System.out.println("\nYou are weary from your first encounters with danger. The sun beats down on you. You close your eyes.\nYou wake up on your camel's back and seem to have arrived to a town!\n");
	Town firstTown = new TownOne(chara,inventory);
	firstTown.play();
    }

    public Inventory getInventory(){
	return inventory;
    }
}




