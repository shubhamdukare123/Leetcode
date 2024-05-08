import java.util.*;

class ListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();

		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');

		al.remove(new Character('a'));

		System.out.println(al);

	}
}
