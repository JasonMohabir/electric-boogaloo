import cs1.Keyboard;
public class Warrior extends Character{
    
    public Warrior(String n){
	name = n;
	hp = 60;
	spmp = 30;
	tp = 45;
	str = 0;
	end = 0;
	intl = 0;
	spd = 0;
	luck = 0;
    }
    public void autoSkills(){
	hp = 100;
	spmp = 50;
	tp = 50;
	str = 9;
	end = 7;
	intl = 2;
	spd = 2;
	luck = 5;
    }
    
    public void fullHeal(){
	hp = 100;
    }

 

    
    public void attack(Monster m){
	double dmg;
	double hpinc;
	dmg = (.8 + Math.random() * .2)*((str * .6) + (spd * .2) + (luck * .04)) - enemydef(m);
	System.out.println("Your towering strength deals " + (int)dmg + " Damage\n");
	m.lowerHp((int)dmg);
	if (Math.random() * 10 <= 2){
	    hpinc = (1 +  Math.random()) * 2;
	    System.out.println("Your overbearing strength heals your wounds");
	    incHp((int)hpinc);
	}
    }
    public void DisplayHealth(Monster m){
	System.out.println(name + "'s HP: " + hp + "\t" + name + "'s Sp/Mp: " + spmp + "\t\t\t Enemy's HP: " + m.getHp());
    }
	

  public void BluntBash(Monster m){
	if(spmp < 25){
	    System.out.println("You don't have enough Sp/Mp and the skill fizzles!"); 
	}
	else{
	    double dmg;
	    this.lowerspmp(25);
	    dmg = (.9 + Math.random() * 1.2)*((str * .1) + (spd * .1) + (luck * .04)) - enemydef(m);
	    m.lowerHp((int)dmg);
	    System.out.println("Your Blunt Bash does " + (int)dmg + " Damage\n");
	    if (Math.random() * 100 < 60){
		m.statusChange("Stunned");
		System.out.println("Your Blunt Bash stuns your foe!");
	    }
	}
  }

 public void PreciseStrike(Monster m){
	if(spmp < 20){
	    System.out.println("You don't have enough Sp/Mp and the skill fizzles!"); 	 
	}
	else{
	    double dmg;
	    this.lowerspmp(20);
	    dmg = (.9 + Math.random() * 1.2)*((str * .5) + (spd * .1) + (luck * .04)) - enemydef(m);
	    m.lowerHp((int)dmg);
	    System.out.println("Your Precise Strike does " + (int)dmg + " Damage\n");
	    if (Math.random() * 100 < 80){
		m.statusChange("Bleeding");
		System.out.println("Your Precise strike causes your foe to bleed!");
	    }
	}
  }

 public void Charge(Monster m){
	if(spmp < 15){
	    System.out.println("You don't have enough Sp/Mp and the skill fizzles!"); 
	}
	else{
	    double dmg;
	    this.lowerspmp(15);
	    dmg = (.9 + Math.random() * 1.2)*((str * .7) + (spd * .2) + (luck * .04)) - enemydef(m);
	    m.lowerHp((int)dmg);
	    System.out.println("Your Charge does " + (int)dmg + " Damage\n");
	}
  }

  public void SkillsDisplay(Monster m){
	System.out.println("1 - Charge: Costs 15 SpMp, This is a powerful charge and hit against your enemy!");
	System.out.println("2 - Blunt Bash: Costs 25 SpMp, This ability has a chance to stun your enemy!");
	System.out.println("3 - Precise Strike: Costs 20 SpMp, This ability has a chance to make your opponent bleed!");
	System.out.println("4 - Go Back");
	String input = Keyboard.readString();
	if (input.equals("1")){
	    Charge(m);
	}
	else if (input.equals("2")){
	    BluntBash(m);
	}
	else if (input.equals("3")){
	    PreciseStrike(m);
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
	    System.out.println("Your majestic blade bathes in crimson as you dig the blade into your foe");
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
	    
