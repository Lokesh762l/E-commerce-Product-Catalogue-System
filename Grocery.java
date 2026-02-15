public class Grocery extends Product {
    private double weight;

    public Grocery(String productID, String name, double price, double weight) {
        super(productID, name, price);
        this.weight = weight;
    }

    @Override
    public void displayDetails() {
        System.out.printf("%s. %s | Weight: %.2fkg | Price: %.2f | Discounted: %.2f%n",
                productID, name, weight, price, calculateDiscountedPrice());
    }

    @Override
    public double calculateDiscountedPrice() {
        return price * 0.93; // 7% discount
    }
}
