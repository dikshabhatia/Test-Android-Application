package com.testapplication.testapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.testapplication.R;
import com.testapplication.adapters.RVFeedAdapter;
import com.testapplication.objects.Test;
import com.testapplication.objects.db.FeedEntity;
import com.testapplication.services.API;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    public static final String API_Url="http://s-o.co.in:1302/api/v2/delhi";

    Test testObject;

    public static final String URL="http://s-o.co.in:1302/media/imageSrc/1000/low";
    String imageUrl;
    String standardImageUrl;
    List<FeedEntity> listFeedEntity = new ArrayList<>();
    RVFeedAdapter adapter;
    RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv = (RecyclerView)findViewById(R.id.rv_feeds);
        rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        getData();

    }

    private void getData(){

        Log.d("ENTERED METHOD", " getData");

        //Creating a rest adapter
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(API_Url)
                .build();

        //Creating an object of our api interface
        API.DataAPI dataAPI = adapter.create(API.DataAPI.class);

        dataAPI.getData(new Callback<Test>() {

            @Override
            public void success(Test test, Response response) {

                testObject = test;
                Toast.makeText(getApplicationContext(), "success etrofit", Toast.LENGTH_LONG).show();

                if (!(testObject.getData().getFeed().isEmpty())) {

                    FeedEntity.deleteAll(FeedEntity.class);
                    for (int i = 0; i < testObject.getData().getFeed().size(); i++) {

                        imageUrl = testObject.getData().getFeed().get(i).getImageUrl();
                        standardImageUrl = URL + imageUrl.substring(16, imageUrl.length());
                        FeedEntity feedEntity = new FeedEntity(standardImageUrl, testObject.getData().getFeed().get(i).getTitle());
                        feedEntity.save();

                    }

                    showList();

                } else {
                    Log.d("empty list getFeed", "no feeds");
                    Toast.makeText(getApplicationContext(), "No Feeds avaialble", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("ERROR ", error.toString());
                Toast.makeText(getApplicationContext(), "No internet connection found", Toast.LENGTH_LONG).show();
                showList();
            }
        });
    }

    void showList(){

        Log.d("Entered method"," showList");
        listFeedEntity =FeedEntity.listAll(FeedEntity.class);

        adapter = new RVFeedAdapter(this,listFeedEntity);
        rv.setAdapter(adapter);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this,testObject.getData().getFeed().get(position).getTitle(),Toast.LENGTH_LONG).show();

    }
}
