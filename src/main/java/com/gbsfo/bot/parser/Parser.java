package com.gbsfo.bot.parser;

import com.gbsfo.bot.model.ParsingSettings;

import java.util.Set;
import java.util.Map;

public interface Parser {
    Set<String> retrieveLinks(String url, String cssQuery);
    Map<String, String> parsePage(String url, Map<String, ParsingSettings> fieldsAndQueries);
}
