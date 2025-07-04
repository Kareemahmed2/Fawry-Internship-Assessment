import java.util.List;

public class ShippingService {
    public static void printShippmentDetails(List<ProductShippingAdapter> productsToBeShipped) {
        System.out.println("** Shipment notice **");
        for (ProductShippingAdapter item : productsToBeShipped) {
                System.out.println(item.getQuantity()+"x "+ item.getName()+"    "+item.getWeight()+"g");
        }
        double totalWeight=productsToBeShipped.stream().mapToDouble(ProductShippingAdapter::getWeight).sum();
        System.out.println("Total package weight "+ totalWeight+"g");
        System.out.println("----------------------");
    }
}