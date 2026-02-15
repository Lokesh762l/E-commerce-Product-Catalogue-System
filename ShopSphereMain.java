import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ShopSphereMain {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<CartItem> cart = new ArrayList<>();

    static final String CUSTOMER_NAME = "Lokesh";
    static final String CUSTOMER_ADDRESS = "Kautilya hostel, NIT Patna, Bihta";
    static final double GST_PERCENT = 18.0;

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====== SHOPSPHERE CATALOG ======");
            System.out.println("1. Books");
            System.out.println("2. Electronics");
            System.out.println("3. Clothing");
            System.out.println("4. Toys");
            System.out.println("5. Groceries");
            System.out.println("6. View Cart");
            System.out.println("7. Checkout");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = safeInt();

            switch (choice) {
                case 1 -> showBooks();
                case 2 -> showElectronics();
                case 3 -> showClothing();
                case 4 -> showToys();
                case 5 -> showGroceries();
                case 6 -> viewCart();
                case 7 -> checkout();
                case 8 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    /* ------------------- Category Functions ------------------- */

    private static void showBooks() {
        Product[] arr = {
                new Book("1", "Atomic Habits", 499, "James Clear"),
                new Book("2", "Harry Potter", 799, "J.K. Rowling"),
                new Book("3", "The Alchemist", 399, "Paulo Coelho")
        };
        process(arr);
    }

    private static void showElectronics() {
        Product[] arr = {
                new Electronics("1", "Smartphone", 15000, 24),
                new Electronics("2", "Laptop", 52000, 12),
                new Electronics("3", "Headphones", 1999, 6)
        };
        process(arr);
    }

    private static void showClothing() {
        Product[] arr = {
                new Clothing("1", "T-Shirt", 799, "L"),
                new Clothing("2", "Jeans", 1299, "32"),
                new Clothing("3", "Jacket", 2499, "XL")
        };
        process(arr);
    }

    private static void showToys() {
        Product[] arr = {
                new Toy("1", "Remote Car", 999, 5),
                new Toy("2", "Lego Blocks", 1999, 6),
                new Toy("3", "Teddy Bear", 599, 3)
        };
        process(arr);
    }

    private static void showGroceries() {
        Product[] arr = {
                new Grocery("1", "Rice 5kg", 1500, 5),
                new Grocery("2", "Wheat Flour 5kg", 1200, 5),
                new Grocery("3", "Sugar 2kg", 450, 2)
        };
        process(arr);
    }

    /* ------------------- Generic Product Processing ------------------- */

    private static void process(Product[] p) {
        System.out.println("\n--- PRODUCTS ---");
        for (Product prod : p) prod.displayDetails();

        System.out.print("Enter product number to add (0 to go back): ");
        int choice = safeInt();
        if (choice == 0) return;
        if (choice < 1 || choice > p.length) return;

        System.out.print("Enter Quantity: ");
        int qty = safeInt();

        Product sel = p[choice - 1];

        boolean found = false;
        for (CartItem item : cart) {
            if (item.product.name.equals(sel.name)) {
                item.quantity += qty;
                found = true;
                break;
            }
        }
        if (!found) cart.add(new CartItem(sel, qty));

        System.out.println("Added!");
    }

    /* ------------------- Cart Functions ------------------- */

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart empty!");
            return;
        }

        int idx = 1;
        for (CartItem c : cart) {
            System.out.printf("%d. %s | Qty: %d | Unit: %.2f%n",
                    idx++, c.product.name, c.quantity, c.product.calculateDiscountedPrice());
        }

        System.out.println("\n1. Remove Item");
        System.out.println("2. Update Quantity");
        System.out.println("3. Back");
        int op = safeInt();

        if (op == 1) removeItem();
        else if (op == 2) updateQty();
    }

    private static void removeItem() {
        System.out.print("Enter item number: ");
        int i = safeInt();
        if (i >= 1 && i <= cart.size()) {
            cart.remove(i - 1);
            System.out.println("Removed!");
        }
    }

    private static void updateQty() {
        System.out.print("Enter item number: ");
        int i = safeInt();
        if (i >= 1 && i <= cart.size()) {
            System.out.print("Enter new quantity: ");
            int q = safeInt();
            cart.get(i - 1).quantity = q;
        }
    }

    /* ------------------- Checkout & Billing ------------------- */

    private static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Add items first!");
            return;
        }

        double subtotal = 0;
        for (CartItem i : cart)
            subtotal += i.quantity * i.product.calculateDiscountedPrice();

        System.out.print("Enter extra discount %: ");
        double d = safeDouble();

        double disAmt = subtotal * d / 100;
        double afterDis = subtotal - disAmt;
        double gst = afterDis * GST_PERCENT / 100;
        double total = afterDis + gst;

        System.out.println("\nSubtotal: " + subtotal);
        System.out.println("Discount: -" + disAmt);
        System.out.println("GST: +" + gst);
        System.out.println("Total: " + total);

        System.out.print("Confirm order (y/n): ");
        if (!sc.next().equalsIgnoreCase("y")) return;

        printInvoice(subtotal, d, disAmt, gst, total);
        System.exit(0);
    }

    private static void printInvoice(double subtotal, double disPer, double disAmt, double gst, double total) {

        LocalDate today = LocalDate.now();
        LocalDate delivery = today.plusDays(5);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        System.out.println("\n================= INVOICE =================");
        System.out.println("Customer: " + CUSTOMER_NAME);
        System.out.println("Address : " + CUSTOMER_ADDRESS);
        System.out.println("-------------------------------------------");

        int i = 1;
        for (CartItem c : cart) {
            System.out.printf("%d. %s | Qty: %d | Unit: %.2f | Line: %.2f%n",
                    i++, c.product.name, c.quantity,
                    c.product.calculateDiscountedPrice(),
                    c.quantity * c.product.calculateDiscountedPrice());
        }

        System.out.println("-------------------------------------------");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount (" + disPer + "%): -" + disAmt);
        System.out.println("GST (18%): +" + gst);
        System.out.println("TOTAL: " + total);
        System.out.println("-------------------------------------------");
        System.out.println("Order Date: " + today.format(df));
        System.out.println("Expected Delivery: " + delivery.format(df));
        System.out.println("Order Status: Shipped");
        System.out.println("===========================================");
    }

    /* ------------------- Safe Input ------------------- */

    private static int safeInt() {
        while (!sc.hasNextInt()) { sc.next(); }
        return sc.nextInt();
    }

    private static double safeDouble() {
        while (!sc.hasNextDouble()) { sc.next(); }
        return sc.nextDouble();
    }
}
