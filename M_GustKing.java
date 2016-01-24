public class M_GustKing extends Monster{
    
    public M_GustKing(){
	hp = 40;
	str = 8;
	end = 0;
	intl = 0;
	spd = 7;
	luck = 1;
    }

    public String toString(){
	return " GustKing ";
    }

    public void attack(Character m){
	double dmg = 1 + (.5 + Math.random() * .5)*(str * 1 + spd * .4) - enemydef(m);
	System.out.println("The beast charges, hitting you with " + (int)dmg + " Damage\n");
	m.lowerHp((int)dmg);
    }
    
	
}