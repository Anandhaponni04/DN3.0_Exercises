/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpatternexample;

/**
 *
 * @author ADMIN
 */
public class ObserverPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("Mobile App");
        Observer webApp = new WebApp("Web App");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(100.00);
        stockMarket.setStockPrice(105.50);
        
        stockMarket.deregisterObserver(webApp);
        stockMarket.setStockPrice(98.75);
    }
    
}
