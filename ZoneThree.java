import cs1.Keyboard;
// HUMP HARDLANDS
// Goals: Battle with a random monster, attack the monster, open your inventory, use a potion, use a power up, defeat the monster, gain experience points


public class ZoneThree extends Zone {
    Character chara;
    Inventory inventory;
    private int moves = 0;

    public ZoneThree(Character ch, Inventory invent){
	chara = ch;
	inventory = invent
	length = ch.getDiff() * 3;
    }

    // make automated ZoneOne
    // creates the monster, that will attack 
    public void play(){
	prompt();
    }


    public void prompt(){
	if (chara.isAlive()){
	    String prompt = "Choose your action:\n1 - Explore the desert\n2 - Check your inventory\n3 - Look up to the heavens\n4 - Talk to your sand steed\n\nMoves made so far: " + moves + "\n\nTp Left: " + chara.getTp() + "!\nEach move costs 5 Tp, remember that! Hit 0 and you will die!";
	    System.out.println(prompt);
	    String input = Keyboard.readString();
	    if (input.equals("1")){
		if (moves < length){
		    chara.lowertp(5);
		    encounter();
		    prompt();
		}
		else{
		    exit();
		}
	    }	
            else if (input.equals("2")){
		System.out.println("You ruffle through your bag.");
                inventory.prompt(chara);
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
	else{
	    died();
	}
    }

    public void encounter(){
	double rng = Math.random() * 100;
	if (rng < 10){
	    SuperOasis supoas = new SuperOasis(chara);
	    supoas.play();
	    moves++;
	}
	else if (rng < 40){
	    Oasis oas = new Oasis(chara);
	    oas.play();
	    moves++;
	}
	else{
	    attacked();
	}
    }

   public Monster chooseMons(){
	double rng = Math.random() * 100;
	if (rng < 10){
	    return new M_SandDemon();
	}
	else if (rng < 30){
	    return new M_GustKing();
	}
	else if (rng < 50){
	    return new M_Sandsnake();
	}
	else if (rng < 70){
	    return new M_Locus();
	}
	else {
	    return new M_Sandbeetle();
	}
    }

    public void attacked(){
	Monster en = chooseMons();
	System.out.println("What is that! A" + en + "appears!");
	System.out.println("You are going to need to fight.");
	chara.battle(en);
	moves++;
    }

    public void exit(){
	System.out.println("You are weary from your first encounter with danger. The sun beats down on you. You close your eyes.");
	System.out.println("You are ready to begin...");
	System.out.println("SANDSTORY 3D!");
	Town thdTown = new TownThree(chara,inventory);
	thdTown.play();
    }
}




