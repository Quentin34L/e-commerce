public class Product {
 private String productName;
 private int productID;
 private double price;
 private int stockQuantity;

  
public Product(String productName, int productID, double price, int stockQuantity) {
    this.productName = productName;
    this.productID = productID;
    this.price = price;
    this.stockQuantity = stockQuantity;
}

public void updateStock(int quantity) {
    if (quantity > 0 && stockQuantity >= quantity) {
        stockQuantity -= quantity;
        System.out.println(quantity + " items sold. New stock: " + stockQuantity);
    } else {
        System.out.println("Not enough stock available.");
    }
}

public String getProductDetails() {
    return "Product ID: " + productID + "\n" +
            "Name: " + productName + "\n" +
            "Price: $" + price + "\n" +
            "Stock: " + stockQuantity;
}

public String getProductName() {
    return productName;
}

public void setProductName(String productName) {
    this.productName = productName;
}

public int getProductID() {
    return productID;
}

public void setProductID(int productID) {
    this.productID = productID;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public int getStockQuantity() {
    return stockQuantity;
}

public void setStockQuantity(int stockQuantity) {
    this.stockQuantity = stockQuantity;
}
}
