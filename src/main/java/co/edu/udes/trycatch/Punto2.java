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
public class Punto2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String comprobar = "";
        double base;
        double altura;
        double perimetro;
        double area;
        
        System.out.println("Ingrese la base del rectagulo:");
        base = IngresarNumero(scan);
        
        System.out.println("Ingrese la altura del rectagulo:");
        altura = IngresarNumero(scan);
        
        area = base*altura;
        
        perimetro = base*2+altura*2;
        
        System.out.println("La área del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
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
