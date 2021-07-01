package com.gbsfo.bot.converter;

import com.gbsfo.bot.constant.OlxConstant;
import com.gbsfo.bot.model.OlxProduct;
import java.util.Map;

public class Converter {
    public static OlxProduct convertToOlxProduct(Map<String, String> input) {
        OlxProduct olxProduct = new OlxProduct();
        olxProduct.setTitle(input.get(OlxConstant.TITLE));
        olxProduct.setPrice(input.get(OlxConstant.PRICE));
        olxProduct.setPhotoLink(input.get(OlxConstant.PHOTO_LINK));
        olxProduct.setDescription(input.get(OlxConstant.DESCRIPTION));
        olxProduct.setPageLink(input.get(OlxConstant.PAGE_URL));
        
        return olxProduct;
    }
}
