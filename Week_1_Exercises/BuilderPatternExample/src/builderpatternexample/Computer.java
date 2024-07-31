/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpatternexample;

/**
 *
 * @author ADMIN
 */
public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String processor;
    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.storage=builder.ram;
        this.processor=builder.processor;
    }
    static class Builder{
        private String cpu;
        private String ram;
        private String storage;
        private String processor;
        Builder setCpu(String cpu){
            this.cpu=cpu;
            return this;
        }
        Builder setRam(String ram){
            this.ram=ram;
            return this;
        }
        Builder setStorage(String storage){
            this.storage=storage;
            return this;
        }
        Builder setProcessor(String processor){
            this.processor=processor;
            return this;
        }
        Computer build(){
            return new Computer(this);
        }
    }

    /**
     * @return the cpu
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * @return the ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * @return the storage
     */
    public String getStorage() {
        return storage;
    }

    /**
     * @return the processor
     */
    public String getProcessor() {
        return processor;
    }
    
}
