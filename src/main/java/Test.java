import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Product cheese = new Product();
        cheese.setName("Cheese");
        cheese.setPrice(100);
        cheese.setQuantity(10);
        Expires cheeseExpiry = new Expires();
        cheeseExpiry.setExpirationDate(LocalDate.now().plusDays(5));
        cheese.setExpirable(cheeseExpiry);
        canBeShipped cheeseShipping = new canBeShipped();
        cheeseShipping.setWeight(10);
        cheese.setShippable(cheeseShipping);


        Product biscuits = new Product();
        biscuits.setName("Biscuits");
        biscuits.setPrice(150);
        biscuits.setQuantity(5);
        Expires biscuitsExpiry = new Expires();
        biscuitsExpiry.setExpirationDate(LocalDate.now().plusDays(2));
        biscuits.setExpirable(biscuitsExpiry);
        canBeShipped biscuitShipping = new canBeShipped();
        biscuitShipping.setWeight(10);
        biscuits.setShippable(biscuitShipping);

        Product scratchCard = new Product();
        scratchCard.setName("Scratch Card");
        scratchCard.setPrice(20.0);
        scratchCard.setQuantity(100);
        scratchCard.setExpirable(new NonExpirable());
        scratchCard.setShippable(new NonShippable());
        Cart cart = new Cart();
        cart.addProduct(cheese, 2);
        cart.addProduct(biscuits, 1);
        cart.addProduct(scratchCard, 1);

        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setCart(cart);

        CheckoutService.checkout(customer);
    }
}