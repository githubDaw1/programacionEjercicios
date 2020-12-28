import java.util.Scanner;

public class ejercicio11 {
  public static void main (String[] args) {

    int[] indices = new int [10];
    int[] numerosIntroducidos = new int [10];
    int[] numerosPrimos = new int [numerosIntroducidos.length];
    int[] numerosNoPrimos = new int [numerosIntroducidos.length];
    int longitudNumerosPrimos;
    int longitudNumerosNoPrimos;
    int n = 0;
    int p = 0;

    Scanner scanner = new Scanner (System.in);

    for (int i = 0; i < numerosIntroducidos.length; i++) {

      do {
        numerosIntroducidos[i] = scanner.nextInt ();
      } while (numerosIntroducidos[i] <= 0);

    }

    System.out.println ();
    System.out.println ("Array original: ");

    for (int i = 0; i < indices.length; i++) {
      System.out.print (i + " | ");
    }

    System.out.println ();

    for (int i = 0; i < numerosIntroducidos.length; i++) {
      System.out.print (numerosIntroducidos[i] + " | ");
    }

    System.out.println ();
    System.out.println ();

    for (int i = 0; i < numerosIntroducidos.length; i++) {

      if (numerosIntroducidos[i] > 3) {

        if (numerosIntroducidos[i]%2 == 0 || numerosIntroducidos[i]%3 == 0) {
          numerosNoPrimos[n] = numerosIntroducidos[i];
          n++;
        }

        else {
          numerosPrimos[p] = numerosIntroducidos[i];
          p++;
        }
      }

      else if (numerosIntroducidos[i] > 0) {
        numerosPrimos[p] = numerosIntroducidos[i];
        p++;
      }
    }

    longitudNumerosPrimos = p;
    longitudNumerosNoPrimos = n;

    System.out.println ("Array final: ");

    for (int i = 0; i < indices.length; i++) {
      System.out.print (i + " | ");
    }

    System.out.println ();

    for (p = 0; p < longitudNumerosPrimos; p++) {
      System.out.print (numerosPrimos[p] + " | ");
    }

    for (n = 0; n < longitudNumerosNoPrimos; n++) {
      System.out.print (numerosNoPrimos[n] + " | ");
    }
  }
}
