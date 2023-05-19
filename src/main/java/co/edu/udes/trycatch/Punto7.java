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
public class Punto7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double min;
        double hora;
        
        System.out.println("Ingrese la cantidad de minutos a convertir: ");
        min = IngresarNumero(scan);
        
        hora = min/60;
        min = min%60;
        
        System.out.println("Esos minutos equivalen a " + hora + " horas con " + min + " minutos.");
        
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
