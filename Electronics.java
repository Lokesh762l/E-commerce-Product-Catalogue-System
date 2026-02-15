public class Electronics extends Product {
    private int warranty;

    public Electronics(String productID, String name, double price, int warranty) {
        super(productID, name, price);
        this.warranty = warranty;
    }

    @Override
    public void displayDetails() {
        System.out.printf("%s. %s | Warranty: %d months | Price: %.2f | Discounted: %.2f%n",
                productID, name, warranty, price, calculateDiscountedPrice());
    }

    @Override
    public double calculateDiscountedPrice() {
        return price * 0.90; // 10% discount
    }
}
