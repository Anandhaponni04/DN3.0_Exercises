/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commandpatternexample;

/**
 *
 * @author ADMIN
 */
public class CommandPatternExample {
    public static void main(String[] args) {
        // Create receiver
        Light livingRoomLight = new Light();
        
        // Create commands
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        
        // Create invoker
        RemoteControl remote = new RemoteControl();
        
        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();
        
        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
