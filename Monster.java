public abstract class Monster {
    
    public int hp, str, end, intl, spd, luck;

    public void attack(Character ch){
    }

    public boolean isAlive(){
	return ( hp > 0 );
    }

    public void lowerHp(int dmg){
	hp = hp - dmg;
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

   

