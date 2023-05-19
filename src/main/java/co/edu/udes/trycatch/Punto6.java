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
public class Punto6 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double n1;
        double n2;
        double n3;
        double media;
        
        System.out.println("Ingrese el primer numero: ");
        n1 = IngresarNumero(scan);
        
        System.out.println("Ingrese el segundo numero: ");
        n2 = IngresarNumero(scan);
        
        System.out.println("Ingrese el tercer numero: ");
        n3 = IngresarNumero(scan);
        
        media = (n1 + n2 + n3)/3;
        
        System.out.println("La media de los 3 numeros es: " + media);
        
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
