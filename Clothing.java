public class Clothing extends Product {
    private String size;

    public Clothing(String productID, String name, double price, String size) {
        super(productID, name, price);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.printf("%s. %s | Size: %s | Price: %.2f | Discounted: %.2f%n",
                productID, name, size, price, calculateDiscountedPrice());
    }

    @Override
    public double calculateDiscountedPrice() {
        return price * 0.95; // 5% discount
    }
}
