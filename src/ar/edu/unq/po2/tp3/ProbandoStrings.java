package ar.edu.unq.po2.tp3;

public class ProbandoStrings {

	public static String a = "abc";
	public static String s = a;
	public static String t;
	
    public static void main(String[] args) {
    	System.out.println(s.length());
    	//System.out.println(t.length()); // Tira error porque t es null.
    	System.out.println(1 + a);
    	System.out.println(a.toUpperCase());
    	System.out.println("Libertad".indexOf("r"));
    	System.out.println("Universidad".lastIndexOf('i'));
    	System.out.println("Quilmes".substring(2,4));
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	 
    }
}
