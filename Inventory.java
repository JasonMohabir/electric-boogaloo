import cs1.Keyboard;
import java.util.ArrayList;


public class Inventory {
   
    public ArrayList<Item>  inventory;
    public Item Potion, Canteen, Coinpurse;

    public Inventory(){
	ArrayList<Item> inventory = new ArrayList<Item>();

	/*
	for (int i = 0; i < inventory.length; i ++){
	    inventory[i] = new Item(1);
	}

	*/
	System.out.println("Wow! You have opened your sac of inventory. Seems pretty empty.");
	Potion = new Item(10);
	Canteen = new Item(100);
	Coinpurse = new Item(200);
	inventory.add(Potion);
	inventory.add(Canteen);
	inventory.add(Coinpurse);

	/*
	inventory[0] = Potion;
	inventory[1] = Canteen;
	inventory[2] = Coinpurse;
	addItem(Potion,10);
	addItem(Canteen,100);
	addItem(Coinpurse,200);

	*/
	System.out.println("Let's add some items there to make your existence a little more bareable!");
    }

    /*
    void addItem(Item item, int count){
	System.out.println("Diagnostic SOP");
	System.out.println(inventory.length);
	for (int i = 0; i < inventory.length; i++){

	if (! inventory[i].getUsable()){
		inventory[i] = item;
		item.setCount(item.getCount() + count);
	    } 
	    else {
		System.out.println("Looks like your inventory is too small for the new item.");
	    }
	    
	}
    
	
    }
    */


    void prompt(Character c){
	System.out.println("Here is your inventory:");
	System.out.println(toString());
	String prompt = "\nChoose your action:\n1 - Use a potion (restore hp)\n2 - Drink some water (restore tp)\n3 - Exit";
	System.out.println(prompt);
	int input = Keyboard.readInt();
	switch(input){
	case 1: 
	    if (Potion.getCount() > 0){
		Potion.setCount(Potion.getCount()-1);
	    c.incspmp(50);
	    System.out.println("You just consumed 1 potion!");
	    }
	    else {
		System.out.println("You don't have any more potions!");
	    }
	    prompt(c);
	case 2: 
	    System.out.println("How much water do you want to consume?");
	    int wateramt = Keyboard.readInt();
	    if (Canteen.getCount() >= wateramt){
		Canteen.setCount(Canteen.getCount()-wateramt);
	    c.inctp(wateramt);
	    System.out.println("You just consumed water!");
	    }
	    else {
		System.out.println("You don't have enough water!");
	    }
	    prompt(c);
	case 3: 
	    break;
	default:
	    System.out.println("Try again!");
	    prompt(c);
	}
    }

    public String toString(){
	//Sorry for the hardcoded garbage
	String retStr = "Here is your inventory!";
	retStr += "\nPotion Count: " + Potion.getCount();
	retStr += "\nWater  Levels: " + Canteen.getCount();
	retStr += "\nCoin: " + Coinpurse.getCount();
	return retStr;
    }	

    //accessors and mutators

    public void addPotionCount(int n){
	Potion.setCount(Potion.getCount() + n);
    }
    public void addCanteenCount(int n){
	Canteen.setCount(Canteen.getCount() +n);
    }
    public void addCoinpurseCount(int n){
	Coinpurse.setCount(Coinpurse.getCount() + n);
    }
    
    public int getPotionCount(){
	return Potion.getCount();
    }
    
    public int getCanteentCount(){
	return Canteen.getCount();
    }
    
    public int getCoinpurseCount(){
	return Coinpurse.getCount();
    }

    public ArrayList<Item> getInventory(){
	return inventory;
    }
    

}