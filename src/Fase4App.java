import java.util.*;

public class Fase4App {

	public static void main(String[] args) {
		
		List<Character> nomList = Arrays.asList('F','e','r','r','a','n');
		
		List<Character> cognomList = Arrays.asList('J','u','a','n','a','l','s');
		
		List<Character> nomcomplert = new ArrayList<>();
		nomcomplert.addAll(nomList);
		nomcomplert.add(' ');
		nomcomplert.addAll(cognomList);
		
		System.out.println(nomcomplert);

	}

}
