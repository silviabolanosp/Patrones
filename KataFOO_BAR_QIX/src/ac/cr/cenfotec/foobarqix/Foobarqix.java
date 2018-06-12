package ac.cr.cenfotec.foobarqix;

public class Foobarqix {

	public String enteroAString(int entero) {
		
		String string = Integer.toString(entero);

		return string;
	}
	
	public String metodoFBQ (int entero) {
		String string = "";
		
		if(entero % 3 == 0) {
			string += "FOO";
		}
		
		if(entero % 5 == 0) {
			string += "BAR";
		}
		
		if(entero % 7 == 0) {
			string += "QIX";
		}
		
		return string;
	}
}
