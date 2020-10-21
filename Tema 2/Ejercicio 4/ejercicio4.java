public class ejercicio4 {
  public static void main (String []args ){
  
    double cantidadeneuros;

    System.out.print ("Introducir una cantidad en euros: ");
    cantidadEnEuros = Integer.parseInt (System.console().readLine());
  
    double total;
    total = (cantidadEnEuros * 166.386);
    
    System.out.println ();
    System.out.println ("Euros introducidos: " + cantidadEnEuros);
    System.out.println ("Pesetas: " + total);
  }
}
