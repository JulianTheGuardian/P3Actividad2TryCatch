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
public class Punto10 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double parcial1;
        double parcial2;
        double parcial3;
        double examenFinal;
        double trabajoFinal;
        double promedioParciales;
        double calificacion;
    
        System.out.print("Ingrese la nota de su primer parcial: ");
        parcial1 = IngresarNumero(scan);
        
        System.out.print("Ingrese la nota de su segundo parcial: ");
        parcial2 = IngresarNumero(scan);
        
        System.out.print("Ingrese la nota de su tercer parcial: ");
        parcial3 = IngresarNumero(scan);
        
        promedioParciales = (parcial1 + parcial2 + parcial3) /3;
        
        System.out.print("Ingrese la nota de su examen final: ");
        examenFinal = IngresarNumero(scan);
        
        System.out.print("Ingrese la nota de su trabajo final: ");
        trabajoFinal = IngresarNumero(scan);
        
        calificacion = promedioParciales*0.55 + examenFinal*0.3 + trabajoFinal*0.15;
        
        System.out.println("Su calificacion final es " + calificacion);
        
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
