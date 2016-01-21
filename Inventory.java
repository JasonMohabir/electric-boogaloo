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
    
}
