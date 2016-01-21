import cs1.Keyboard;



public class sandstory{
    //1 is easy, 2 is medium, 3 is hard, 4 is hump-less camel mode
     int difficulty;
     Character chrtr;
    
    public int updateSkills(String input, Character c, int skpts){
	if (input.equals("1")){
	    if(c.getStr() < 10){
		c.setStr(c.getStr() + 1);
		return skpts - 1;
	    }
	    else{
		System.out.println("You have the maximum of this attribute!");
		return skpts;
	    }
	}
	else if (input.equals("2")){
	    if(c.getEnd() < 10){
		c.setEnd(c.getEnd() + 1);
		return skpts - 1;
	    }
	    else{
		System.out.println("You have the maximum of this attribute!");
		return skpts;
	    }
	}	
	else if (input.equals("3")){
	    if(c.getIntl() < 10){
		c.setIntl(c.getIntl() + 1);
		return skpts - 1;
	    }
	    else{
		System.out.println("You have the maximum of this attribute!");
		return skpts;
	    }
	}
	else if (input.equals("4")){
	    if(c.getSpd() < 10){
		c.setSpd(c.getSpd() + 1);
		return skpts - 1;
	    }
	    else{
		System.out.println("You have the maximum of this attribute!");
		return skpts;
	    }
	}
	else if (input.equals("5")){
	    if(c.getLuck() < 10){
		c.setLuck(c.getLuck() + 1);
		return skpts - 1;
	    }
	    else{
		System.out.println("You have the maximum of this attribute!");
		return skpts;
	    }
	}
	else if (input.equals("6")){
	    c.setHp(c.getHp() + 10);
	    return skpts - 1;
	}
	else if (input.equals("7")){
	    c.setSpMp(c.getSpMp() + 10);
	    return skpts - 1;
	}	
	else if (input.equals("8")){
	    c.setTp(c.getTp() + 10);
	    return skpts - 1;
	}
	else if (input.equals("9")){
	    c.autoSkills();
	    return -1;
	}
	else{
	    System.out.println("Invalid input");
	    return skpts;
	}
    }


    public void setStats(Character c){
	int skillpts = 25;
	while (skillpts > 0){
	    System.out.println("Here are your character's current stats:\n" + c);
	    System.out.println("Manually improve your stats");
	    System.out.println("You have " + skillpts + " skillpoints left");
	    System.out.println("1 - Str - Strength, determines how hard you hit.");
	    System.out.println("2 - End - Endurance, how well you can handle hits");
	    System.out.println("3 - Intl - Intelligence, how many skills you can use");
	    System.out.println("4 - Spd - Speed, determines dodge and critical capablilities");
	    System.out.println("5 - Luck - Overall helps out");
	    System.out.println("6 - Hp - Health Power, how much life you have");
	    System.out.println("7 - Sp/Mp - Mana or Stamina Power, needed for skills");
	    System.out.println("8 - Tp - Thirst Power, how well you handle the desert sun");
	    System.out.println("\nOr you can use automated Stat presets. Type '9' for automatic preset");
	    String input = Keyboard.readString();
	    skillpts = updateSkills(input, c, skillpts);
	}
	System.out.println("Here are your character's final stats:\n" + c);
    }

	
    public  int chooseclass(){
	System.out.println("Choose a class for you character:");
	System.out.println("1 - Warrior");
	System.out.println("2 - Mage");
	System.out.println("3 - Rouge");
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

    public  void createchar(){
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
	setStats(chrtr);
    }


    public  void choosedif(){
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
    
    public  void start(){
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

    public   void play(){

	System.out.println(" \n\n =+++++++++++++++++++++++++++++++++++++++++=\n\n Welcome to Sand Story 3D\n Note that this game is not in 3D\n\n Sand Story 3D: A tale of friendship, hardship , and sand.\n\n Type 'Start' to begin\n\n ");
	start();
        createchar();
	Zone z1 = new ZoneOne(chrtr);
	z1.play();
    }
    public static void main (String [] args){
	sandstory newgame = new sandstory();
	newgame.play();
    }
}
