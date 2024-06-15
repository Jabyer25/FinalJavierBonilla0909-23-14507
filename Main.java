import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("1. Mostrar el mayor de los tres numeros");
System.out.println("2. Tabla de multiplicar");
System.out.println("3. Determinar si es primo o no");

int opcion = scanner.nextInt();

Numeros numeros = new Numeros(0, 0, 0);

switch (opcion) {
    case 1:
        System.out.println("Ingrese tres números separados por espacios: ");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        numeros = new Numeros(num3, num4, num5);
        numeros.encontrarMayor();
        break;

    case 2:
        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int num8 = scanner.nextInt();
        numeros.mostrarTablaMultiplicar(num8);
        break;

    case 3:
        int numero = 0;
        System.out.println("Ingrese un numero entero");
        numero = scanner.nextInt();
        boolean primo = numeros.esPrimo(numero);
        System.out.println(primo);
        break;

}


        }
    }