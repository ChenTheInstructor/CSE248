import java.util.TreeSet;

public class APIDemo {

	public static void main(String[] args) {
//		TreeMap<String, Integer> theMap = new TreeMap<>();
//		theMap.put("M", 100);
//		theMap.put("G", 200);
//		theMap.put("Z", 50);
//		theMap.put("K", 300);
//		theMap.put("B", 600);
//		
//		System.out.println(theMap.get("Z"));
		
		TreeSet<String> theTree = new TreeSet<>();
		theTree.add("M");
		theTree.add("F");
		theTree.add("G");
		theTree.add("A");
		theTree.add("K");
		theTree.add("S");
		theTree.add("Y");
		theTree.add("N");
		theTree.add("F");
		
		for(String s : theTree) {
			System.out.println(s);
		}
		System.out.println(theTree.contains("K"));
	}

}
