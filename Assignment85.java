package package2;
import java.util.HashMap;
import java.util.Map;
public class Assignment85 {
	public static void main(String[] args) {
		Map<Integer,String>ID=new HashMap<Integer,String>();
		ID.put(31,"Ram");     ID.put(32,"sham");
		ID.put(33,"Rahim");   ID.put(34,"Ratan");
		System.out.println("1. EmpolyeeID and Name of empolyee: " +ID);
		ID.putIfAbsent(12, "bella");
		System.out.println("2. The IfAbsent value:" +ID);
		Map<Integer,String>ID2=new HashMap<Integer,String>();
		ID2.put(35,"Rehan");
		ID2.put(36,"suhani");
		ID.putAll(ID2);
		System.out.println("3. All -ID add with ID2:"+ID);
		ID.remove(33);
		System.out.println("4. Remove 3 index ID and name:"+ID);
		boolean a1=ID.containsKey(34);
		System.out.println("5. To see 34 no.ID and Ratan name is present:"+a1);
		boolean a2 =ID.containsValue("Ram");
		System.out.println("6. To see 31 no.ID and Ram name is present:"+a2);
		String name =ID.get(36);
		System.out.println("7. Print the 36 no. value:" +name);
		int IDsize= ID.size();
		System.out.println("8. Print the size of empolyee id and name:" +IDsize);
		System.out.println("9. Iterting keyset");
		for (Integer i1:ID.keySet()) {
			System.out.println(i1);}
		System.out.println("10. Iterting values");
		for (String s1:ID.values()) {
			System.out.println(s1);}
		System.out.println("11. Iterting entryset");
		for (Map.Entry<Integer,String> p1:ID.entrySet()) {
			System.out.println(p1);}
		ID.clear();
		System.out.println("12. After clear() map entry is:"+ID.isEmpty());
		
}
}