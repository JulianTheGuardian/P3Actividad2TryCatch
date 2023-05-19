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
public class Punto9 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double precioCompra;
        double descuento;

        System.out.print("Ingrese el precio total de su compra: ");
        precioCompra = IngresarNumero(scan);
        
        descuento = precioCompra * 0.15;
        
        System.out.println("Usted debe de pagar un total de " + (precioCompra-descuento));
        
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
