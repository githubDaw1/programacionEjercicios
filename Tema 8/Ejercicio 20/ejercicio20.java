import java.util.Scanner;

public class ejercicio20 {
  public static void main (String[] args) {

    int n;
    int minimo = 0;
    int maximo = 10;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Cuantos numeros quieres introducir: ");
    n = scanner.nextInt ();

    devuelveNumerosAleatorios (n, minimo, maximo);
  }

  public static void devuelveNumerosAleatorios (int n, int minimo, int maximo) {

    int[] numerosIntroducidos = new int [n];

    for (int i = 0; i < n; i++) {
      numerosIntroducidos[i] = (int)(Math.random () * maximo);
      System.out.print(numerosIntroducidos[i] + " | ");
    }
  }
}
