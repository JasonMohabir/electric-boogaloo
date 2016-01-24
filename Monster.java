public abstract class Monster {
    
    public int hp, str, end, intl, spd, luck;
    public boolean isFrozen, isStunned, isPoisoned, isBurned, isBleeding = false;
    
    

    public double enemydef(Character m){
	return ((.5 + Math.random() * .5) * m.getEnd() * .3);
    }

    public void attack(Character m){
    }
    
    public void charaction(Character m){
	if (!(m.dodgechance())){
	    attack(m);
	    }
	else{
	    System.out.println("The beast charges, but you quickly dodge\n");
	}
    }


    public void action(Character m){
	double dmg;
	if (isFrozen == true){
	    System.out.println("The enemy is frozen and can't attack this turn");
	    if (Math.random() * 100 < 90){
		statusChange("UnFrozen");
		System.out.println("The enemy breaks free from the ice");
	    }
	    else{
		 System.out.println("The enemy fails to break through the ice");
	    }
	    return;
	}
	if (isStunned == true){
	    System.out.println("The enemy is stunned and can't attack this turn");
	    if (Math.random() * 100 < 90){
		statusChange("UnStunned");
		System.out.println("The enemy breaks free from the stun");
	    }
	    else{
		 System.out.println("The enemy fails to overcome the stun");
	    }
	    return;
	}
	if (isBurned == true){
	    dmg = Math.random() * 3;
	    lowerHp((int)dmg);
	    System.out.println("The enemy is burned and takes " + dmg + " Damage");
	    if (Math.random() * 100 < 70){
		statusChange("UnBurned");
		System.out.println("The enemy estinguishes fire");
	    }
	    else{
		 System.out.println("The enemy fails to stop the fire");
	    }
	    
	}
	if (isPoisoned == true){
	    dmg = Math.random() * 3;
	    lowerHp((int)dmg);
	    System.out.println("The enemy is poisoned and takes " + dmg + " Damage");
	    if (Math.random() * 100 < 70){
		statusChange("UnPoisoned");
		System.out.println("The enemy fights off the poison");
	    }
	    else{
		 System.out.println("The enemy fails to fight off the poison");
	    }
	    
	}
	if (isBleeding == true){
	    dmg = Math.random() * 3;
	    lowerHp((int)dmg);
	    System.out.println("The enemy is bleeding and takes " + dmg + " Damage");
	    if (Math.random() * 100 < 70){
		statusChange("UnBleeding");
		System.out.println("The enemy stops the bleeding");
	    }
	    else{
		 System.out.println("The enemy fails to stop the bleeding");
	    }
	   
	}
	charaction(m);
    }

    public boolean isAlive(){
	return ( hp > 0 );
    }

    public void lowerHp(int dmg){
	hp = hp - dmg;
    }
   
    public void statusChange(String s){
	if (s.equals("Frozen")){
	    isFrozen = true;
	}
	if (s.equals("UnFrozen")){
	    isFrozen = false;
	}
	if (s.equals("Stunned")){
	    isStunned = true;
	}
	if (s.equals("UnStunned")){
	    isStunned = false;
	}
	if (s.equals("Poisoned")){
	    isPoisoned = true;
	}
	if (s.equals("UnPoisoned")){
	    isPoisoned = false;
	}
	if (s.equals("Bleeding")){
	    isBleeding = true;
	}
	if (s.equals("UnBleeding")){
	    isBleeding = false;
	}
	if (s.equals("Burned")){
	    isBurned = true;
	}
	if (s.equals("UnBurned")){
	    isBurned = false;
	}
    }	  
    
    //Acessors
    public int getHp(){
	return hp;
    }
    public int getStr(){
	return str;
    }
    public int getEnd(){
	return end;
    }
    public int getIntl(){
	return intl;
    }
    public int getSpd(){
	return spd;
    }
    public int getLucc(){
	return luck;
    }

    //Muatators
    public void setHp(int n){
	hp = n;
    }
    public void setStr(int n){
	str = n;
    }
    public void setEnd(int n){
	end = n;
    }
    public void setIntl(int n){
	intl = n;
    }
    public void setSpd(int n){
	spd = n;
    }
    public void setLuck(int n){
	luck = n;
    }
}

   

