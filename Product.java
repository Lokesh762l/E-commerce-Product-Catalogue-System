public abstract class Product {
    protected String productID;
    protected String name;
    protected double price;

    public Product(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public abstract void displayDetails();
    public abstract double calculateDiscountedPrice();
}
