public class ProductShippingAdapter implements ShipableItemDTO {
    private String name;
    private double weight;
    private int quantity;


    @Override
    public double getWeight() {
        return weight;
    }
    @Override
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
