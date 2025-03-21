import java.util.Map;

public class Order {
    private int orderID;
    private User user;
    private Map<Product, Integer> items;
    private String status;

    //
    public Order(int orderID, User user, Map<Product, Integer> items) {
        this.orderID = orderID;
        this.user = user;
        this.items = items;
        this.status = "Pending"; 
    }

    public void placeOrder() {
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            entry.getKey().updateStock(entry.getValue());
        }
        this.status = "Confirmed";
        System.out.println("Order " + orderID + " has been placed successfully.");
    }

    
    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Order " + orderID + " status updated to " + newStatus);
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void setItems(Map<Product, Integer> items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
