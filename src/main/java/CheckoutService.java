import java.util.ArrayList;
import java.util.List;

public class CheckoutService {
    public static void checkout(Customer customer) {
        Cart cart = customer.getCart();
        if(cart.isEmpty()){
            System.out.println("Cart is empty. Add items to the cart");
            return;
        }
        for(CartItem item: cart.getProducts()){
            if(item.getProduct().isExpired()){
                System.out.println(item.getProduct().getName() + " is expired it cannot be purchased.");
                return;
            }
        }
        if(customer.getBalance() < cart.getSubTotal()){
            System.out.println("You don't have enough balance to checkout.");
            return;
        }

        ShippingService.printShippmentDetails(cart.getProductsToBeShipped());

        System.out.println("** Checkout receipt **");
        double subtotal=customer.getCart().getSubTotal();
        double shipping=cart.getShippingCost();
        double total=subtotal+shipping;
        for(CartItem item : cart.getProducts()){
            System.out.println(item.getQuantity()+"x "+item.getProduct().getName()+"    "+item.getProduct().getPrice()*item.getQuantity());
        }
        System.out.println("----------------------");
        System.out.println("Subtotal    "+subtotal);
        System.out.println("Shipping    "+shipping);
        System.out.println("Amount       "+total);
    }
}
