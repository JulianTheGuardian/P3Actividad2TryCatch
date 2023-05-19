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
public class Punto14 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String n;
        String reversa = "";
        
        System.out.print("Ingrese el numero a dar vuelta: ");
        n = IngresarNombre(scan);
        
        for (int i = n.length()-1; i >= 0; i--) {
            reversa = reversa + n.charAt(i);
        }
        
        System.out.println("El numero dado vuelta es: " + reversa);
        
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
