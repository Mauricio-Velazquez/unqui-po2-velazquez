package ar.edu.unq.po2.tp9;

import java.util.List;
import java.util.Map;

public class Wikipedia implements WikipediaPage {
    private String title;
    private List<WikipediaPage> links;
    private Map<String, WikipediaPage> infobox;

    public Wikipedia(String title, List<WikipediaPage> links, Map<String, WikipediaPage> infobox) {
        this.title = title;
        this.links = links;
        this.infobox = infobox;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<WikipediaPage> getLinks() {
        return links;
    }

    @Override
    public Map<String, WikipediaPage> getInfobox() {
        return infobox;
    }
}
