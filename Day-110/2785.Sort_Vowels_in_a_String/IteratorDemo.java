import java.util.*;
class ItrDemo {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);

		Iterator itr = lst.listIterator();

		System.out.println(itr.next());
		System.out.println(itr.get(0));
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		

	}
}
