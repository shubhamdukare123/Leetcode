import java.util.*;
class HashMapDemo {

	public static void main(String[] args) {

 	HashMap<Character, Integer> lHm = new LinkedHashMap<>();

        	lHm.put('A', 0);
        	lHm.put('E', 0);
        	lHm.put('I', 0);
        	lHm.put('O', 0);
        	lHm.put('U', 0);
        	lHm.put('a', 0);
        	lHm.put('e', 0);
       		lHm.put('i', 0);
        	lHm.put('o', 0);
        	lHm.put('u', 0);

		String s = "lEetcOde";
/*
        	for(int i=0; i<s.length(); i++) {
            		if(lHm.containsKey(s.charAt(i))) {
				System.out.println(s.charAt(i));
				System.out.println(lHm.get(s.charAt(i)));

                		lHm.put(s.charAt(i), lHm.get(s.charAt(i) + 1));
            	}
  
		}
		*/
		lHm.put('A', lHm.get('A' + 1));
		System.out.println(lHm);
	}
}

