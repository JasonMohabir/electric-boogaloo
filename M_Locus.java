public class M_Locus extends Monster{
    
    public M_Locus(){
	hp = 50;
	str = 2;
	end = 3;
	intl = 2;
	spd = 9;
	luck = 1;
    }

    public String toString(){
	return " Locus ";
    }

    public void attack(Character m){
	double dmg = 1 + (.5 + Math.random() * .5)*(str * 1 + spd * .4) - enemydef(m);
	System.out.println("The beast charges, hitting you with " + (int)dmg + " Damage\n");
	m.lowerHp((int)dmg);
    }
    
	
}