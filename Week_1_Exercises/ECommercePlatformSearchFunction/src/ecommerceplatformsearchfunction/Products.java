/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommerceplatformsearchfunction;

import java.util.*;

public class Products {
    private String productId;
    private String productName;
    private String category;

    public Products(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
    public class LinearSearch {
        public static Products linearSearch(Products[] products, String productId) {
            for (Products product : products) {
                if (product.getProductId().equals(productId)) {
                    return product;
                }
            }
            return null;
        }
    }
    public class BinarySearch {
        public static Products binarySearch(Products[] products, String productId) {
            int left = 0;
            int right = products.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int comparison = products[mid].getProductId().compareTo(productId);

                if (comparison == 0) {
                    return products[mid];
                } else if (comparison < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return null;
        }
    }
    public static void main(String[] args){
        Products[] products= {
            new Products("1", "Laptop", "Electronics"),
            new Products("2", "Smartphone", "Electronics"),
            new Products("3", "Table", "Furniture")
        };
        Products result = LinearSearch.linearSearch(products, "2");
        if (result != null) {
            System.out.println("Product found in LinearSearch: " + result);
        } else {
            System.out.println("Product not found in LinearSearch.");
        }
        Arrays.sort(products, (a, b) -> a.getProductId().compareTo(b.getProductId()));

        result = BinarySearch.binarySearch(products, "2");
        if (result != null) {
            System.out.println("Product found in BinarySearch: " + result);
        } else {
            System.out.println("Product not found in BinarySearch.");
        }
    }

}

