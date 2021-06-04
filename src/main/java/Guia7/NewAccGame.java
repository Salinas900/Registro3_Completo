/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Creacion de Cuentas para juego
 */
package Guia7;

/**
 *
 * @author luife
 * 
 */
public class NewAccGame {
    private String nombre;
    private String apellidos;
    private float edad;
    private String pais;
    private String email;
    private String id_usuario;
    private String password;

 public NewAccGame (String nombre, String apellidos, float edad, String pais, String email, String id_usuario, String password){
     this.nombre = nombre;
     this.apellidos = apellidos;
     this.edad = edad;
     this.pais = pais;
     this.email = email;
     this.id_usuario = id_usuario;
     this.password = password;
 }
 public String getNombre(){
     return nombre;
 }
 
 public void setNombre(String nombre){
     this.nombre = nombre;
}
 
 public String getApellidos(){
     return apellidos;
 }
 
 public void setApellidos(String apellidos){
     this.apellidos = apellidos;
 }
 
 public float getEdad(){
     return edad;
 }
 
 public void setEdad(float edad){
     this.edad = edad;
 }
 
 public String getPais(){
     return pais;
 }
 
 public void setPais (String pais){
     this.pais = pais;
 }
 
 public String getEmail(){
     return email;
 }
 
 public void setEmail(String email){
     this.email = email;
 }
 
 public String getId_usuario(){
     return id_usuario;
 }
 
 public void setId_usuario(String id_usuario){
     this.id_usuario = id_usuario;
 }
 
 public String getPassword(){
     return password;
 }
 
 public void setPassword(String password){
     this.password = password;
 }
}
