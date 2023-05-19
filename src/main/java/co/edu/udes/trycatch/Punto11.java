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
public class Punto11 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n1;
        int n2;
        int distancia;
        
        System.out.print("Ingrese un numero entero: ");
        n1 = IngresarNumero(scan);
        
        System.out.print("Ingrese otro numero entero: ");
        n2 = IngresarNumero(scan);
        
        distancia = Math.abs(n1-n2);
        
        System.out.println("La distancia entre " + n1 + " y " + n2 + " es " + distancia);
        
    }
    
    public static int IngresarNumero(Scanner scan){
        int num = 0;
        
        try{
            num = scan.nextInt();
            scan.nextLine();
        }
        catch(Exception e){
            System.out.println("Hubo un error, vuelva a ingresar"); 
            System.exit(0);
        }
        
        return num;
    }
}
