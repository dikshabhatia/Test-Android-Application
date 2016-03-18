package com.testapplication.services;

//import com.squareup.okhttp.Call;

import com.testapplication.objects.Test;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Diksha Bhatia on 3/16/2016.
 */
public class API {

    public interface DataAPI{


        @GET("/feed/5")
        //public void getFeeds(Callback<List<Data>> response);
        public void getData(Callback<Test> response);


    }
}
