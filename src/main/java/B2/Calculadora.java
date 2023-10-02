package B2;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        int numero1 = scanner.nextInt();//variable numerica para que guarde el primer valor

        System.out.println("Digite el segundo numero");
        int numero2 = scanner.nextInt();//variable numerica para que guarde el segundo valor

        System.out.println("");

        sumar(numero2 ,numero1);
        restar(numero2, numero1);
        multi(numero2, numero1);
        divi(numero2, numero1);
    }

    private static void divi(int numero2, int numero1) {
        System.out.println("la division es :"+(numero1 / numero2));

    }

    private static void multi(int numero2, int numero1) {
        System.out.println("la multiplicacion es :"+(numero1 * numero2));
    }

    private static void restar(int numero2, int numero1) {
        System.out.println("la resta es :"+(numero1 - numero2));
    }

    private static void sumar(int numero2, int numero1) {
        System.out.println("la suma es :"+(numero2 + numero1));
    }


}
