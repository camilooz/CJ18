package B2;

import java.util.Scanner;

public class AreaCuadrado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el la medida de un lado del cuadrado en cm");
        double lado= scanner.nextDouble();

        System.out.println("");

        area(lado);
    }

    private static void area(double lado) {
        System.out.println("El area del cuadrado es "+lado*lado+" cm");

    }
}
