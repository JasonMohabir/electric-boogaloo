import cs1.Keyboard;
public class Mage extends Character{
    
    public Mage(String n){
	name = n;
	hp = 70;
	spmp = 90;
	tp = 35;
	str = 4;
	end = 5;
	intl = 9;
	spd = 7;
	luck = 6;
    }
    
    public void battle(Monster m){
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
	    