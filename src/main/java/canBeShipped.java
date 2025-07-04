public class canBeShipped implements Shippable{
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
