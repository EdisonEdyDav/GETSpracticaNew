package com.example.practicaunonavigation.rest.adapter;

import com.example.practicaunonavigation.rest.constants.ApiConstants;
import com.example.practicaunonavigation.rest.model.Post;
import com.example.practicaunonavigation.rest.service.MarketService;

import java.util.List;

import retrofit2.Call;

public class MarketAdapter extends BaseAdapter implements MarketService {

    public MarketService marketService;

    public MarketAdapter(){
        super(ApiConstants.BASE_POST_URL);
        marketService=createService(MarketService.class);
    }

    @Override
    public Call<Post> InsertPost(Post post){
        return marketService.InsertPost(post);
    }

    @Override
    public Call<List<Post>> getPosts(){
        return marketService.getPosts();
    }


}
