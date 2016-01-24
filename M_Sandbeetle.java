public class M_Sandbeetle extends Monster{
    
    public M_Sandbeetle(){
	hp = 50;
	str = 4;
	end = 3;
	intl = 2;
	spd = 2;
	luck = 1;
    }

    public void attack(Character m){
	double dmg = (.5 + Math.random() * .5)*(str * .9 + spd * .4) - enemydef(m);
	System.out.println("The beast charges, hitting you with " + (int)dmg + " Damage\n");
	m.lowerHp((int)dmg);
    }
    
	
}
