public class ejercicio4 {
  public static void main (String []args ){
  
    double cantidadeneuros;

    System.out.print("Introducir una cantidad en euros: ");
    cantidadeneuros = Integer.parseInt (System.console().readLine());
  
    double total;
    total = (cantidadeneuros * 166.386);
    
    System.out.println ();
    System.out.println ("Euros introducidos: " + cantidadeneuros);
    System.out.println ("Pesetas: " + total);
  }
}
