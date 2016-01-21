class Item {
    // the name of the item will be unique
    public String name;
    

    //stackable -- boolean True-item can be stacked False-item can't be stacked
    boolean stackable;
	
    //max amount this item can be stacked
    int maxStack;
    //var for current stack size
    int stackSize;
    
    //Item Description - used when displaying the inventory in game
    String itemDesc;

   
    public Item(String name, String itemDesc, int maxStack) {
	this.name = name;
	this.itemDesc = itemDesc;
	this.maxStack = macStack;
    }

}
