package com.example.practicaunonavigation.rest.service;

import com.example.practicaunonavigation.rest.constants.ApiConstants;
import com.example.practicaunonavigation.rest.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MarketService {

    @POST(ApiConstants.MARKET_POST_ENDPOINT)
    Call<Post> InsertPost(@Body Post post);

    @GET(ApiConstants.MARKET_POST_ENDPOINT)
    Call<List<Post>> getPosts();


}
