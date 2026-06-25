package package2;

public class Assignment50 {
	public static void main(String[] args) {
	String str1 = "I am learning Java";
    String str2 = "I am learning Sellenium";
    String str3 = "i Am Learning java";
    System.out.println("Length of string 1 is: " + str1.length());
    System.out.println("Concat: "+str1.concat(" !"));
    System.out.println("Equal: "+str1.equals(str2));
    System.out.println("Contain: " +str1.contains("Java"));
    System.out.println("Equal ignore case: " + str1.equalsIgnoreCase(str3));
    System.out.println("substring: "+str1.substring(5));
    System.out.println("substring: "+str1.substring(5,9));
    String a = "   Rekha";
    System.out.println("Trim: " +a.trim());
    System.out.println("Char at: "+str2.charAt(6));
    System.out.println("Index of word: " +str2.indexOf("learning"));
}
}