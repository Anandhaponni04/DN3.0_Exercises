/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxypatternexample;

/**
 *
 * @author ADMIN
 */
public class ProxyPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from remote server
        image1.display();
        
        // Image will not be loaded from remote server (cached)
        image1.display();
        
        // Image will be loaded from remote server
        image2.display();
        
        // Image will not be loaded from remote server (cached)
        image2.display();
    }
    
}
