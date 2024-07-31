/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyinjectionexample;

/**
 *
 * @author ADMIN
 */
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // Implement logic to find customer by id
        // For simplicity, let's return a dummy customer
        return new Customer(id, "John Doe");
    }
}