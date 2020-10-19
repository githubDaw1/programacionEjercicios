public class ejercicio10 {
	public static void main(String []args) {
		
		int x = 0;
		int y = 0;
		int base;
		int altura;
		String azul = "\33[34m";

		System.out.print ("Introducir base: ");
		base = Integer.parseInt (System.console().readLine());
		
		System.out.println ();
		System.out.print ("Introducir altura: ");
		altura = Integer.parseInt (System.console().readLine());
    System.out.println ();

		do {
      
      System.out.print (azul + "|");
      
			for (x = 0; x < base; x++) {
				
        System.out.print ("*");
        
				if (x == base - 1) {
          
          System.out.print ("|");
					System.out.println ();
					
				}
			}
      
      y++;

		} while (y < altura);
	}
}
