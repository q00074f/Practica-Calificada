/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.calificada;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJERCICIO8 {
    public static void main(String []args){
        Scanner Entrada = new Scanner(System.in);
        double p,l,k,c,s,e,d;
        System.out.println("Ingrese el precio de la plancha:");
        p=Entrada.nextDouble();
        System.out.println("Ingrese el precio de la licuadora:");
        l=Entrada.nextDouble();
        System.out.println("Ingrese el precio de la lavadora:");
        k=Entrada.nextDouble();
        System.out.println("Ingrese el precio de la cocina:");
        c=Entrada.nextDouble();
        s=p+l+k+c;
        System.out.println("El monto de los productos es:"+s);
        if (s>1200){
               e=s*17/100;
               d=s-e;
               System.out.println("El descuento es:"+e);
               System.out.println("El monto a pagar, junto al descuento es:"+d);
        }else{      
              System.out.println("No hay ningún descuento.");
              System.out.println("El monto a pagar, sin descuento descuento es:"+s);
        }
    }
}
