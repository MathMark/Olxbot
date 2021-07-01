package com.gbsfo.bot.service;

import com.gbsfo.bot.constant.OlxConstant;
import com.gbsfo.bot.converter.Converter;
import com.gbsfo.bot.model.OlxProduct;
import com.gbsfo.bot.model.ParsingSettings;
import com.gbsfo.bot.parser.Parser;

import java.util.*;

public class OlxProductService {
    
    private final Parser parser;
    
    public OlxProductService(Parser parser) {
        this.parser = parser;
    }
    
    
    public List<OlxProduct> parseProducts(String url, Map<String, ParsingSettings> settings) throws InterruptedException {
        Set<String> productLinks = parser.retrieveLinks(url, OlxConstant.PRODUCT_PAGE_QUERY);
        Set<String> pagination = parser.retrieveLinks(url, OlxConstant.PAGINATION_QUERY);
        
        Map<String, String> result;
        List<OlxProduct> finalResult = new ArrayList<>();
        for(String link : productLinks) {
            result = parser.parsePage(link, settings);
            OlxProduct olxProduct = Converter.convertToOlxProduct(result);
            finalResult.add(olxProduct);
        }
        return finalResult;
    }
}
