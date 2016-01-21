

public abstract class Character {

    protected int hp, str, tp, end, intl, spd, luck, spmp;
    protected String name;

    public void fullHeal(){
    }
 
    public boolean isAlive(){
	return ( hp > 0 );
    }

    public void attack(Monster m){
    }
    
    public void battle(Monster m){
    }

    public void lowerHp(int dmg){
	hp = hp - dmg;
    }

    public void lowerspmp(int cst){
	spmp = spmp - cst;
    }

    public void autoSkills(){
    }

    //Acessors
    public String getName(){
	return name;
    }
    public int getHp(){
	return hp;
    }
    public int getStr(){
	return str;
    }
    public int getTp(){
	return tp;
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
    public int getLuck(){
	return luck;
    }
    public int getSpMp(){
	return spmp;
    }

    //Muatators
    public void setHp(int n){
	hp = n;
    }
    public void setStr(int n){
	str = n;
    }
    public void setTp(int n){
	tp = n;
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
    public void setSpMp(int n){
	spmp = n; 
    }

}
