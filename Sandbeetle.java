public class Sandbeetle extends Monster{
    
    public Sandbeetle(){
	hp = 50;
	str = 1;
	end = 1;
	intl = 1;
	spd = 2;
	luck = 1;
    }
    
    public void attack(Character ch){ 
	ch.lowerHp(10);
    }
	
}