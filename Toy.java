public class Toy extends Product {
    private int ageLimit;

    public Toy(String productID, String name, double price, int ageLimit) {
        super(productID, name, price);
        this.ageLimit = ageLimit;
    }

    @Override
    public void displayDetails() {
        System.out.printf("%s. %s | Age: %d+ | Price: %.2f | Discounted: %.2f%n",
                productID, name, ageLimit, price, calculateDiscountedPrice());
    }

    @Override
    public double calculateDiscountedPrice() {
        return price * 0.92; // 8% discount
    }
}
