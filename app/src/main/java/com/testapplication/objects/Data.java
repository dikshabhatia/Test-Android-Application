package com.testapplication.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diksha Bhatia on 3/16/2016.
 */
public class Data {
    private List<Feed> feed = new ArrayList<Feed>();
    private List<Article> articles = new ArrayList<Article>();
    private List<Publisher> publishers = new ArrayList<Publisher>();


    public List<Feed> getFeed() {
        return feed;
    }


    public void setFeed(List<Feed> feed) {
        this.feed = feed;
    }


    public List<Article> getArticles() {
        return articles;
    }


    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }


    public List<Publisher> getPublishers() {
        return publishers;
    }


    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }
}
