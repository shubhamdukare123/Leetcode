import java.util.*;

class HashSetDemo{
	public static void main(String[] args) {
	//	HashSet<Character> hs = new HashSet<Character>();
		Set s = Set.of('1', '2', '3', '4');
		System.out.println(s);
		System.out.println(s.contains('1'));
	}
}
