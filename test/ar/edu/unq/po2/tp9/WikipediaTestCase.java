package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WikipediaTestCase {
	private MismaLetraInicial letra;
	private LinkEnComun link;
	private PropiedadEnComun comun;
	private Wikipedia wiki1;
	private Wikipedia wiki2;
	private Wikipedia wiki3;
	private Wikipedia wiki4;
	private List<WikipediaPage> links;

	//Setup
	@BeforeEach
	void setUp() throws Exception {
	    List<WikipediaPage> links3 = new ArrayList<WikipediaPage>();
	    Map<String, WikipediaPage> map3 = new HashMap<String, WikipediaPage>();
	    Map<String, WikipediaPage> map4 = new HashMap<String, WikipediaPage>();
        links = new ArrayList<WikipediaPage>();
		wiki1 = new Wikipedia("La Plata", links, new HashMap<String, WikipediaPage>());
		wiki2 = new Wikipedia("Lucas Art", new ArrayList<WikipediaPage>(), new HashMap<String, WikipediaPage>());
		wiki3 = new Wikipedia("Buenos Aires", links3, map3);
		wiki4 = new Wikipedia("Gimnasia y Esgrima La Plata", links3, map4);
	    links3.add(wiki1);
        links.add(wiki2);
        links.add(wiki3);
        links.add(wiki4);
        map3.put("birth_place", wiki4);
        map4.put("birth_place", wiki1);
		letra = new MismaLetraInicial();
		link = new LinkEnComun();
		comun = new PropiedadEnComun();
	}
	
	//Exercise
	@Test
	void testVerificarMismaLetraInicial() {
	    List<WikipediaPage> resultado = letra.getSimilarPages(wiki1, links);
	    // Verify
	    assertTrue(resultado.contains(wiki2));
	}
	
	@Test
	void testVerificarLinkEnComun() {
	    List<WikipediaPage> resultado = link.getSimilarPages(wiki3, links);
	    // Verify
	    assertTrue(resultado.contains(wiki4));
	}
	
	@Test
	void testVerificarPropiedadEnComun() {
	    List<WikipediaPage> resultado = comun.getSimilarPages(wiki4, links);
	    // Verify
	    assertTrue(resultado.contains(wiki3));
	}
	
}
