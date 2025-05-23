package I3.Classes;

/**
 * Represents extra orders made by customers beyond room bookings.
 */
public class ExtraOrders {
    private int order_id;
    private int customer_id;
    private String dateTime;
    private int quantity;
    private Item item;

    // Getter and setter methods
    
    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    /**
     * Calculates total price for the order.
     * @return Total order amount
     */
    public int calculateTotal() {
        return item.getPrice() * quantity;
    }
}