/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpatternexample;

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class FactoryMethodPatternExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String type=sc.next();
        new DocumentFactory().createDocument(type);
    }
}
