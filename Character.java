

public abstract class Character {

    protected int hp, str, tp, end, intl, spd, luck, spmp;
    protected int maxhp, maxspmp, maxtp;
    protected int diff; 
    protected String name;

    public void fullHp(){
	hp = maxhp;
    }
    public void fullTp(){
	tp = maxtp;
    }
    public void fullSpMp(){
	spmp = maxspmp;
    }
    
    public double enemydef(Monster m){
	return ((.5 + Math.random() * .5) * m.getEnd() * .3);
    }    

    public void setDiff(int d){
	diff = d;
    }

    public void setmaxes(){
	maxhp = hp;
	maxspmp = spmp;
	maxtp = tp;
    }

    public int getDiff(){
	return diff;
    }
    public boolean dodgechance(){
	return (Math.random() * 100 < (spd + 5) );
    }
 
    public boolean isAlive(){
	if (tp <= 0){
	    System.out.println("You are out of Tp! You die from rapid dehydration! Welp, that's pretty bad!\n");
	}
	return ( hp > 0 && tp > 0);
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

    public void lowertp(int cst){
	tp = tp - cst;
    }
    
    public void incHp(int heal){
	int oldhp = hp;
	if (hp == maxhp){
	    System.out.println("You tried to heal but you are at max Hp!");
	}
	else if((oldhp + heal) > maxhp){
	    hp = maxhp;
	    System.out.println("You healed " + (hp - oldhp) + " Hp.");
	}
	else{
	    hp = oldhp + heal;
	    System.out.println("You healed " + heal + " Hp.");
	}
    }

    public void incspmp(int cst){
	int oldspmp = spmp;
	if (spmp == maxspmp){
	    System.out.println("You tried to heal but you are at max SpMp!");
	}
	else if((oldspmp + cst) > maxspmp){
	    spmp = maxspmp;
	    System.out.println("You healed " + (spmp - oldspmp) + " SpMp.");
	}
	else{
	    spmp = oldspmp + cst;
	    System.out.println("You healed " + cst + " SpMp.");
	}
    }

    public void inctp(int cst){
	int oldtp = tp;
	if (tp == maxtp){
	    System.out.println("You tried to heal but you are at max Tp!");
	}
	else if((oldtp + cst) > maxtp){
	    tp = maxtp;
	    System.out.println("You healed " + (tp - oldtp) + " Tp.");
	}
	else{
	    tp = oldtp + cst;
	    System.out.println("You healed " + cst + " Tp.");
	}
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
