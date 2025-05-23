package I3.Classes;

/**
 * Represents a food item in the hotel's menu.
 */
public class Food {
    private int food_id;
    private String name;
    private int price;

    // Getter and setter methods
    
    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}