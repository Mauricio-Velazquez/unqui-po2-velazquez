package ar.edu.unq.po2.tp9;

import java.util.List;

public class MismaLetraInicial {
    public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
        char letraInicial = page.getTitle().charAt(0);
        return wikipedia.stream().filter(wp -> wp.getTitle().charAt(0) == letraInicial).toList();
    }
}
