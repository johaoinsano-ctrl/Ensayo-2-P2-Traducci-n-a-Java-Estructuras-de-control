/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

/**
 *
 * @author Johao Smith Urbina González
 */
public class Main {

     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contrasenaCorrecta = "java2026";
        String contrasenaIngresada;

        do {
            System.out.print("Ingrese la contrasena: ");
            contrasenaIngresada = teclado.nextLine();

        } while (!contrasenaIngresada.equals(contrasenaCorrecta));

        System.out.println("Acceso concedido.");
    }
}
