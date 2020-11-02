import java.util.*;

public class Fase3App {

	public static void main(String[] args) {
		
		List<Character> nomList = Arrays.asList('F','e','r','r','a','n');
		
		HashMap<Character, Integer> lletres_nom = new HashMap<Character, Integer>();

		for(char i:nomList) {
			if(lletres_nom.containsKey(i)) {
				lletres_nom.put(i, lletres_nom.get(i) + 1);
			}else {
				lletres_nom.put(i, 1);
			}
		}
		
		System.out.println(lletres_nom);		

	}

}
