public abstract class Character {

    protected int hp, str, tp, end, intl, spd, luck, spmp;
    protected String name;

 
    public boolean isAlive(){
	return ( hp > 0 );
    }

    public void attack(){
    }


}
