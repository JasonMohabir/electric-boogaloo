// BEGENEN: Health Center, Wealth Shop, [Training Area], Pub
import cs1.Keyboard;

public class TownOne extends Town {
    Character chara;

    public TownOne(Character ch){
	chara = ch;
    }


    // creates the monster, that will attack 
    public void play(){
	System.out.println("You enter the town of BEGENEN. Few residents are around, but hopefully you can get on your way.");
	System.out.println("You should probably explore the TAVERN");
	prompt();
    }
    
    public void prompt(){
	
	String prompt = "Choose your action:\n1 - Explore the town\n2 - Check your inventory\n3 - Go to the tavern\n4 - Go to the pub\n5 - Go to the zed zed";
	System.out.println(prompt);
	String input = Keyboard.readString();

	if (input.equals("1")){
	    System.out.println("Under development");
	    prompt();
	}
	if (input.equals("2")){
	    System.out.println("You ruffle through your bag.");
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

   public void exit(){
	
    }

}
