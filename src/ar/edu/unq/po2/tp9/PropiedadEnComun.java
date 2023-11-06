package ar.edu.unq.po2.tp9;

import java.util.List;
import java.util.Map;

public class PropiedadEnComun {
    public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
        Map<String, WikipediaPage> infobox = page.getInfobox();
        return wikipedia.stream().filter(wp -> wp != page).filter(wp -> tienePropiedadEnComun(infobox, wp.getInfobox())).toList();
    }

    private boolean tienePropiedadEnComun(Map<String, WikipediaPage> infobox1, Map<String, WikipediaPage> infobox2) {
        return infobox1.keySet().stream().anyMatch(infobox2::containsKey);
    }
}

