public class Inventory {

    int useableSlots, slots = 50;


    Inventory(){
	Itemslot[] itemSlot = new Itemslot[slots];
    }


    void addItem(Item item, int count){

        int stacks;

        for (int i = 0; i < useableSlots && count != 0; i++){
            if (itemSlot[i].stack.size() > 0){
                if (itemSlot[i].stack.get(0) == item) {
                    if(itemSlot[i].stack.size() < item.stackLimit){

                        int n = itemSlot[i].stack.size();

                        for(; n < item.stackLimit && count > 0; count--, n++) {
                            itemSlot[i].stack.add(item);
                        }
                    }
                }
            }
            if (i == (useableSlots - 1) && count > 0){
                for(int n = 0; n < useableSlots && count != 0; n++){

                    stacks = ((count - (count % item.stackLimit)) / item.stackLimit);

                    if(itemSlot[n].occupied == false){
                        if(stacks == 0){
                            for(int j = 0; j < count; j++){
                                itemSlot[n].stack.add(item);
                                itemSlot[n].occupied = true;
                            }
                            count = 0;
                        }
                        else {
                            for(int j = 0; j < item.stackLimit; j++){
                                itemSlot[n].stack.add(item);
                            }
                            count -= item.stackLimit;
                            itemSlot[n].occupied = true;
                        }
                    }
                    if (n == (useableSlots - 1)){
                        println("You don't have any room in your inventory");
                    }
                }
            }
        }
    }

}