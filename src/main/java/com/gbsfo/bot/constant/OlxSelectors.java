package com.gbsfo.bot.constant;

import com.gbsfo.bot.model.ParsingSettings;
import java.util.HashMap;
import java.util.Map;

public class OlxSelectors {
    private static Map<String, ParsingSettings> settings = new HashMap<>();
    
    static {
        settings.put(OlxConstant.TITLE, new ParsingSettings("h1"));
        settings.put(OlxConstant.PRICE, new ParsingSettings("[data-testid='ad-price-container']"));
        settings.put(OlxConstant.PHOTO_LINK, new ParsingSettings("[data-testid='swiper-image']", "src"));
        settings.put(OlxConstant.DESCRIPTION, new ParsingSettings("[data-cy='ad_description']"));
    }

    public static Map<String, ParsingSettings> getSettings() {
        return settings;
    }
}
