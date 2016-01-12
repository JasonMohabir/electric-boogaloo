import cs1.Keyboard;
public class sandstory{
    //1 is easy, 2 is medium, 3 is hard, 4 is hump-less camel mode
    static int difficulty;
    static Character chrtr;
    
    public static int chooseclass(){
	System.out.println("Choose a class for you character:");
	System.out.println("\n1 - Warrior");
	System.out.println("\n2 - Mage");
	System.out.println("\n3 - Rouge");
	String input = Keyboard.readString();
	if (input.equals("1")){
	    return 1;
	}
	else if (input.equals("2")){
	    return 2;
	}	
	else if (input.equals("3")){
	    return 3;
	}
	else{
	    System.out.println("invalid input\n\n");
	    return chooseclass();
	}
    }

    public static void createchar(){
	System.out.println("Choose a name for you character:");
	String name = Keyboard.readString();
        int classnum = chooseclass();
	if (classnum == 1){
	    chrtr = new Warrior(name);
	}
	if (classnum == 2){
	    chrtr = new Mage(name);
	}
	if (classnum == 3){
	    chrtr = new Rogue(name);
	}
	System.out.println(chrtr);
    }


    public static void choosedif(){
	String input = Keyboard.readString();
	if (input.equals("1")){
	    difficulty = 1;
	}
	else if (input.equals("2")){
	    difficulty = 2;
	}	
	else if (input.equals("3")){
	    difficulty = 3;
	}
	else if (input.equals("4")){
	    difficulty = 4;
	}
	else{
	    System.out.println("invalid input\n\n");
	    System.out.println("Okay boss. Select difficulty:\n 1 - Easy\n 2 - Medium\n 3 - Hard\n 4 - Humpless Camel\n\n");
	    choosedif();
	}
    }
    
    public static void start(){
	String input = Keyboard.readString();
	if (input.equals("Start")){
	    System.out.println("Okay boss. Select difficulty:\n 1 - Easy\n 2 - Medium\n 3 - Hard\n 4 - Humpless Camel");
	    choosedif();
	}
	else{
	    System.out.println("Try again");
	    start();
	}
    }

    public static  void play(){
	System.out.println(" \n\n =+++++++++++++++++++++++++++++++++++++++++=\n\n Welcome to Sand Story 3D\n Note that this game is not in 3D\n\n Sand Story 3D: A tale of friendship, hardship , and sand.\n\n Type 'Start' to begin\n\n ");
	start();
        createchar();
    }
    public static void main (String [] args){
	play();
    }
}
