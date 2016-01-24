
public abstract class Zone {
    int length;
    int encChance;
    Character chara;
    
    public void died(){
	System.out.println("The game is over!");
    }

    public abstract void play();
}
