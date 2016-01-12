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
    
    public void battle(Monster m){
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
	    