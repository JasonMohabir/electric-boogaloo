public class M_SandDemon extends Monster{
    
    public M_SandDemon(){
	hp = 100;
	str = 8;
	end = 3;
	intl = 2;
	spd = 3;
	luck = 1;
    }

    public String toString(){
	return " SandDemon ";
    }

    public void attack(Character m){
	double dmg = 1 + (.5 + Math.random() * .5)*(str * 1 + spd * .4) - enemydef(m);
	System.out.println("The beast charges, hitting you with " + (int)dmg + " Damage\n");
	m.lowerHp((int)dmg);
    }
    
	
}