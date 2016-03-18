package com.testapplication.objects.db;

import com.orm.SugarRecord;

/**
 * Created by Diksha Bhatia on 3/17/2016.
 */
public class FeedEntity extends SugarRecord{

    String imageUrl;
    String imageTitle;


    public FeedEntity(String imageUrl,String imageTitle){
        super();
        this.imageTitle=imageTitle;
        this.imageUrl=imageUrl;

    }

    public FeedEntity(){
        super();
    }


    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }




}
