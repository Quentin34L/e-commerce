package com.ecommerce;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private User user;
    private Map<Product, Integer> items;

   
    public Cart(User user) {
        this.user = user;
        this.items = new HashMap<>();
    }

  
    public void addProduct(Product product, int quantity) {
        if (quantity > 0) {
            items.put(product, items.getOrDefault(product, 0) + quantity);
            System.out.println(quantity + " " + product.getProductName() + " added to cart.");
        }
    }

    
    public void removeProduct(Product product) {
        if (items.containsKey(product)) {
            items.remove(product);
            System.out.println(product.getProductName() + " removed from cart.");
        }
    }


    public double calculateTotal() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
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
}
