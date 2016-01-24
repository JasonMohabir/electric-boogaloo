import cs1.Keyboard;


// DREAM DESERT tutorial
// Goals: Battle with a random monster, attack the monster, open your inventory, use a potion, use a power up, defeat the monster, gain experience points


public class ZoneOne extends Zone {
    Character chara;
    Inventory invent; 
    private int moves = 0;

    public ZoneOne(Character ch){
	chara = ch;
	length = ch.getDiff();
    }

    // make automated ZoneOne
    // creates the monster, that will attack 
    public void play(){
	System.out.println("You are restless in the night. And drift off to sleep.");
	System.out.println("You imagine the adventures that will potential take place!");
	System.out.println("Your Camel and you are exploring the great DREAM DESERT.");
	prompt();
    }
    
    public void prompt(){
	String prompt = "Choose your action:\n1 - Explore the desert\n2 - Check your inventory\n3 - Look up to the heavens\n4 - Talk to your sand steed\n\nMoves made so far: " + moves + "\n";
	System.out.println(prompt);
	String input = Keyboard.readString();
	if (input.equals("1")){
	    if (moves < length){
		attacked();
		prompt();
	    }
	    else{
		exit();
	    }
	}	
	else if (input.equals("2")){
	    System.out.println("You ruffle through your bag.");
	    Inventory invent = new Inventory();
	    //invent.addItem("Crimson Dagger", 1);
	    prompt();
	}
	else if (input.equals("3")){
	    System.out.println("The heavens spell out in Comic Sans font:\n \" Lol m8 you tried \"");
	    prompt();
	}
	else if (input.equals("4")){
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
	Monster en = new M_Sandbeetle(); 
	System.out.println("You are going to need to fight.");
	chara.battle(en);
	moves++;
    }

    public void exit(){
	System.out.println("You are weary from your first encounter with danger. The sun beats down on you. You close your eyes.");
	System.out.println("You are ready to begin...");
	System.out.println("SANDSTORY 3D!");
	Town firstTown = new TownOne(chara);
	firstTown.play();
    }
}




