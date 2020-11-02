import java.util.*;

public class Fase2App {

	public static void main(String[] args) {
		
		char[] nom = {'F','e','r','r','a','n'};
		
		List<Character> nomList = new ArrayList<>();
		for(char n:nom) {
			nomList.add(n);
		}
		
		List<Character> vocal = Arrays.asList('A','a','E','e','I','i','O','o','U','u');
		
		for(char i:nomList) {
			
			if(Character.isDigit(i)) {
				System.out.println(i + ": Els noms de persones no contenen números! ");
			} else if(vocal.contains(i)) {
				System.out.println(i + ": VOCAL");
			} else {
				System.out.println(i + ": CONSONANT");
			}
		}

	}

}
