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
public class Punto5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double fah;
        double cel;
        
        System.out.println("Ingrese la temperatura en Fahrenheit:");
        fah = IngresarNumero(scan);
        
        cel = (fah-32)/1.8;
        
        System.out.println("La temperatura en celcius es: " + cel);
        
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
