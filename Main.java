import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FOOD ORDERING SYSTEM =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        Customer customer = new Customer(name, phone);

        System.out.println("\n----- Food Menu -----");
        System.out.println("1. Burger - Rs.150");
        System.out.println("2. Pizza  - Rs.250");
        System.out.println("3. Biryani - Rs.200");

        System.out.print("Choose your food: ");
        int choice = sc.nextInt();

        FoodItem food;

        if (choice == 1) {
            food = new FoodItem(1, "Burger", 150);
        } 
        else if (choice == 2) {
            food = new FoodItem(2, "Pizza", 250);
        } 
        else if (choice == 3) {
            food = new FoodItem(3, "Biryani", 200);
        } 
        else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Order order = new Order(food, quantity);

        System.out.println("\nCustomer Name: " + customer.getName());
        System.out.println("Phone Number: " + customer.getPhone());

        order.displayOrder();

        sc.close();
    }
}