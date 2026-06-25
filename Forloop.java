package package1;

public class Forloop {
public static void main(String[] args) {
	
	for (int i = 1; i <= 2; i++) {
	    for (int j = 1; j <= 2; j++) {
	        if (j == 1) continue; // Skips inner loop print when j is 1
	        System.out.println(i + " " + j);

	    }
	}
}
}
