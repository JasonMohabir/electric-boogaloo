public class Item {
    public boolean usable;                                                                                    
    public int count;      
    
    String name;


    Item(int count){
	this.count = count ;
	usable = true;
    }

    public String getName(){
	return name;
    }
	
    public int getCount(){
	return count;
    }

    public void setCount(int c){
	count = c;
    }

    public boolean getUsable(){
	return usable;
    }
    












}