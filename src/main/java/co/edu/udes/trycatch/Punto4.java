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
public class Punto4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double n1;
        double n2;
        
        System.out.println("Ingrese un numero:");
        n1 = IngresarNumero(scan);
        
        System.out.println("Ingrese otro numero:");
        n2 = IngresarNumero(scan);
        
        System.out.println("La suma del los numeros es: " + (n1+n2));
        System.out.println("La resta del los numeros es: " + (n1-n2));
        System.out.println("La multiplicacion del los numeros es: " + (n1*n2));
        
        try{
        System.out.println("La division del los numeros es: " + (n1/n2));
        }
        catch(Exception e){
            System.out.println("No se puede dividir entre 0");
        }
        
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
