public class ejercicio5 {
  public static void main (String []args) {

    // PRO -> programación (Rojo)
    // BBDD -> base de datos (Azul)
    // LM -> lengauje de marcas (Amarillo)
    // SINF -> sistemas informátios (Naranja)
    // ED -> Entorno de desarrollo (Violeta)
    // FOL (Verde)
    
    String rojo = "\033[31m";
    String azul = "\033[34m";
    String amarillo = "\033[33m";
    String naranja = "\33[38;5;202m";
    String violeta = "\033[35m";
    String verde = "\033[32m";

    System.out.println ("------------------------------------------");
    System.out.println ("|Lunes\t|Martes\t|Miercoles|Jueves|Viernes|");
    System.out.println ("------------------------------------------");
    System.out.println (rojo + "|" + "PRO\t" + "|" + naranja + "SINF\t" + "|" + rojo + "PRO\t" + "|" + rojo + "PRO\t" + "|" + naranja + "SINF\t" + "|");
    System.out.println ("------------------------------------------");
    System.out.println (rojo + "|" + "PRO\t" + "|" + naranja + "SINF\t" + "|" + rojo + "PRO\t" + "|" + rojo + "PRO\t" + "|" + naranja + "SINF\t" + "|");
    System.out.println ("------------------------------------------");
    System.out.println (azul + "|" + "BBDD\t" + "|" + naranja + "SINF\t" + "|" + azul + "BBDD\t" + "|" + rojo + "PRO\t" + "|" + naranja + "SINF\t" + "|");
    System.out.println ("------------------------------------------");
    System.out.println (azul + "|" + "BBDD\t" + "|" + rojo + "PRO\t" + "|" + violeta + "ED\t" + "|" + azul + "BBDD\t" + "|" + verde + "FOL\t" + "|");
    System.out.println ("------------------------------------------");
    System.out.println (amarillo + "|" + "LM\t" + "|" + amarillo + "LM\t" + "|" + violeta + "ED\t" + "|" + azul + "BBDD\t" + "|" + verde + "FOL\t" + "|");
    System.out.println ("------------------------------------------");
    System.out.println (amarillo + "|" + "LM\t" + "|" + amarillo + "LM\t" + "|" + violeta + "ED\t" + "|" + azul + "BBDD\t" + "|" + verde + "FOL\t" + "|");
    System.out.println ("------------------------------------------");
  }
}
