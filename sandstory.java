import cs1.Keyboard;
public class sandstory{
    //1 is easy, 2 is medium, 3 is hard, 4 is hump-less camel mode
    int difficulty;
    
    public  void choosedif(){
	String input = Keyboard.readString();
	if (input.equals("1")){
	    difficulty = 1;
	}
	else if (input.equals("2")){
	    difficulty = 1;
	}	
	else if (input.equals("3")){
	    difficulty = 1;
	}
	else if (input.equals("4")){
	    difficulty = 1;
	}
	else{
	    System.out.println("invalid input");
	    System.out.println("Okay boss. Select difficulty:\n 1 - Easy\n 2 - Medium\n 3 - Hard\n 4 - Humpless Camel");
	    choosedif();
	}
    }
    
    public static void start(){
	String input = Keyboard.readString();
	if (input.equals("Start")){
	    System.out.println("Okay boss. Select difficulty:\n 1 - Easy\n 2 - Medium\n 3 - Hard\n 4 - Humpless Camel");
	}
	else{
	    System.out.println("Try again");
	    start();
	}
    }

    public static void play(){
	System.out.println(" \n\n =+++++++++++++++++++++++++++++++++++++++++=\n\n Welcome to Sand Story 3D\n Note that this game is not in 3D\n\n Sand Story 3D: A tale of friendship, hardship , and sand.\n\n Type 'Start' to begin\n\n ");
	start();
    }
    public static void main (String [] args){
	play();
    }
}
