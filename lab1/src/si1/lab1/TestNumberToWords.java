package si1.lab1;

import static org.junit.Assert.*;

import java.util.Scanner;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestNumberToWords {
	
	private NumberToWords ntw;
	@Before
	public void before() throws Exception {
		ntw = new NumberToWords();
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

}
