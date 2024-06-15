import java.util.Scanner;

public class Numeros {
    private int numero1, numero2, numero3;

    public Numeros(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void encontrarMayor() {
        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        System.out.println("El mayor de los tres números es: " + mayor);
    }
    public void mostrarTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public void Calculadora(int numero1) {
        System.out.println("multiplicacion");
        int opcion = 0;
        switch (opcion){
            case 1:
                System.out.println("numero 1");
            break;

        }
    }

    public boolean esPrimo(int numero){
        boolean esPrimo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }


}




