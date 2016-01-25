import cs1.Keyboard;

public class Inventory {
   
    public Item[] inventory;

    public Inventory(){

	Item[] inventory = new Item[3];
	for (int i = 0; i < inventory.length; i ++){
	    inventory[i] = new Item(1);
	}

	System.out.println("Wow! You have opened your sac of inventory. Seems pretty empty.");
	Item Potion = new Item(10);
	Item Canteen = new Item(100);
	Item Coinpurse = new Item(200);
	inventory[0] = Potion;
	inventory[1] = Canteen;
	inventory[2] = Coinpurse;
	/*
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

	System.out.println("Diagnostic SOP 1");

	if (! inventory[i].getUsable()){
		inventory[i] = item;
		item.setCount(item.getCount() + count);
	    } 
	    else {
		System.out.println("Looks like your inventory is too small for the new item.");
	    }
	    
	    System.out.println("Diagnostic SOP 2");
	}
    
	
    }
    */


    void prompt(Character c){
	System.out.println("Here is your inventory");
	System.out.println(toString());
	String prompt = "\nChoose your action:\n1 - Use a potion (restore hp)\n2 - Drink some water (restore tp)\n3 - Exit";
	    System.out.println(prompt);
	String input = Keyboard.readString();
	switch(input){
	case "1": 
	    if (inventory[0].count > 0){
	    inventory[0].count -= 1;
	    c.incspmp(50);
	    System.out.println("You just consumed 1 potion!");
	    }
	    else {
		System.out.println("You don't have any more potions!");
	    }
	    prompt(c);
	case "2": 
	    System.out.println("How much water do you want to consume?");
	    int wateramt = Keyboard.readInt();
	    if (inventory[1].count >= wateramt){
	    inventory[1].count -= wateramt;
	    c.inctp(wateramt);
	    System.out.println("You just consumed water!");
	    }
	    else {
		System.out.println("You don't have enough water!");
	    }
	    prompt(c);
	case "3": 
	    break;
	default:
	    System.out.println("Try again!");
	    prompt(c);
	}
    }

    public String toString(){
	//Sorry for the hardcoded garbage
	String retStr = "Here is your inventory!";
	retStr += "\nPotion Count: " + inventory[0].getCount();
	retStr += "\nWater  Levels: " + inventory[1].getCount();
	retStr += "\nCoin: " + inventory[2].getCount();
	return retStr;
    }	

}