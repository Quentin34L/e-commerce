package com.ecommerce;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private String password;
    private List<Order> orderHistory;


    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.orderHistory = new ArrayList<>();
    }

    public User register() {
        System.out.println("Utilisateur " + username + " enregistré avec succès");
        return this;
    }

   
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Connexion réussie pour " + username);
            return true;
        } else {
            System.out.println("Échec de la connexion. Vérifier vos identifiants");
            return false;
        }
    }

    public void viewOrderHistory() {
        if (orderHistory.isEmpty()) {
            System.out.println("Aucune commande passée pour " + username);
        } else {
            System.out.println("Historique des commandes pour " + username + ":");
            for (Order order : orderHistory) {
                System.out.println(order);
            }
        }
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }
}
