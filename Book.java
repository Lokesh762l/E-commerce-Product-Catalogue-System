public class Book extends Product {
    private String author;

    public Book(String productID, String name, double price, String author) {
        super(productID, name, price);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.printf("%s. %s | Author: %s | Price: %.2f | Discounted: %.2f%n",
                productID, name, author, price, calculateDiscountedPrice());
    }

    @Override
    public double calculateDiscountedPrice() {
        return price * 0.85; // 15% discount
    }
}
