/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpatternexample;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args){
        Computer com=new Computer.Builder()
                .setCpu("intel")
                .setRam("5GB")
                .setStorage("GoodStorage")
                .setProcessor("i5")
                .build();
        System.out.println(com.getCpu()+" "+com.getProcessor());
    }
}
