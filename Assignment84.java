package package2;
import java.util.HashMap;
import java.util.Map;
public class Assignment84 {
public static void main(String[] args) {
	Map<Integer,String>b1=new HashMap<Integer,String>();
    b1.put(20, "A");
    b1.put(30, "B");
    b1.put(40, "C");
    b1.put(30, "D");
    System.out.println("Print the b1 map(Integer,string) vlaue:"+b1);
   Map<String,Double>c1=new HashMap<String,Double>();
    c1.put ("Aakash",20.3);
    c1.put("Bella",12.34);
    c1.put("Chinu",60.2);
    c1.put("Dada",42.5);
    System.out.println("Print the c1 map(string,,Double) vlaue:"+c1);
    Map<Integer,Character>d1=new HashMap<Integer,Character>();
    d1.put(1,'D');
    d1.put(2,'E');
    d1.put(3,'F');
    d1.put(4,'G');
    System.out.println("Print the d1 map(Integer,Character) vlaue:"+d1);
    Map<String,Boolean>f1=new HashMap<String,Boolean>();
    f1.put ("Aakash",true);
    f1.put("Bella",false);
    f1.put("Chinu",true);
    f1.put("Dada",true);
    System.out.println("Print the f1 map(string,Boolean) vlaue:"+f1);
    
}
}
