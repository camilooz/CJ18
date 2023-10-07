package B2;

import java.util.Scanner;

public class TrabajoEnClase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la cantidad de dolares a convertir");
        int valor = scanner.nextInt();

        conver(valor,4386);

    }

    private static void conver(int valor, int i) {
        System.out.println("es valor es: $ "+(valor*i));
    }
}
