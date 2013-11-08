package si1.lab1;

import java.util.HashMap;

public class Number2Words {

	private String input;
	private HashMap<String, String> map;


	public Number2Words() throws Exception {
		setInput(""); //should work
		map = new HashMap<>();
		populateMap();

	}
	
	public Number2Words(String input) throws Exception {
		setInput(input);
		map = new HashMap<>();
		populateMap();

	}

	private void populateMap(){
		map.put("0", "zero");
		map.put("1", "um");
		map.put("2", "dois");
		map.put("3", "três");
		map.put("4", "quatro");
		map.put("5", "cinco");
		map.put("6", "seis");
		map.put("7", "sete");
		map.put("8", "oito");
		map.put("9", "nove");
		map.put("10", "dez");

		map.put("11", "onze");
		map.put("12", "doze");
		map.put("13", "treze");
		map.put("14", "catorze");
		map.put("15", "quinze");
		map.put("16", "dezesseis");
		map.put("17", "dezessete");
		map.put("18", "dezoito");
		map.put("19", "dezenove");
		map.put("20", "vinte");
		map.put("30", "trinta");
		map.put("40", "quarenta");
		map.put("50", "cinquenta");
		map.put("60", "sessenta");
		map.put("70", "setenta");
		map.put("80", "oitenta");
		map.put("90", "noventa");
		map.put("100", "cem");
		map.put("200", "duzentos");
		map.put("300", "trezentos");
		map.put("400", "quatrocentos");
		map.put("500", "quinhentos");
		map.put("600", "seiscentos");
		map.put("700", "setecentos");
		map.put("800", "oitocentos");
		map.put("900", "novecentos");
		map.put("1000", "mil");
		
		map.put("1000000000", "um bilhão");

	}

	public void setInput(String teste) throws Exception {

		if(!teste.equals("")){
			try{
				Integer.parseInt(teste);
				this.input = teste;
			}
			catch(Exception e){
				throw new Exception("Deve informar um número");
			}
		}

		else this.input = teste;

	}

	public String generateOutput() throws Exception {

		removeLeftZeros();
		
		if(input.equals("")){
			throw new Exception("Numero não informado");
		}
		
		


		else if(map.containsKey(getInput())){
			return map.get(getInput());
		}
		else{
			String result = "";

			if(this.input.length() == 2){
				result += map.get(input.substring(input.length() - 2, input.length() - 1) + "0") + " e " + map.get(input.substring(1, input.length()));
			}

			else if(this.input.length() == 3){
				if(input.charAt(0) == '1'){
					result += "cento e ";
				}
				else{
					result += map.get(input.substring(input.length() - 3, input.length() - 2) + "00") + " e ";
				}
				setInput(input.substring(input.length() - 2, input.length()));
				removeLeftZeros();
				result += generateOutput();
			}

			else if (this.input.length() >= 4 && this.input.length() <= 6){

				String milhar = input.substring(0, input.length() - 3);
				String aux = input.substring(input.length() - 3, input.length());
				
				setInput(milhar);

				if(!milhar.equals("1")){
					result += generateOutput() + " mil";
				}

				else{
					result += "mil";
				}



				setInput(aux);
				removeLeftZeros();

				if(!input.equals("0")){
					if(input.length() < 3 || map.containsKey(input)) {
						result += " e";
					}


					result += " " + generateOutput();
				}

			}
			
			else if (this.input.length() > 6){
				
				String milhao = input.substring(0, input.length() -6);
				String aux = input.substring(input.length() - 6, input.length());
				
				setInput(milhao);
				
				if(!milhao.equals("1")){
					result += generateOutput() + " milhões";
				}
				
				else{
					result += "um milhão";
				}
				
				setInput(aux);
				removeLeftZeros();
				
				if(!input.equals("0")){
					if(isLast(input) ) {
						result += " e";
					}


					result += " " + generateOutput();
				}
				
			}
			return result;

		}
	}

	private void removeLeftZeros() throws Exception {
		while(input.startsWith("0") && input.length() > 1){
			setInput(input.replaceFirst("0", ""));

		}
	}
	
	private boolean isLast(String s) throws Exception {
		s = s.substring(1);
		for(int i = 0; i< s.length(); i++){
			if(s.charAt(i) != '0'){
				return false;
			}
		}
		return true;
	}

	private Object getInput() {
		return this.input;
	}

}
