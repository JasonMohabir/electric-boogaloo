public abstract class Character {
    protected String name;

    protected int health, strength, thirst, endurance, intelligence, speed, luck;
    protected double attackRating;
    protected String name;
    protected final int STRENGTH, DEFENSE;
    protected final double ATTACKRATING;

    // Constructor
    public Character(int h, int s, int d, double a){
	setHealth(h);
	STRENGTH = s;
	DEFENSE = d;
	ATTACKRATING = a;
	normalize();
    }

    // Mutators
    public void setHealth(int n) { health = n;}
    public void setStrength(int n) { strength = n;}
    public void setDefense(int n) { defense = n;}
    public void setAttackRating(double n) { attackRating = n;}
    public void setName(String s) { name = s; }
    
    public boolean isAlive(){
	return ( health > 0 );
    }

    // Accessors 
    public int getDefense() {return defense;}
    public int getHealth() {return health;}
    public String getName() {return name;}

    public void normalize() {
	setStrength(STRENGTH); 
	setDefense(DEFENSE); 
	setAttackRating(ATTACKRATING);
    }
    
    public void lowerHP(int a){
	if (a < 0) { health = health; }
	else { health -= a; }
    }

    public int attack(Character c){
	int damage = (int)((strength * attackRating) - c.getDefense());
	c.lowerHP(damage);
	return damage;
    }


}
