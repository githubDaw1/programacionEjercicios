import java.util.Scanner;

public class ejercicio45 {
  public static void main (String[] args) {

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Introduzca la altura de la figura: ");
    int altura = scanner.nextInt();

    while (altura < 3) {
      altura = scanner.nextInt ();
    }

    String[][] filasFigura = (dibujaFigura (altura));

    for (int i = 0; i < altura; i++) {

      for (int j = 0; j < altura + 2; j++) {
        System.out.print (filasFigura[i][j]);
      }

      System.out.println();
    }
  }

  public static String[][] dibujaFigura (int altura) {

    int cantidadCaracteres1 = 0;
    int cantidadCaracteres2 = 0;
    String[][] linea = new String [altura][(2 * altura) + 2];
    String[][] fila = new String[altura][(2 * altura) + 2];
    int j;
    int cantidadEspacios;

    if (altura == 3) {

      cantidadEspacios = altura;

      for (int i = 0; i < altura; i++) {

        ++cantidadCaracteres1;
        ++cantidadCaracteres2;

        j = 0;

        for (int c1 = 0; c1 < cantidadCaracteres1; c1++) {
          linea[i][c1] = "*";
          fila[i][j] = linea[i][c1];
          j++;
        }

        for (int e = 0; e < cantidadEspacios; e++) {
          linea[i][e] = "-";
          fila[i][j] = linea[i][e];
          j++;
        }

        cantidadEspacios -= 2;

        for (int c2 = 0; c2 < cantidadCaracteres2; c2++) {
          linea[i][c2] = "*";
          fila[i][j] = linea[i][c2];
          j++;
        }
      }
    }

    else if (altura > 3) {

      cantidadEspacios = altura + 2;

      for (int i = 0; i < altura; i++) {

        ++cantidadCaracteres1;
        ++cantidadCaracteres2;

        j = 0;

        for (int c1 = 0; c1 < cantidadCaracteres1; c1++) {
          linea[i][c1] = "*";
          fila[i][j] = linea[i][c1];
          j++;
        }

        for (int e = 0; e < cantidadEspacios; e++) {
          linea[i][e] = "-";
          fila[i][j] = linea[i][e];
          j++;
        }

        cantidadEspacios -= 2;

        for (int c2 = 0; c2 < cantidadCaracteres2; c2++) {
          linea[i][c2] = "*";
          fila[i][j] = linea[i][c2];
          j++;
        }
      }
    }

    return fila;
  }
}
