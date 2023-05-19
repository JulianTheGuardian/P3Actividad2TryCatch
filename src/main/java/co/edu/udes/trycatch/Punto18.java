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
public class Punto18 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String name1;
        String name2;
        String ape1;
        String ape2;
        
        System.out.print("Ingrese su primer nombre: ");
        name1 = IngresarNombre(scan);
        
        System.out.print("Ingrese su segundo nombre: ");
        name2 = IngresarNombre(scan);
        
        System.out.print("Ingrese su primer apellido: ");
        ape1 = IngresarNombre(scan);
        
        System.out.print("Ingrese su segundo apellido: ");
        ape2 = IngresarNombre(scan);
        
        System.out.println("Sus siglas son: " + name1.toUpperCase().charAt(0) + name2.toUpperCase().charAt(0) + ape1.toUpperCase().charAt(0) + ape2.toUpperCase().charAt(0));
        
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
