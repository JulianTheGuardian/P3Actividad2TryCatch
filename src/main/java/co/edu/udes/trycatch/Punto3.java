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
public class Punto3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
       String comprobar;
       double cateto1;
       double cateto2;
       double hipotenusa;
       
       System.out.println("Ingrese un cateto del triangulo:");
       cateto1 = IngresarNumero(scan);
       
       System.out.println("Ingrese el otro cateto del triangulo:");
       cateto2 = IngresarNumero(scan);
       
       hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
       hipotenusa = Math.sqrt(hipotenusa);
       
       System.out.println("La hipotenusa del triangulo es: " + hipotenusa);
        
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
