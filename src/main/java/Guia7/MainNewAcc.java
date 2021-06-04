/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Main de creacion de cuentas para juegos.
 */
package Guia7;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author luife
 */
public class MainNewAcc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellidos;
        Float edad;
        String pais;
        String email;
        String id_usuario;
        String password;
        // Lectura de Teclado:
        Scanner teclado = new Scanner(System.in);
        // Instrucciones en Consola:
        System.out.println("Bienvenido al creador de Cuentas de PlayBox X /n");
        System.out.println("Ingrese el nombre del usuario: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido del usuario: ");
        apellidos = teclado.nextLine();
        System.out.println("Ingrese la edad del usuario: ");
        edad = Float.parseFloat(teclado.nextLine());
        System.out.println("Ingrese el pais donde proviene el usuario: ");
        pais = teclado.nextLine();
        System.out.println("Ingrese el E-mail del usuario: ");
        email = teclado.nextLine();
        System.out.println("Ingrese su nombre para su ID: ");
        id_usuario = teclado.nextLine();
        System.out.println("Ingrese su contraseña: ");
        password = teclado.nextLine();
        //Contraseña Encriptada:
        String pass_hash;
        
        //Metodo para encriptar de Bcrypt - mindroot - dependencia agregada
        pass_hash = encriptar(password);
        
        NewAccGame registro;
        registro = new NewAccGame(nombre, apellidos, edad, pais, email, id_usuario, pass_hash);
        //Datos obtenidos del usuario:
        System.out.println("Los datos registrados son: ");
        System.out.println("Nombre: " + registro.getNombre());
        System.out.println("Apellidos: " + registro.getApellidos());
        System.out.println("Edad: " + registro.getEdad());
        System.out.println("Pais: " + registro.getPais());
        System.out.println("E-mail: " + registro.getEmail());
        System.out.println("ID: " + registro.getId_usuario());
        System.out.println("Contraseña: " + registro.getPassword());
        
        //Verificacion de contraseña:
        String password_check;
        System.out.println("Ingrese su contraseña para verificar usuario: ");
        password_check = teclado.nextLine();
        if (BCrypt.checkpw(password_check, registro.getPassword())){
            System.out.println("Su contraseña es correcta");
        }
        else{
            System.out.println("Su contraseña es incorrecta");
        }
    }
    public static String encriptar(String pass){
        return BCrypt.hashpw(pass,BCrypt.gensalt());
    }
    
}
