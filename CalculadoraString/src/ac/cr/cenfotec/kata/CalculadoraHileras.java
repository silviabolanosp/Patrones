package ac.cr.cenfotec.kata;

public class CalculadoraHileras {

	public int add(String string) throws Exception {
		if(string.isEmpty()) {
		return 0;
		}
		
		String[] numeros = string.split(",|\\:|\\;");
		
	
		if(numeros.length > 3) {
			throw new Exception("Too many parameters");
		}
		
		return sumarTodosLosValores(numeros);

	}
	
	public int addNParametros(String[] string) throws Exception {
		int total = 0;
		
		if(string.length == 0) {
		return 0;
		}
		
		for(String strings: string) {
		String[] numeros = strings.split(",|\\:|\\;");
		total = total + sumarTodosLosValores(numeros);
		}
		
		return total;

	}

	private int sumarTodosLosValores(String[] numeros) {
		int acumulador = 0;
		for(String numero: numeros) {
			acumulador += Integer.parseInt(numero);
		}
		return acumulador;
	}
}
