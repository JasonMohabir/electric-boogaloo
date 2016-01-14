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
	m.lowerHp(10);
    }

    public void DisplayHealth(Monster m){
	System.out.println(name + "'s HP: " + hp + "t\t\t\t\t\t\t\t Enemy's HP: " + m.getHp());
    }
	
    public void action(Monster m){
	System.out.println("1 - Attack");
	String input = Keyboard.readString();
	if (input.equals("1")){
	    attack(m);
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
	    