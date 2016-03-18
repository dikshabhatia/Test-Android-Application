package com.testapplication.objects;

/**
 * Created by Diksha Bhatia on 3/16/2016.
 */
public class ArticleEntry {

    private String description;
    private String Id;
    private Card card;

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
     * The card
     */
    public Card getCard() {
        return card;
    }

    /**
     *
     * @param card
     * The card
     */
    public void setCard(Card card) {
        this.card = card;
    }


}
