import cs1.Keyboard;
public class Rogue extends Character{
    
    public Rogue (String n){
	name = n;
	hp = 50;
	spmp = 40;
	tp = 50;
	str = 0;
	end = 0;
	intl = 0;
	spd = 0;
	luck = 0;
    }

 public void autoSkills(){
	hp = 80;
	spmp = 50;
	tp = 40;
	str = 4;
	end = 5;
	intl = 5;
	spd = 9;
	luck = 5;
    }


    public void fullHeal(){
	hp = 80;
    }
    
   public void attack(Monster m){
	double dmg;
	dmg = (.8 + Math.random() * .2)*((str * .2) + (spd * .2) + (luck * .04));
	System.out.println("Your quick strikes deal " + dmg + " Damage\n");
	m.lowerHp((int)dmg);
	if (Math.random() * 100 <= spd){
	    System.out.println("Your nimble manuvers and skills let you land a second blow!");
	    dmg = (.4 + Math.random() * .3)*((str * .4) + (spd * .3) + (luck * .04));
	    System.out.println("Your second hit deals " + dmg + " Damage\n");
	    m.lowerHp((int)dmg);
	}
    }
    
    public void DisplayHealth(Monster m){
	System.out.println(name + "'s HP: " + hp + "\t\t\t\t\t\t\t Enemy's HP: " + m.getHp());
    }
	
    //List of Actions
    public void action(Monster m){
	System.out.println("1 - Basic Attack");
	System.out.println("2 - Use a Skill");
	System.out.println("3 - Use an Item");
	System.out.println("4 - Run away");
	String input = Keyboard.readString();
	if (input.equals("1")){
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
    
    //Enemy attack
    public void enemyaction(Monster m){
	m.attack(this);
    }

    public void Afterbattle(Monster m){
	if (!(isAlive() || m.isAlive())){
	    System.out.println("Your foe perishes before you, but not before claiming your life for themselves. You are dead. At least you tried");
	}
	else if (!(isAlive())){
	    System.out.println("Your strength fails you. You're dead.");
	}
	else if(!(m.isAlive())){
	    System.out.println("You emerge victorious! Nice kill.");
	}
    }
    
    
    public void battle(Monster m){
	System.out.println("The Battle Begins\n\n");
	while (isAlive() && m.isAlive()){
	    DisplayHealth(m);
	    System.out.println("What do you do?");
	    action(m);
	    enemyaction(m);  
	}
	Afterbattle(m);
    };
	
    public String toString(){
	return name + " is a powerful Rogue with these stats:" + 
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
