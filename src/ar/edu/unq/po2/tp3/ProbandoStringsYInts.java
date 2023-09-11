package ar.edu.unq.po2.tp3;

public class ProbandoStringsYInts {

	public static String a = "abc";
	public static String s = a;
	public static String t;
	public static int numero;
	public static Integer otroNumero;
	
    public static void main(String[] args) {
    	System.out.println(s.length());
    	//System.out.println(t.length()); // Tira error porque el metodo quiere saber la longitud del string y t es null.
    	System.out.println(1 + a);
    	System.out.println(a.toUpperCase());
    	System.out.println("Libertad".indexOf("r"));
    	System.out.println("Universidad".lastIndexOf('i'));
    	System.out.println("Quilmes".substring(2,4));
    	System.out.println((a.length() + a).startsWith("a"));
    	System.out.println(s == a);
    	System.out.println(a.substring(1,3).equals("bc"));
    	System.out.println(numero); // Su valor predeterminado es 0. 
    	System.out.println(otroNumero); // Su valor predeterminado es null. 
    }
}
