import java.util.Scanner;

public class ejercicio7 {
  public static void main (String[] args) {

    int numerosAleatorios[] = new int [100];

    Scanner scanner = new Scanner (System.in);

    System.out.println ("Introducir 100 numeros aleatorios: ");

    for (int i = 0; i < numerosAleatorios.length; i++) {
      numerosAleatorios[i] = (int)(Math.random () * 21);
      System.out.print (numerosAleatorios[i] + ", ");
    }

    System.out.println ();
    System.out.println ();

    System.out.print ("Pedir valor 1: ");
    int valor1 = scanner.nextInt ();

    System.out.print ("Pedir valor 2: ");
    int valor2 = scanner.nextInt ();

    System.out.println ();

    for (int i = 0; i < numerosAleatorios.length; i++) {

      if (numerosAleatorios[i] == valor1) {

        numerosAleatorios[i] = valor2;
        System.out.print ("'" + numerosAleatorios[i] + "'" + ", ");

      } else {
        System.out.print (numerosAleatorios[i] + ", ");
      }
    }
  }
}