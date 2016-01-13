public abstract class Monster extends Character {

    public Monster(){
	super(150,((int)(Math.random() * 25 ) + 20),20,2.5);
    }

    // attack method
    // input: other Character
    // int damage = (int)((strength * attackRating) - c.getDefense());
    // c.lowerHP(damage);
    // return damage;
}

   
}
