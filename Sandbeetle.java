public class Sandbeetle extends Monster{
    
    public Sandbeetle(){
	hp = 50;
	str = 1;
	end = 1;
	intl = 1;
	spd = 2;
	luck = 1;
    }

    public void attack(Character m){
	double dmg = (.5 + Math.random() * .5)*(str * .7 + spd * .4);
	System.out.println("The beast charges, hitting you with " + dmg + " Damage\n");
	m.lowerHp((int)dmg);
    }
    
	
}
