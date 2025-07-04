public class NonShippable implements Shippable {
    @Override
    public double getWeight() {
        return 0;
    }
}
