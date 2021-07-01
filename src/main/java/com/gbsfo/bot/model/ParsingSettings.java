package com.gbsfo.bot.model;

public class ParsingSettings {
    private String cssQuery;
    private String attribute;
    private Boolean isList;

    public ParsingSettings(String cssQuery) {
        this.cssQuery = cssQuery;
        this.isList = false;
    }

    public ParsingSettings(String cssQuery, String attribute) {
        this.cssQuery = cssQuery;
        this.attribute = attribute;
        this.isList = false;
    }

    public ParsingSettings(String cssQuery, String attribute, Boolean isList) {
        this.cssQuery = cssQuery;
        this.attribute = attribute;
        this.isList = isList;
    }

    public String getCssQuery() {
        return cssQuery;
    }

    public void setCssQuery(String cssQuery) {
        this.cssQuery = cssQuery;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Boolean getList() {
        return isList;
    }

    public void setList(Boolean list) {
        isList = list;
    }
}
