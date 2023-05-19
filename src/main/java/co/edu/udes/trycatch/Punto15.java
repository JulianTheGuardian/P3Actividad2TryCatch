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
public class Punto15 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double A;
        double B;
        
        System.out.print("Ingrese el valor de A: ");
        A = IngresarNumero(scan);
        
        System.out.print("Ingrese el valor de B: ");
        B = IngresarNumero(scan);
        
        A = A+B;
        B = A-B;
        A = A-B;
        
        System.out.println("El nuevo valor de A es: " + A);
        System.out.println("El nuevo valor de B es: " + B);
        
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
