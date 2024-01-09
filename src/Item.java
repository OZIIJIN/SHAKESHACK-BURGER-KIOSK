public class Item extends Menu{
    Double price;
    public Item (String name, Double price, String discription){
        super(name, discription);
        this.price = price;
    }
}
