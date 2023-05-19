/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.trycatch;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Punto1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nombre = "";
        
        System.out.println("Ingrese su nombre: ");
        nombre = IngresarNombre(scan);
        
        System.out.println("Hola " + nombre);
        
    }
    
    public static String IngresarNombre(Scanner scan){
        String texto = "";
        
        try{
            texto = scan.nextLine();
        }
        catch(Exception e){
            System.out.println("Hubo un error, vuelva a ingresar"); 
            System.exit(0);
        }
        
        return texto;
    }
}
