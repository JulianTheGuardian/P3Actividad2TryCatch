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
public class Punto13 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double n;
        
        System.out.println("Ingrese un numero: ");
        n = IngresarNumero(scan);
         
        System.out.println("La raiz cuadrada de " + n + " es: " + Math.sqrt(n));
        System.out.println("La raiz cubica de " + n + " es: " + Math.cbrt(n));
        
    }
    
    public static double IngresarNumero(Scanner scan){
        double num = 0;
        
        try{
            num = scan.nextDouble();
            scan.nextLine();
        }
        catch(Exception e){
            System.out.println("Hubo un error, vuelva a ingresar"); 
            System.exit(0);
        }
        
        return num;
    }
}
