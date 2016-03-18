package com.testapplication.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diksha Bhatia on 3/16/2016.
 */
public class Feed {
    private Integer V;
    private String Id;
    private String description;
    private String imageUrl;
    private String title;
    private String createdBy;
    private List<String> interests = new ArrayList<String>();
    private Integer sponsored;
    private Integer ourPicks;
    private Integer original;
    private Integer version;
    private Long creationDate;
    private Long publishDate;
    private Integer published;
    private FeedEntity feedEntity;

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
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * The interests
     */
    public List<String> getInterests() {
        return interests;
    }

    /**
     *
     * @param interests
     * The interests
     */
    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    /**
     *
     * @return
     * The sponsored
     */
    public Integer getSponsored() {
        return sponsored;
    }

    /**
     *
     * @param sponsored
     * The sponsored
     */
    public void setSponsored(Integer sponsored) {
        this.sponsored = sponsored;
    }

    /**
     *
     * @return
     * The ourPicks
     */
    public Integer getOurPicks() {
        return ourPicks;
    }

    /**
     *
     * @param ourPicks
     * The ourPicks
     */
    public void setOurPicks(Integer ourPicks) {
        this.ourPicks = ourPicks;
    }

    /**
     *
     * @return
     * The original
     */
    public Integer getOriginal() {
        return original;
    }

    /**
     *
     * @param original
     * The original
     */
    public void setOriginal(Integer original) {
        this.original = original;
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
     * The published
     */
    public Integer getPublished() {
        return published;
    }

    /**
     *
     * @param published
     * The published
     */
    public void setPublished(Integer published) {
        this.published = published;
    }

    /**
     *
     * @return
     * The feedEntity
     */
    public FeedEntity getFeedEntity() {
        return feedEntity;
    }

    /**
     *
     * @param feedEntity
     * The feedEntity
     */
    public void setFeedEntity(FeedEntity feedEntity) {
        this.feedEntity = feedEntity;
    }


}
