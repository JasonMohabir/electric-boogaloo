import cs1.Keyboard;

public class EndOne{
    

    Character chara;
    
    public EndOne(Character ch){
	chara = ch;
    }
    
    public void play(){
	System.out.println("You have chosen to the answer the riddle!\n");
	answer();
    }
    
    public void answer(){
	System.out.println("What is the Oracle's true name?\n");
	String input = Keyboard.readString();
	if (input.equals("JOHN CENA!")){
	    bestend();
	}
	else{
	    badend();
	}
    }

    public void bestend(){
	System.out.println("The Oracle nods his head and takes you and your camel across\nYou arrive in the lish forest and are free from the desert!\nCongrats!\n" + chara.getName() + " has successfully beaten SandStory 3D!");
    }
    
    public void badend(){
	System.out.println("The Oracle shakes his head and attacks you\nYour camel dives in the way of the strike and takes the hit instead\nThe Oracle, startled, runs away leaving his boat behind\nYou stand in the sand with your dying camel in your arms. A single tear rolls down his eyes and he passes away\nYou take the Oracle's boat and leave the desert\nIt was bittersweet in the end, but " + chara.getName() + " has successfully beaten SandStory 3D");
    }  
}