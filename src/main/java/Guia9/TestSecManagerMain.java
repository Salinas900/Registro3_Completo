/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9;

/**
 *
 * @author luife
 */
public class TestSecManagerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
        
        System.setProperty("java.policy", "file:/C:/Users/luife/Downloads/java.policy");
        SecurityManagerTest sm = new SecurityManagerTest();
        System.setSecurityManager(sm);
        sm.checkPackageAccess("Guia9");
        System.out.println("¡Acceso concedido!");
    }
    
}