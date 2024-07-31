/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjectionexample;

/**
 *
 * @author ADMIN
 */
public class Customer {
    private String name;
    private int customerId;

    /**
     * @return the name
     */
    public Customer(int id,String name){
        customerId=id;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cusomerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * @param cusomerId the cusomerId to set
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
