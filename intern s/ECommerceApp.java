import java.util.Scanner;

public class ECommerceApp {
    public static void main(String[] args) {
        Store store = new Store();
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Welcome to Mini E-Commerce System ====");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    store.displayProducts();
                    break;
                case 2:
                    store.displayProducts();
                    System.out.print("Enter Product ID to add: ");
                    int id = sc.nextInt();
                    Product p = store.getProductById(id);
                    if (p != null) {
                        System.out.print("Enter quantity: ");
                        int qty = sc.nextInt();
                        cart.addProduct(p, qty);
                        System.out.println("Added to cart!");
                    } else {
                        System.out.println("Invalid Product ID.");
                    }
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    cart.checkout();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
