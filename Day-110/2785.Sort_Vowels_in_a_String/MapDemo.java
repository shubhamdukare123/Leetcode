import java.util.*;
class MapDemo {
	public static void main(String[] args) {
		HashMap<Character, Integer> lm = new HashMap<>(new Map('A', 0, 'E', 0, 'I', 0, 'O', 0, 'U', 0, 'a', 0, 'e', 0, 'i', 0, 'o', 0, 'u', 0));
		System.out.println(lm);
	}
}
