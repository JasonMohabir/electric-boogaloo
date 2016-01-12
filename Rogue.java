import cs1.Keyboard;
public class Rogue extends Character{
    
    public Rogue (String n){
	name = n;
	hp = 80;
	spmp = 70;
	tp = 65;
	str = 7;
	end = 4;
	intl = 7;
	spd = 9;
	luck = 3;
    }
    
    public void battle(Monster m){
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
