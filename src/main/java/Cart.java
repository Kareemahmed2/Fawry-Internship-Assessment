import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> products=new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        if(!product.isQuantityEnough(quantity)) {
            System.out.println("Not enough quantity of " + product.getName() + " in stock.");
            return;
        };
        product.order(quantity);
        products.add(new CartItem(product, quantity));
    }
    public boolean isEmpty() {
        return products.isEmpty();
    }

    public List<CartItem> getProducts() {
        return products;
    }

    public void setProducts(List<CartItem> products) {
        this.products = products;
    }
    public double getSubTotal() {
        double total=0.0;
        for(CartItem product: products) {
            total+=product.getProduct().getPrice()*product.getQuantity();
        }
        return total;
    }
    public double getShippingCost() {
        return getTotalWeight()*30.0;
    }

    public double getTotalWeight() {
        double totalWeight=0.0;
        for(CartItem product: products) {
            totalWeight+=product.getProduct().getWeight()*product.getQuantity();
        }
        return totalWeight;
    }

    public List<ProductShippingAdapter> getProductsToBeShipped() {
        List<ProductShippingAdapter> ShippableDTOs=new ArrayList<>();
        for(CartItem item:products){
            if(item.getProduct().getShippable() instanceof canBeShipped){
                ProductShippingAdapter dto=new ProductShippingAdapter();
                dto.setName(item.getProduct().getName());
                dto.setWeight(item.getProduct().getWeight());
                dto.setQuantity(item.getQuantity());
                ShippableDTOs.add(dto);
            }
        }
        return ShippableDTOs;
    }
}
