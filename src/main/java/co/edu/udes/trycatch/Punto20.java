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
public class Punto20 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int euro2;
        int euro1;
        int cent50;
        int cent20;
        int cent10;
        int totalEu;
        int totalCent;
        
        
        System.out.print("Ingrese cuantas monedas de 2€ tiene: ");
        euro2 = IngresarNumero(scan);
        
        System.out.print("Ingrese cuantas monedas de 1€ tiene: ");
        euro1 = IngresarNumero(scan);

        System.out.print("Ingrese cuantas monedas de 50 centimos tiene: ");
        cent50 = IngresarNumero(scan);
        
        System.out.print("Ingrese cuantas monedas de 20 centimos tiene: ");
        cent20 = IngresarNumero(scan);
        
        System.out.print("Ingrese cuantas monedas de 10 centimos tiene: ");
        cent10 = IngresarNumero(scan);
        
        totalCent = cent50*50 + cent20*20 + cent10*10;
        totalEu = euro2*2 + euro1 + totalCent/100;
        totalCent = totalCent%100;
        
        System.out.println("En total usted tiene " + totalEu + " euros con " + totalCent + " centimos");
        
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
