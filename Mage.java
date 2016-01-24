import cs1.Keyboard;
public class Mage extends Character{
    
    public Mage(String n){
	name = n;
	hp = 30;
	spmp = 70;
	tp = 50;
	str = 0;
	end = 0;
	intl = 0;
	spd = 0;
	luck = 0;
    }

    public void autoSkills(){
	hp = 70;
	spmp = 100;
	tp = 50;
	str = 2;
	end = 3;
	intl = 9;
	spd = 4;
	luck = 5;
    }
    
    public void fullHeal(){
	hp = 70;
    }
   public void attack(Monster m){
	double dmg;
	double mpinc;
	dmg = 1 + (.8 + Math.random() * .2)*((str * .4) + (spd * .2) + (luck * .04)) - enemydef(m);
	System.out.println("Your mystical beams deal " + (int)dmg + " Damage\n");
	m.lowerHp((int)dmg);
	if (Math.random() * 13 <= intl){
	    System.out.println("Your immense wisdom and focus allows you to heal some SpMp!");
	    mpinc = Math.random() * 25;
	    incspmp((int)mpinc);
	}
    }

    public void DisplayHealth(Monster m){
	System.out.println(name + "'s HP: " + hp + "\t" + name + "'s Sp/Mp: " + spmp + "\t\t\t\t\t\t\t Enemy's HP: " + m.getHp());
    }

    public void Fireball(Monster m){
	if(spmp < 30){
	    System.out.println("You don't have enough Sp/Mp and the skill fizzles!");
	}
	else{
	    double dmg;
	    this.lowerspmp(30);
	    dmg = 1 + (.9 + Math.random() * 1.2)*((intl * .5) + (str * .2) + (luck * .04)) - enemydef(m);
	    m.lowerHp((int)dmg);
	    System.out.println("Your Fireball does " + (int)dmg + " Damage\n");
	    if (Math.random() * 100 < 80){
		m.statusChange("Burned");
		System.out.println("Your Fireball burns your foe!");
	    }
	}
    }	

  public void Icestrike(Monster m){
	if(spmp < 60){
	    System.out.println("You don't have enough Sp/Mp and the skill fizzles!");
	}
	else{
	    double dmg;
	    this.lowerspmp(60);
	    dmg = 1 + (.9 + Math.random() * 1.2)*((intl * .5) + (str * .2) + (luck * .04)) - enemydef(m);
	    m.lowerHp((int)dmg);
	    System.out.println("Your Icestrike does " + (int)dmg + " Damage\n");
	    if (Math.random() * 100 < 60){
		m.statusChange("Frozen");
		System.out.println("Your Icestrike freezes your foe!");
	    }
	}
    }

    public void BlindingLight(Monster m){
	if(spmp < 40){
	    System.out.println("You don't have enough Sp/Mp and the skill fizzles!");
	}
	else{
	    double dmg;
	    this.lowerspmp(30);
	    dmg = 1;
	    m.lowerHp((int)dmg);
	    System.out.println("Your Icestrike does " + (int)dmg + " Damage\n");
	    if (Math.random() * 100 < 90){
		m.statusChange("Stunned");
		System.out.println("Your Blinding Light stuns your foe!");
	    }
	}
    }

    public void SkillsDisplay(Monster m){
	System.out.println("1 - Fireball: Costs 30 SpMp, This ability has a chance to set your enemy of  fire!");
	System.out.println("2 - Icestrike: Costs 60 SpMp, This ability has a chacne to freeze your enemy! ");
	System.out.println("3 - Blinding  Light: Costs 40 SpMp, This ability has a chacne to stun your enemy!");
	System.out.println("4 - Go Back");
	String input = Keyboard.readString();
	if (input.equals("1")){
	    Fireball(m);
	}
	else if (input.equals("2")){
	    Icestrike(m);
	}
	else if (input.equals("3")){
	    BlindingLight(m);
	}
	else if (input.equals("4")){
	    action(m);
	}
	else{
	    System.out.println("Invalid input");
	    SkillsDisplay(m);
	}
    }
    
    public void action(Monster m){
	System.out.println("1 - Basic Attack");
	System.out.println("2 - Use a Skill");
	System.out.println("3 - Use an Item");
	System.out.println("4 - Run away");
	String input = Keyboard.readString();
	if (input.equals("1")){
	    System.out.println("Your magical strike hits the foe head on");
	    attack(m);
	}
	else if (input.equals("2")){
	    SkillsDisplay(m);
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
	m.action(this);
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
	return name + " is a powerful Mage with these stats:" + 
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
	    
