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
public class Punto19 {
    
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
        int preguntas;
        int correctas;
        int incorrectas;
        int vacias;
        int puntos;
        int puntosMax;
        int nota;
        int notaMax;
        
        System.out.print("Ingrese la nota maxima que colocan en su institucion: ");
        notaMax = IngresarNumero(scan);
        
        System.out.print("Ingrese el numero total de preguntas: ");
        preguntas = IngresarNumero(scan);
        
        puntosMax= preguntas*5;
        
        System.out.print("Ingrese el numero de respuestas correctas: ");
        correctas = IngresarNumero(scan);
        
        System.out.print("Ingrese el numero de respuestas incorrectas: ");
        incorrectas = IngresarNumero(scan);
        
        System.out.print("Ingrese el numero de preguntas sin responder: ");
        vacias = IngresarNumero(scan);
        
        if(preguntas == correctas+incorrectas+vacias){
            puntos = correctas*5-incorrectas;
            nota = (puntos/puntosMax)*notaMax;
            System.out.println("Su nota final es : " + nota);
        }
        else{
            System.out.println("La cantidad de preguntas ingresada no concuerda con los datos entregados.");
            System.out.println("Reintente en otro momento");
        }
        
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
