import java.util.Scanner;

/**
 *
 * @author Johao Smith Urbina González
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = Integer.parseInt(teclado.nextLine());

        System.out.println("\nTabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
