import java.util.ArrayList;
// for shops, people, rooms, etc.
// keep amounts correct

class Inventory extends ArrayList<InventoryItem> {
    private InventoryItem findItem(String itemName) {
	for(InventoryItem invItem : this) {
	    if (invItem.item.name.equals(itemName)) {
		return invItem;
	    }
	}
	return null;
    }
    
    private InventoryItem findItem(Item item) {
	return findItem(item.name);
    }

    public int getItemCount(Item item) {
	InventoryItem invItem = findItem(item);
	if (invItem==null) { return 0; }
	return invItem.amount;
    }
    
    public Item takeItem(Item item) {
	InventoryItem invItem = findItem(item);
	if (invItem==null) { return null; }
	invItem.amount--;
	if (invItem.amount==0) { this.remove(invItem); }
	return item;
    }
    
    public int receiveItem(Item item) {
	InventoryItem invItem = findItem(item);
	if (invItem==null) {
	    this.add( new InventoryItem(item, 1) );
	    return 1;
	} else {
	    invItem.amount++;
	    return invItem.amount;
	}
    }

    /*    
    //Loops through inventory and prints items
    public void showInventory()
    {
        //print items in array
        for(int i=0;i<inventory.length;i++)
	    {
		//null is used for an empty spot
		if(inventory[i]==null)
		    {
			//+1 makes sure player choices matches up with menu player sees since array starts at 0
			System.out.println(i+1 + ": Empty Space");
		    }
		else
		    {
			//prints the item description if inventory space is full & stackSize+1 to offset index
			System.out.println(i+1 + ":" + inventory[i].itemDesc + "\t" + (inventory[i].stackSize+1));
		    }
	    }
    }
    
    //add item
    public void addItem(Item item)
    {
        //If the item is stackable
        if(item.stackable==true)
	    {
		//search for item in inventory already
		for(int i=0;i<inventory.length;i++)
		    {
			if(inventory[i]==item)
			    {
				//if current stackSize is less then maxStack size -- add 1 to current StackSize
				if(inventory[i].stackSize><inventory[i].maxStack)
				    {
					inventory[i].stackSize += 1;
					break;
				    }
			    }
		    }
	    }
        else
	    {
		//get next empty space
		int emptySpace = 30;
		
		for(int i=0;i<inventory.length;i++)
		    {
			if(inventory[i]==null)
			    {
				emptySpace = i;
				break;
			    }
		    }
		
		//add item to empty space
		if(emptySpace==30)
		    {
			System.out.println("There is no free space");
		    }
		else
		    {
			inventory[emptySpace] = item;
		    }
	    }
    }

    //remove item
    public void removeItem(int i)
    {
        inventory[i] = null;
    }
    */

}