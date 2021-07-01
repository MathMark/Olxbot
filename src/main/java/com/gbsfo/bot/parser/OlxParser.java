package com.gbsfo.bot.parser;

import com.gbsfo.bot.constant.OlxConstant;
import com.gbsfo.bot.model.ParsingSettings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

public class OlxParser implements Parser {

    private static final Logger logger = Logger.getLogger(OlxParser.class.getName());

    @Override
    public Set<String> retrieveLinks(String url, String cssQuery) {
        try {
            Document document = Jsoup.connect(url).get();
            Element body = document.body();
            Elements elements = body.select(cssQuery);
            Set<String> productLinks = new LinkedHashSet<>();
            elements.forEach(e -> productLinks.add(e.attr("href")));
            return productLinks;
        } catch (IOException e) {
            logger.severe(e.getMessage());
            return Collections.emptySet();
        }
    }

    @Override
    public Map<String, String> parsePage(String url, Map<String, ParsingSettings> fieldsAndQueries) {
        Map<String, String> result = new HashMap<>();
        try {
            Document document = Jsoup.connect(url).get();
            Element body = document.body();
            for (Map.Entry<String, ParsingSettings> entry : fieldsAndQueries.entrySet()) {
                ParsingSettings parsingSettings = entry.getValue();
                String cssQuery = parsingSettings.getCssQuery();
                String attribute = parsingSettings.getAttribute();
                Elements elements = body.select(cssQuery);
                if (attribute == null) {
                    result.put(entry.getKey(), elements.first().text());
                } else {
                   result.put(entry.getKey(), elements.attr(attribute));
                }
            }
            result.put(OlxConstant.PAGE_URL, url);
            return result;
        } catch (IOException e) {
            logger.severe(e.getMessage());
        }
        return result;
    }
}
