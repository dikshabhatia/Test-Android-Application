package com.testapplication.objects;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diksha Bhatia on 3/16/2016.
 */
public class Article {
    private Integer V;
    private String Id;
    private String imageUrl;
    private String introduction;
    private String metaDescription;
    private String metaImage;
    private String metaKeywords;
    private String metaTags;
    private Long publishDate;
    private String title;
    private Integer version;
    private Integer showHeader;
    private List<Object> sharedBy = new ArrayList<Object>();
    private List<Object> likedBy = new ArrayList<Object>();
    private List<String> categories = new ArrayList<String>();
    private String createdBy;
    private List<Object> associatedArticles = new ArrayList<Object>();
    private Integer linksToListings;
    private Long published;
    private Long creationDate;
    private List<ArticleEntry> articleEntries = new ArrayList<ArticleEntry>();

    /**
     *
     * @return
     * The V
     */
    public Integer getV() {
        return V;
    }

    /**
     *
     * @param V
     * The __v
     */
    public void setV(Integer V) {
        this.V = V;
    }

    /**
     *
     * @return
     * The Id
     */
    public String getId() {
        return Id;
    }

    /**
     *
     * @param Id
     * The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     * The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     * The imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     * The introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     *
     * @param introduction
     * The introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     *
     * @return
     * The metaDescription
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     *
     * @param metaDescription
     * The metaDescription
     */
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    /**
     *
     * @return
     * The metaImage
     */
    public String getMetaImage() {
        return metaImage;
    }

    /**
     *
     * @param metaImage
     * The metaImage
     */
    public void setMetaImage(String metaImage) {
        this.metaImage = metaImage;
    }

    /**
     *
     * @return
     * The metaKeywords
     */
    public String getMetaKeywords() {
        return metaKeywords;
    }

    /**
     *
     * @param metaKeywords
     * The metaKeywords
     */
    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    /**
     *
     * @return
     * The metaTags
     */
    public String getMetaTags() {
        return metaTags;
    }

    /**
     *
     * @param metaTags
     * The metaTags
     */
    public void setMetaTags(String metaTags) {
        this.metaTags = metaTags;
    }

    /**
     *
     * @return
     * The publishDate
     */
    public Long getPublishDate() {
        return publishDate;
    }

    /**
     *
     * @param publishDate
     * The publishDate
     */
    public void setPublishDate(Long publishDate) {
        this.publishDate = publishDate;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     *
     * @param version
     * The version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     *
     * @return
     * The showHeader
     */
    public Integer getShowHeader() {
        return showHeader;
    }

    /**
     *
     * @param showHeader
     * The showHeader
     */
    public void setShowHeader(Integer showHeader) {
        this.showHeader = showHeader;
    }

    /**
     *
     * @return
     * The sharedBy
     */
    public List<Object> getSharedBy() {
        return sharedBy;
    }

    /**
     *
     * @param sharedBy
     * The sharedBy
     */
    public void setSharedBy(List<Object> sharedBy) {
        this.sharedBy = sharedBy;
    }

    /**
     *
     * @return
     * The likedBy
     */
    public List<Object> getLikedBy() {
        return likedBy;
    }

    /**
     *
     * @param likedBy
     * The likedBy
     */
    public void setLikedBy(List<Object> likedBy) {
        this.likedBy = likedBy;
    }

    /**
     *
     * @return
     * The categories
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     *
     * @param categories
     * The categories
     */
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     *
     * @return
     * The createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     *
     * @param createdBy
     * The createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     *
     * @return
     * The associatedArticles
     */
    public List<Object> getAssociatedArticles() {
        return associatedArticles;
    }

    /**
     *
     * @param associatedArticles
     * The associatedArticles
     */
    public void setAssociatedArticles(List<Object> associatedArticles) {
        this.associatedArticles = associatedArticles;
    }

    /**
     *
     * @return
     * The linksToListings
     */
    public Integer getLinksToListings() {
        return linksToListings;
    }

    /**
     *
     * @param linksToListings
     * The linksToListings
     */
    public void setLinksToListings(Integer linksToListings) {
        this.linksToListings = linksToListings;
    }

    /**
     *
     * @return
     * The published
     */
    public Long getPublished() {
        return published;
    }

    /**
     *
     * @param published
     * The published
     */
    public void setPublished(Long published) {
        this.published = published;
    }

    /**
     *
     * @return
     * The creationDate
     */
    public Long getCreationDate() {
        return creationDate;
    }

    /**
     *
     * @param creationDate
     * The creationDate
     */
    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    /**
     *
     * @return
     * The articleEntries
     */
    public List<ArticleEntry> getArticleEntries() {
        return articleEntries;
    }

    /**
     *
     * @param articleEntries
     * The articleEntries
     */
    public void setArticleEntries(List<ArticleEntry> articleEntries) {
        this.articleEntries = articleEntries;
    }

}

