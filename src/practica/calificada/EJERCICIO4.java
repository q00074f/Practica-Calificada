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
public class EJERCICIO4 {
    public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);
    int mayor = 0; int menor = 0;
    int[] numeros = new int[11];
    for (int i = 0+1; i < 11; i++) {
    System.out.print("Ingrese el número " + (i) + " a evaluar :"); numeros[i] =
    dato.nextInt();
                                    }
    for (int i = 1; i < numeros.length; i++) {
    if (mayor < numeros[i]) {
    mayor = numeros[i];
    } } menor = mayor;
    for (int i = 1; i < numeros.length; i++) {
    if (menor > numeros[i]) {
    menor = numeros[i];
            } 
        }
    }
}
