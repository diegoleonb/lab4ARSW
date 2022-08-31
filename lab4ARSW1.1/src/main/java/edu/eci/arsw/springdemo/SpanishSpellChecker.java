package edu.eci.arsw.springdemo;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class SpanishSpellChecker implements SpellChecker {

	@Override
	public String checkSpell(String text) {
		return "revisando ("+text+") con el verificador de sintaxis del espanol";
                
                
	}

}
