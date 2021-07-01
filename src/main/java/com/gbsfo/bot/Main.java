package com.gbsfo.bot;

import com.gbsfo.bot.constant.OlxSelectors;
import com.gbsfo.bot.model.OlxProduct;
import com.gbsfo.bot.parser.OlxParser;
import com.gbsfo.bot.parser.Parser;
import com.gbsfo.bot.service.OlxProductService;
import java.util.List;

public class Main {

    public static void main(String... args) throws InterruptedException {
        String url = "https://www.olx.ua/elektronika/telefony-i-aksesuary/odessa/q-Playstation-5/";

        Parser parser = new OlxParser();
        OlxProductService service = new OlxProductService(parser);
        
        List<OlxProduct> result = service.parseProducts(url, OlxSelectors.getSettings());
    }
}
