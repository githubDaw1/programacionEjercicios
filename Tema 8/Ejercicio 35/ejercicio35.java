import java.util.Scanner;
import Ejercicio35.ejercicio35;

public class ejercicio35 {
  public static void main (String[] args) {

    int numeroDigitos = 1;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir un numero: ");
    int numeroIntroducido = scanner.nextInt ();

    int cantidadDigitos = contarDigitos (numeroIntroducido, numeroDigitos);
    String numeroEnPalotes = convierteEnPalotes(numeroIntroducido, cantidadDigitos);
    System.out.print (numeroEnPalotes);
  }

  public static String convierteEnPalotes (int numeroIntroducido, int cantidadDigitos) {

    int digito;
    String digitoResultante = "";
    String numero = String.valueOf (numeroIntroducido);

    for (int i = 0; i < cantidadDigitos; i++) {

      String caracter  = Character.toString (numero.charAt(i));
      digito = Integer.parseInt (caracter);

      for (int j = 0; j < digito + 1; j++) {

        if (j < digito) {
          System.out.print ("*");
        }

        else {

          if (i < cantidadDigitos) {

            if (i == cantidadDigitos - 1 && digito == 0) {
              System.out.print("0 ");
            }

            else if (i == cantidadDigitos - 1 && digito != 0) {
            }

            if (i < cantidadDigitos - 1 && digito == 0) {
              System.out.print("0 ");
            }

            if (i < cantidadDigitos - 1 && digito != 0) {
              System.out.print("| ");
            }
          }
        }
      }

      System.out.print ("");
    }

    return digitoResultante;
  }

  public static int contarDigitos (int numeroIntroducido, int numeroDigitos) {

    do {

      if (numeroIntroducido >= 10000) {
        ++numeroDigitos;
        numeroIntroducido = numeroIntroducido / 10;
      }

      else if (numeroIntroducido >= 1000 && numeroIntroducido < 10000) {
        ++numeroDigitos;
        numeroIntroducido = numeroIntroducido / 10;
      }

      else if (numeroIntroducido >= 100 && numeroIntroducido < 1000) {
        ++numeroDigitos;
        numeroIntroducido = numeroIntroducido / 10;
      }

      else if (numeroIntroducido >= 10 && numeroIntroducido < 100) {
        ++numeroDigitos;
        numeroIntroducido = numeroIntroducido / 10;
      }

      else if (numeroIntroducido < 10) {
        ++numeroDigitos;
      }

    } while (numeroIntroducido > 10);

    return numeroDigitos;
  }
}
