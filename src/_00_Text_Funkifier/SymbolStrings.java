package _00_Text_Funkifier;

public class SymbolStrings extends SpecialString{

	public SymbolStrings(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.contains("e")) {
				s = s.replace('e', '3');
			} 
			if (s.contains("s")) {
				s = s.replace('s', '$');
			} 
			if (s.contains("a")) {
				s = s.replace('a', '@');
			}
		}
		
		return s;
		
	}
	 
	
}
