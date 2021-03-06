package si1.lab1;

import static org.junit.Assert.*;

import java.util.Scanner;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestNumber2Words {
	
	private Number2Words ntw;
	@Before
	public void before() throws Exception {
		ntw = new Number2Words();
	}

	@Test
	public void simplestCase() throws Exception {
		String teste = new String("0");
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("zero"));
		
		teste = "1";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("um"));
		
		teste = "2";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("dois"));
		
		teste = "3";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("três"));
		
		teste = "4";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("quatro"));
		
		teste = "5";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cinco"));
		
		teste = "6";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("seis"));
		
		teste = "7";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("sete"));
		
		teste = "8";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("oito"));
		
		teste = "9";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("nove"));
		
		teste = "10";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("dez"));
	}
	
	@Test
	public void oneWordNumber() throws Exception{
		String teste = new String("11");
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("onze"));
		
		teste = "12";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("doze"));
		
		teste = "13";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("treze"));
		
		teste = "14";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("catorze"));
		
		teste = "15";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("quinze"));
		
		teste = "16";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("dezesseis"));
		
		teste = "17";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("dezessete"));
		
		teste = "18";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("dezoito"));
		
		teste = "19";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("dezenove"));
		
		teste = "20";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("vinte"));
		
		teste = "30";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("trinta"));
		
		teste = "40";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("quarenta"));
		
		teste = "50";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cinquenta"));
		
		teste = "60";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("sessenta"));
		
		teste = "70";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("setenta"));
		
		teste = "80";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("oitenta"));
		
		teste = "90";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa"));
		
		teste = "100";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cem"));
		
		teste = "200";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("duzentos"));
		
		teste = "300";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("trezentos"));
		
		teste = "400";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("quatrocentos"));
		
		teste = "500";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("quinhentos"));
		
		teste = "600";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("seiscentos"));
		
		teste = "700";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("setecentos"));
		
		teste = "800";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("oitocentos"));
		
		teste = "900";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("novecentos"));
		
		teste = "1000";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil"));
	}
	
	@Test
	public void emptyString(){
		try{
			ntw.generateOutput();
			fail();
		}
		catch(Exception e){
			e.getMessage().equals("Numero não informado");
		}
	}
	
	@Test
	public void wrongInput(){
		String teste = new String("q");
		
		try{
			ntw.setInput(teste);
			fail();
		}
		catch(Exception e){
			e.getMessage().equals("Deve informar um número");
		}
	}
	
	@Test
	public void numberBetween21and99() throws Exception{
		String teste = new String("21");
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("vinte e um"));
		
		teste = "22";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("vinte e dois"));
		
		teste = "23";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("vinte e três"));
		
		teste = "29";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("vinte e nove"));
		
		teste = "34";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("trinta e quatro"));
		
		teste = "38";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("trinta e oito"));
		
		teste = "45";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("quarenta e cinco"));
		
		teste = "46";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("quarenta e seis"));
		
		teste = "51";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cinquenta e um"));
		
		teste = "59";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cinquenta e nove"));
		
		teste = "62";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("sessenta e dois"));
		
		teste = "68";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("sessenta e oito"));
		
		teste = "73";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("setenta e três"));
		
		teste = "77";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("setenta e sete"));
		
		teste = "84";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("oitenta e quatro"));
		
		teste = "86";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("oitenta e seis"));
		
		teste = "95";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa e cinco"));
		
		teste = "99";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa e nove"));
	}
	
	@Test
	public void numberBetween101and199() throws Exception{
		String teste = new String("101");
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cento e um"));
		
		teste = "111";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cento e onze"));
		
		teste = "121";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cento e vinte e um"));
		
		teste = "110";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cento e dez"));
		
		teste = "155";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cento e cinquenta e cinco"));
		
		teste = "190";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cento e noventa"));
		
		teste = "199";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cento e noventa e nove"));
	}
	
	@Test
	public void numberBetween201and999() throws Exception{
		String teste = new String("201");
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("duzentos e um"));
		
		teste = "350";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("trezentos e cinquenta"));
		
		teste = "449";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("quatrocentos e quarenta e nove"));
		
		teste = "518";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("quinhentos e dezoito"));
		
		teste = "669";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("seiscentos e sessenta e nove"));
		
		teste = "774";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("setecentos e setenta e quatro"));
		
		teste = "888";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("oitocentos e oitenta e oito"));
		
		teste = "999";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("novecentos e noventa e nove"));
	}
	
	@Test
	public void numberBetween1001and1099() throws Exception{
		String teste = new String("1001");
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil e um"));
		
		teste = "1011";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil e onze"));
		
		teste = "1021";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil e vinte e um"));
		
		teste = "1010";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil e dez"));
		
		teste = "1055";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil e cinquenta e cinco"));
		
		teste = "1090";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil e noventa"));
		
		teste = "1099";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil e noventa e nove"));
	}
	
	@Test
	public void numberBetween1101and1999() throws Exception{
		String teste = new String("1201");
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil duzentos e um"));
		
		teste = "1351";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil trezentos e cinquenta e um"));
		
		teste = "1449";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil quatrocentos e quarenta e nove"));
		
		teste = "1518";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil quinhentos e dezoito"));
		
		teste = "1600";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil e seiscentos"));
		
		teste = "1669";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil seiscentos e sessenta e nove"));
		
		teste = "1774";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil setecentos e setenta e quatro"));
		
		teste = "1888";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil oitocentos e oitenta e oito"));
		
		teste = "1999";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("mil novecentos e noventa e nove"));
	}
	
	
	@Test
	public void numberBetween2001and999999() throws Exception{
		String teste = new String("2201");
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("dois mil duzentos e um"));
		
		teste = "10351";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("dez mil trezentos e cinquenta e um"));
		
		teste = "11000";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("onze mil"));
		
		teste = "11449";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("onze mil quatrocentos e quarenta e nove"));
		
		teste = "55518";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cinquenta e cinco mil quinhentos e dezoito"));
		
		teste = "71669";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("setenta e um mil seiscentos e sessenta e nove"));
		
		teste = "81774";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("oitenta e um mil setecentos e setenta e quatro"));
		
		teste = "80000";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("oitenta mil"));
		
		teste = "91888";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa e um mil oitocentos e oitenta e oito"));
		
		teste = "99999";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa e nove mil novecentos e noventa e nove"));
		
		teste = "999999";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("novecentos e noventa e nove mil novecentos e noventa e nove"));
	}
	
	@Test
	public void numberBetween100000000and1000000000() throws Exception{
		String teste = new String("1000001");
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("um milhão e um"));
		
		teste = "1000000";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("um milhão"));
		
		teste = "156564987";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("cento e cinquenta e seis milhões quinhentos e sessenta e quatro mil novecentos e oitenta e sete"));
		
		teste = "2000000";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("dois milhões"));
		
		teste = "2000010";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("dois milhões e dez"));
		
		teste = "90000000";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa milhões"));
		
		teste = "90900000";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa milhões e novecentos mil"));
		
		teste = "90900101";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa milhões novecentos mil cento e um"));
		
		teste = "90901101";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa milhões novecentos e um mil cento e um"));
		
		teste = "90931101";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa milhões novecentos e trinta e um mil cento e um"));
		
		teste = "99931101";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa e nove milhões novecentos e trinta e um mil cento e um"));
		
		teste = "99999999";
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("noventa e nove milhões novecentos e noventa e nove mil novecentos e noventa e nove"));
	}
	
	@Test
	public void numberStartingWith0() throws Exception{
		String teste = new String("00001");
		ntw.setInput(teste);
		assertTrue(ntw.generateOutput().equals("um"));
	}
	
}
