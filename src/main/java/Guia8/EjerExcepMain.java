/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luife
 */
public class EjerExcepMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        boolean continua;
        do{
            try{
                continua = false;
                System.out.print("Ingrse un valor: ");
                num = teclado.nextInt();
                int par = num % 2;
                if (par==1){
                    System.out.println("Numero es impar");
                }else
                {
                    System.out.print("El numero es usted ingrseo "+ num + " es par." );
                }
                
            }catch(InputMismatchException ex){
                System.out.println("Debe ingresar por obligacion un numero.");
                teclado.next();
                continua = true;
            }
        }while (continua);
  
    }
    
}
    

