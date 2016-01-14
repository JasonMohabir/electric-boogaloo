import cs1.Keyboard;
public class Warrior extends Character{
    
    public Warrior(String n){
	name = n;
	hp = 100;
	spmp = 50;
	tp = 45;
	str = 9;
	end = 8;
	intl = 3;
	spd = 4;
	luck = 5;
    }
    
    public void attack(Monster m){
	int dmg = 10;
	System.out.println("Your towering strength produces " + dmg + " Damage\n");
	m.lowerHp(dmg);
    }

    public void DisplayHealth(Monster m){
	System.out.println(name + "'s HP: " + hp + "\t\t\t\t\t\t\t Enemy's HP: " + m.getHp());
    }
	
    public void action(Monster m){
	System.out.println("1 - Basic Attack");
	System.out.println("2 - Use a Skill");
	System.out.println("3 - Use an Item");
	System.out.println("4 - Run away");
	String input = Keyboard.readString();
	if (input.equals("1")){
	    System.out.println("Your majestic blade bathes in crimson as you dig the blade into your foe");
	    attack(m);
	}
	else if (input.equals("2")){
	    System.out.println("Under development. Please understand fam");
	    action(m);
	}
	else if (input.equals("3")){
	    System.out.println("Under development. Please understand fam");
	    action(m);
	}
	else if (input.equals("4")){
	    System.out.println("Under development. Please understand fam");
	    action(m);
	}
	else{
	    System.out.println("Invalid input");
	    action(m);
	}
    }
    
    public void enemyaction(Monster m){
	m.attack(this);
    }
	

    public void battle(Monster m){
	System.out.println("The Battle Begins\n\n");
	while (isAlive() && m.isAlive()){
	    DisplayHealth(m);
	    System.out.println("What do you do?");
	    action(m);
	    enemyaction(m);  
	}	    
    };
    
    public String toString(){
	return name + " is a powerful Warrior with these stats:" + 
	    "\nHp = " + hp +
	    "\nSp = " + spmp +
	    "\nTp = " + tp +
	    "\nStrength = " + str +
	    "\nEndurance = " + end +
	    "\nInteligence = " + intl +
	    "\nSpeed = " + spd +
	    "\nLuck = " + luck;
    }

}
	    
