public class Order {

    private int quantity;
    private FoodItem food;

    public Order(FoodItem food, int quantity) {
        this.food = food;
        this.quantity = quantity;
    }

    public double getTotal() {
        return food.getPrice() * quantity;
    }

    public void displayOrder() {
        System.out.println("\n----- Order Details -----");
        System.out.println("Food     : " + food.getName());
        System.out.println("Price    : " + food.getPrice());
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + getTotal());
    }
}