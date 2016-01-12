public abstract class Character {
    String name;

    int hp;
    int spmp;
    int tp;
    
    int str;
    int end;
    int intl;
    int spd;
    int luck;

    public abstract void battle(Monster m);

}
