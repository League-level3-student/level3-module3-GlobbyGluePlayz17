package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String newstring = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (i%2 != 0) {
				char care = Character.toUpperCase(s.charAt(i));
				newstring = newstring.substring(0) + care;
			} else {
				char care = Character.toLowerCase(s.charAt(i));
				newstring = newstring.substring(0) + care;
			}
		}
		return newstring;
	}

}
