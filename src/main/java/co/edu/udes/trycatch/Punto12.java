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
public class Punto12 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int x1;
        int x2;
        int y1;
        int y2;
        double distancia;
        
        System.out.print("Ingrese la coordenada en X del primer punto: ");
        x1 = IngresarNumero(scan);
        
        System.out.print("Ingrese la coordenada en Y del primer punto: ");
        y1 = IngresarNumero(scan);
        
        System.out.print("Ingrese la coordenada en X del segundo punto: ");
        x2 = IngresarNumero(scan);
        
        System.out.print("Ingrese la coordenada en Y del segundo punto: ");
        y2 = IngresarNumero(scan);
        
        distancia = Math.sqrt(Math.pow(Math.abs(x1-x2), 2)+Math.pow(Math.abs(y1-y2), 2));
        
        
        System.out.println("La distancia entre ambos puntos es de: " + distancia);
        
    }
    
    public static int IngresarNumero(Scanner scan){
        int num = 0;
        
        try{
            num = IngresarNumero(scan);
            scan.nextLine();
        }
        catch(Exception e){
            System.out.println("Hubo un error, vuelva a ingresar"); 
            System.exit(0);
        }
        
        return num;
    }
}
