import java.util.Scanner;

public class ejercicio12 {
  public static void main (String []args) {

    int i;
    int contador;
    int numero;
    int resultado;

    Scanner scanner = new Scanner (System.in);

    System.out.print ("Cantidad de numeros: ");
    int cantidad = scanner.nextInt();

    System.out.println ();

    for (i = 0; i < cantidad; i++) {

      if ((i >= 0) && (i < 2)) {
        resultado = i;
        System.out.print (resultado + ", ");
      }

      numero = 1;
      contador = 0;

      while ((i >= 2) && (i <= 4)) {

        resultado = numero + contador;

        contador++;

        System.out.print (resultado + ", ");
        i++;

      }

      numero = 3;
      contador = 2;

      while ((i > 4) && (i < cantidad)) {

        resultado = numero + contador;
        System.out.print (resultado + ", ");
        contador = numero;
        numero = resultado;

        i++;
      }
    }
  }
}
