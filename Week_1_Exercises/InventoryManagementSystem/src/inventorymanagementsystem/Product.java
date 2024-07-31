/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventorymanagementsystem;

import java.util.*;
public class Product {

    private String productId;
    private String productName;
    private int quantity;
    private double price;
    
    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    public class Inventory {
        private Map<String, Product> inventory;

        public Inventory() {
            this.inventory = new HashMap<>();
        }

        public void addProduct(Product product) {
            inventory.put(product.getProductId(), product);
        }

        public void updateProduct(String productId, Product updatedProduct) {
            inventory.put(productId, updatedProduct);
        }

        public void deleteProduct(String productId) {
            inventory.remove(productId);
        }

        public Product getProduct(String productId) {
            return inventory.get(productId);
        }
    }
    
}

