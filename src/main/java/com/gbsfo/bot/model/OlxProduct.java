package com.gbsfo.bot.model;

public class OlxProduct {
    private String title;
    private String price;
    private String description;
    private String views;
    private String photoLink;
    private String pageLink;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public String getPageLink() {
        return pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    @Override
    public String toString() {
        return "OlxProduct{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", views='" + views + '\'' +
                ", photoLink='" + photoLink + '\'' +
                ", pageLink='" + pageLink + '\'' +
                '}';
    }
}
