import java.util.*;		//import the required packages

class FoodItem {
    int id;				// data members
    String name;
    double price;

    public FoodItem(int id, String name, double price) {	//constructor to initialize the values
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override		// overridden method to convert into string
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}

public class RestaurantManagementPROJECT{
    static List<FoodItem> menu = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n Restaurant Management System");
            System.out.println("1. Add Food Item");
            System.out.println("2. View Menu");
            System.out.println("3. Update Food Item");
            System.out.println("4. Delete Food Item");
            System.out.println("5. Search Food Item");
            System.out.println("6. Sort Menu by Price");
            System.out.println("7. Filter Items by Price Range");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addFoodItem();
                    break;
                case 2:
                    viewMenu();
                    break;
                case 3:
                    updateFoodItem();
                    break;
                case 4:
                    deleteFoodItem();
                    break;
                case 5:
                    searchFoodItem();
                    break;
                case 6:
                    sortMenuByPrice();
                    break;
                case 7:
                    filterItemsByPriceRange();
                    break;
                case 8:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Create (Add) Food Item
    public static void addFoodItem() {
        System.out.print("Enter Food ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Food Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Food Price: ");
        double price = scanner.nextDouble();

        menu.add(new FoodItem(id, name, price));
        System.out.println("Food item added successfully!");
    }

    // Read (View) Menu
    public static void viewMenu() {
        if (menu.isEmpty()) {
            System.out.println("❌ No food items available.");
        } else {
            System.out.println("\n Menu:");
            for (FoodItem item : menu) {
                System.out.println(item);
            }
        }
    }

    // Update Food Item
    public static void updateFoodItem() {
        System.out.print("Enter Food ID to update: ");
        int id = scanner.nextInt();
        for (FoodItem item : menu) {
            if (item.id == id) {
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new Name: ");
                item.name = scanner.nextLine();
                System.out.print("Enter new Price: ");
                item.price = scanner.nextDouble();
                System.out.println("Food item updated successfully!");
                return;
            }
        }
        System.out.println("Food item not found!");
    }

    // Delete Food Item
    public static void deleteFoodItem() {
        System.out.print("Enter Food ID to delete: ");
        int id = scanner.nextInt();
        Iterator<FoodItem> iterator = menu.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().id == id) {
                iterator.remove();
                System.out.println("Food item deleted successfully!");
                return;
            }
        }
        System.out.println("Food item not found!");
    }

    // Search Food Item by ID or Name
    public static void searchFoodItem() {
        System.out.print("Enter Food ID or Name to search: ");
        scanner.nextLine(); // Consume newline
        String input = scanner.nextLine();

        boolean found = false;
        for (FoodItem item : menu) {
            if (String.valueOf(item.id).equals(input) || item.name.equalsIgnoreCase(input)) {
                System.out.println("Found: " + item);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Food item not found!");
        }
    }

    // Sort Menu by Price
    public static void sortMenuByPrice() {
        if (menu.isEmpty()) {
            System.out.println("No food items available.");
            return;
        }

        menu.sort(Comparator.comparingDouble(item -> item.price));
        System.out.println("Menu sorted by price:");
        viewMenu();
    }

    // Filter Items by Price Range
    public static void filterItemsByPriceRange() {
        if (menu.isEmpty()) {
            System.out.println("No food items available.");
            return;
        }

        System.out.print("Enter minimum price: ");
        double minPrice = scanner.nextDouble();
        System.out.print("Enter maximum price: ");
        double maxPrice = scanner.nextDouble();

        boolean found = false;
        System.out.println("Food items in price range $" + minPrice + " - $" + maxPrice + ":");
        for (FoodItem item : menu) {
            if (item.price >= minPrice && item.price <= maxPrice) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found in this range.");
        }
    }
}
