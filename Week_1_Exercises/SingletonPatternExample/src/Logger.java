/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Logger {
        private static Logger instance;
        private Logger(){
            
        }
    public static Logger getInstance(){
        if(instance==null){
            synchronized(Logger.class){
                if(instance==null){
                    instance=new Logger();
                }
            }
        }
        return instance;
    }
}

