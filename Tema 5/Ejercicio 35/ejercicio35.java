import java.util.Scanner;

public class ejercicio35 {
  public static void main (String []args) {

    String caracter = "*";
    int espacios = 3;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introducir la altura de la letra X: ");
    int altura = scanner.nextInt();

    System.out.println ();

    for (int x = 0; x < altura; x++) {

      if (x < (altura / altura)) {

        System.out.print (caracter);

        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }

        System.out.print (caracter);

        System.out.println ();
        espacios -= 2;

      }

      if (x == (altura / altura)) {

        espacios = 1;

        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }

        System.out.print (caracter);

        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }

        System.out.print (caracter);

        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }

        System.out.println ();
        espacios -= 2;

      }

      if (x == (altura / 2)) {

        espacios = 2;

        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }

        System.out.print (caracter);

        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }

        System.out.println ();

      }

      if (x == (altura - 2)) {

        espacios = 1;

        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }

        System.out.print (caracter);

        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }

        System.out.print (caracter);

        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }

        System.out.println ();

      }

      if (x == (altura - 1)) {

        espacios = 3;

        System.out.print (caracter);

        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }

        System.out.print (caracter);

        System.out.println ();

      }
    }
  }
}
