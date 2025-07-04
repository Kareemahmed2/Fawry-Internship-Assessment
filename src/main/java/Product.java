public class Product {
    private String name;
    private double price;
    private int quantity;
    private Expirable expirable;
    private Shippable shippable;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getWeight() {
        return shippable.getWeight();
    }
    public boolean isExpired() {
        return expirable.isExpired();
    }

    public Expirable getExpirable() {
        return expirable;
    }

    public void setExpirable(Expirable expirable) {
        this.expirable = expirable;
    }

    public Shippable getShippable() {
        return shippable;
    }

    public void setShippable(Shippable shippable) {
        this.shippable = shippable;
    }
    public boolean isQuantityEnough(int quantity){
        return this.quantity >= quantity;
    }
    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
    }
    public void order(int quantity){
        this.quantity -= quantity;
    }
}
