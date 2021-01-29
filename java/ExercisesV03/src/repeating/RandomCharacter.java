package repeating;

public class RandomCharacter {
	
	// Generate a random charater between ch1 and ch2
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	// Generate a random lowercase letter
	public static char getRamdomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}
	
	// Generate a random upercase letter
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');		
	}
	
	// Generate a random digit character
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');				
	}
	
	// Generatea a random character
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}
