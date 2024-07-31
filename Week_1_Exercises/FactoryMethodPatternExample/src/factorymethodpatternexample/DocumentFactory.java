/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpatternexample;

/**
 *
 * @author ADMIN
 */
public class DocumentFactory {
    public void createDocument(String type){
        if(type.equalsIgnoreCase("pdf")){
            new PdfClass().write();
        }
        else if(type.equalsIgnoreCase("excel")){
            new ExcelClass().write();
        }else{
            new WordClass().write();
        }
    }
}
