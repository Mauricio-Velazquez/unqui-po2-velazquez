package ar.edu.unq.po2.tp9;

import java.util.List;

public class LinkEnComun {
    public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
        List<WikipediaPage> links = page.getLinks();
        return wikipedia.stream().filter(wp -> wp != page).filter(wp -> tienelinksEnComun(links, wp.getLinks())).toList();
    }

    private boolean tienelinksEnComun(List<WikipediaPage> links1, List<WikipediaPage> links2) {
        return links1.stream().anyMatch(links2::contains);
    }
}