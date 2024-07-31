/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratorpatternexample;

/**
 *
 * @author ADMIN
 */
public class DecoratorPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(emailNotifier);
        
        Notifier smsAndSlackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notification via Email
        emailNotifier.send("Hello via Email!");

        // Send notification via Email and SMS
        smsNotifier.send("Hello via Email and SMS!");

        // Send notification via Email and Slack
        slackNotifier.send("Hello via Email and Slack!");

        // Send notification via Email, SMS, and Slack
        smsAndSlackNotifier.send("Hello via Email, SMS, and Slack!");
    }
    
}
