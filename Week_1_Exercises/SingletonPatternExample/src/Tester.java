/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Tester {
    public static void main(String[] args){
        Logger inst1=Logger.getInstance();
        Logger inst2=Logger.getInstance();
        if(inst1==inst2){
            System.out.println("both the instances are same");
        }else{
            System.out.println("both the instances are different");
        }
    }
}
