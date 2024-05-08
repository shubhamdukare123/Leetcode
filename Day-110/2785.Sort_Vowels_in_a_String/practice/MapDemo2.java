import java.util.*;

class MapDemo {
	public static void main(String[] args) {
		HashMap<Character, Integer> hm = new  LinkedHashMap<>();
		hm.put('A', 1);
		System.out.println(hm.get('A'));
	}
}
