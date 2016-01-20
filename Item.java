class Item {
    // the name of the item will be unique
    public String name;
    public String descrip;
    public int price;
    public boolean use_able;
    
    public Item(String name, String descrip, int price, boolean use_able) {
	this.name = name;
	this.descrip = descrip;
	this.price = price;
	this.use_able = use_able;
    }
}
