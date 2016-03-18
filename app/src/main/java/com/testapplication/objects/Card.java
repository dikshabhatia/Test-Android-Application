package com.testapplication.objects;

/**
 * Created by Diksha Bhatia on 3/16/2016.
 */
public class Card {
    private Integer cardOrder;
    private String cardTitle;
    private String cardSubtitle;
    private String cardDescription;
    private String cardImageUrl;
    private String cardAssociatedListing;
    private Object cardPhoneNumber;

    /**
     *
     * @return
     * The cardOrder
     */
    public Integer getCardOrder() {
        return cardOrder;
    }

    /**
     *
     * @param cardOrder
     * The cardOrder
     */
    public void setCardOrder(Integer cardOrder) {
        this.cardOrder = cardOrder;
    }

    /**
     *
     * @return
     * The cardTitle
     */
    public String getCardTitle() {
        return cardTitle;
    }

    /**
     *
     * @param cardTitle
     * The cardTitle
     */
    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    /**
     *
     * @return
     * The cardSubtitle
     */
    public String getCardSubtitle() {
        return cardSubtitle;
    }

    /**
     *
     * @param cardSubtitle
     * The cardSubtitle
     */
    public void setCardSubtitle(String cardSubtitle) {
        this.cardSubtitle = cardSubtitle;
    }

    /**
     *
     * @return
     * The cardDescription
     */
    public String getCardDescription() {
        return cardDescription;
    }

    /**
     *
     * @param cardDescription
     * The cardDescription
     */
    public void setCardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
    }

    /**
     *
     * @return
     * The cardImageUrl
     */
    public String getCardImageUrl() {
        return cardImageUrl;
    }

    /**
     *
     * @param cardImageUrl
     * The cardImageUrl
     */
    public void setCardImageUrl(String cardImageUrl) {
        this.cardImageUrl = cardImageUrl;
    }

    /**
     *
     * @return
     * The cardAssociatedListing
     */
    public String getCardAssociatedListing() {
        return cardAssociatedListing;
    }

    /**
     *
     * @param cardAssociatedListing
     * The cardAssociatedListing
     */
    public void setCardAssociatedListing(String cardAssociatedListing) {
        this.cardAssociatedListing = cardAssociatedListing;
    }

    /**
     *
     * @return
     * The cardPhoneNumber
     */
    public Object getCardPhoneNumber() {
        return cardPhoneNumber;
    }

    /**
     *
     * @param cardPhoneNumber
     * The cardPhoneNumber
     */
    public void setCardPhoneNumber(Object cardPhoneNumber) {
        this.cardPhoneNumber = cardPhoneNumber;
    }

}
