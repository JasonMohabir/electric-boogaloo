import cs1.Keyboard;

public class Oasis{
    Character chara;
    
    public Oasis(Character ch){
	chara = ch;
    }
    
    public void play(){
	System.out.println("You come across an ordinary oasis in the desert.\nIts sparse with resources. You and your camel have only enough to heal up one aspect of you wounds!\n");
	choice();
    }
    
    public void choice(){
	System.out.println("You have a choice to make\n");
	System.out.println("1 - Heal your Hp ");
	System.out.println("2 - Heal your Tp");
	System.out.println("3 - Heal your SpMp");
	System.out.println("4 - Do nothing");
	String input = Keyboard.readString();
	if (input.equals("1")){
	    chara.fullHp();
	    System.out.println("You heal up your Hp\n");
	}
	else if (input.equals("2")){
	    chara.fullTp();
	    System.out.println("You heal up your Tp\n");
	}
	else if (input.equals("3")){
	    chara.fullSpMp();
	    System.out.println("You heal up your SpMp\n");
	}	
	else if (input.equals("4")){
	    System.out.println("What an odd decision!\n");
	}
	else{
	    System.out.println("\nInvalid input\n");
	}
    }
}
