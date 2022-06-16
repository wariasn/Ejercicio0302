/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio_03_02;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_03_02 {

    public static void main(String[] args) {
        //var ventana = new VentanaCrearGrupo("CREAR GRUPO");
        //ventana.setVisible(true);
        /*int i = 10;
        do{
            
            System.out.println(i);
            i--;
        }while(i<=1);
        
        for(int n=2;n>=0;n--){
            System.out.println(n);
        
        }*/
        /*var read = new Scanner(System.in);
        var x=-1;
        while(x<0){
            System.out.println("Ingrese: ");
            x=read.nextInt();
        }*/
        
        /*var rea = new Scanner(System.in);
        var y="";
        
        do{
            System.out.println("Texto: ");
            y=rea.next();
        }while(!(y.equals("salir")));*/
        
        var w=5;
        var x=20;
        var y=0;
        
        do{
            y=y+1;
            w=w+3;
        }while(w<x);
        System.out.println(x);
    }
}
