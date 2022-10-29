package tapir;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import logica.Juego;

public class TestingSetup {
	public static void setup() {
		HashMap<Integer, String> mapObjectsToCallSequence = null; 
		HashMap<String, String> mapMethodsToSymbols = null; 
		Pattern regularExpression = null; 
		Matcher matcher = null;
		
		//Specification of the test class\
		TestingCore.mapClassToTestingInformation = new HashMap<>();
					
		// Testing setup for Account class
		//Definition of the methods and their corresponding symbols
		mapObjectsToCallSequence = new HashMap<>(); 
		mapMethodsToSymbols = new HashMap<String, String>();
		mapMethodsToSymbols.put("logica.Juego.<init>", "c");
		mapMethodsToSymbols.put("logica.Juego.moverJugador", "m");
		mapMethodsToSymbols.put("logica.Juego.generarDisparo", "d");
		mapMethodsToSymbols.put("logica.Juego.perderJuego", "p");
		mapMethodsToSymbols.put("logica.Juego.finalizarJuego", "g");
		mapMethodsToSymbols.put("logica.Juego.reiniciarJuego", "r");
		
		//Definition of the regular expression
		regularExpression = Pattern.compile("c((m|d)*(p|g)r)*");
		
		//Initializing the regular expressions controller
		matcher = regularExpression.matcher("");	
		
		// All information related to how the Account class is testing is store in a TestingInformation instance
		TestingInformation ti = new TestingInformation(Juego.class.toString(), mapObjectsToCallSequence, mapMethodsToSymbols, regularExpression, matcher, true);
		TestingCore.mapClassToTestingInformation.put(Juego.class.toString(), ti);		
	}	
}
