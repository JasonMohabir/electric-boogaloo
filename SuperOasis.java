public class SuperOasis{
    Character chara;
    
    public SuperOasis(Character ch){
	chara = ch;
    }
    
    public void play(){
	System.out.println("You come across a magnificent oasis in the desert.\nIts lush with resources. You and your camel ravish it, healing yourseleves up to the fullest!");
	chara.fullHp();
	chara.fullTp();
	chara.fullSpMp();
    }
}
	