/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package financialforecasting;
import java.util.*;

public class FinancialForecasting {

    // Method to calculate future value recursively
    public static double calculateFutureValue(double initialValue, double growthRate, int periods) {
        // Base case: If no periods left, return the initial value
        if (periods == 0) {
            return initialValue;
        }
        // Recursive case: Calculate the future value for one less period
        return (1 + growthRate) * calculateFutureValue(initialValue, growthRate, periods - 1);
    }
    // Iterative Optimaztion
    public static double calculateFutureValueIterative(double initialValue, double growthRate, int periods) {
        double futureValue = initialValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
    
    //Memoization Optimization
    public static double calculateFutureValueMemo(double initialValue, double growthRate, int periods, Map<Integer, Double> memo) {
        // Base case: If no periods left, return the initial value
        if (periods == 0) {
            return initialValue;
        }
        // Check if result is already in the memo
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }
        // Calculate the future value for one less period
        double futureValue = (1 + growthRate) * calculateFutureValueMemo(initialValue, growthRate, periods - 1, memo);
        // Store the result in the memo
        memo.put(periods, futureValue);
        return futureValue;
    }


    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment
        double growthRate = 0.05;     // 5% growth rate
        int periods = 10;             // Number of periods (years)

        double futureValue = calculateFutureValue(initialValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods: " + futureValue);
    }
}

