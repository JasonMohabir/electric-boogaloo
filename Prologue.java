import cs1.Keyboard;
public class Prologue{
    
    
    Character chara;
    
    public Prologue(Character ch){
	chara = ch;
    }
    
    
    public void play(){
	System.out.println("You march through the desert yet again. The sand pummels your face, stronger than before, making it impossible to see.\nThe sand subsides and then you see a great big river, overflowing with water\nYou and your camel run to the river banks and see lush trees and forest on the other side\nHowever, the two of you notice that the river is much too big for you two alone to cross\nThen suddenly, a cloaked man appears\n'I'm the Oracle,' he says, 'and I can get you across.'\nYou and your camel's eyes light up! Freedom from the desert at last!\n'But,' the Oracle says, 'I can only take one of you, unless you can answer my riddle: What is my true name? Be warned, the wrong answer will end with your death!\nYou look at your camel and it looks back at you. You have a choice to make:\n");
	choice();
    }
    
    public void choice(){
	System.out.println("1 - Answer the Riddle(Hint: Remember hearing anything wierd in the towns or something?)\n2 - Leave your camel behind\n");
	String input = Keyboard.readString();
	if (input.equals("1")){
	    EndOne end1 = new EndOne(chara);
	    end1.play();
	}
	else if (input.equals("2")){
	    EndTwo end2 = new EndTwo(chara);
	    end2.play();
	}
	else{
	    System.out.println("Invalid input");
	}
    }

    public static void main (String[] args){
	Character bill = new Rogue("Bill");
	Prologue test = new Prologue(bill);
	test.play();
    }
}
	   

			   
