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
public class Punto8 {
    
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
        double sueldoBase;
        double venta1;
        double venta2;
        double venta3;
        double comision;
        
        System.out.print("Ingrese su sueldo base: ");
        sueldoBase = IngresarNumero(scan);
        
        System.out.print("Ingrese el precio de la venta 1: ");
        venta1 = IngresarNumero(scan);
        
        System.out.print("Ingrese el precio de la venta 2: ");
        venta2 = IngresarNumero(scan);
        
        System.out.print("Ingrese el precio de la venta 3: ");
        venta3 = IngresarNumero(scan);
        
        comision = (venta1+venta2+venta3)*0.1;
        
        System.out.println("El extra por comision es: " + comision);
        System.out.println("Sus ingresos este mes son: " + (sueldoBase+comision));
        
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
