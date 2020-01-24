package com.example.practicaunonavigation;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.practicaunonavigation.rest.adapter.MarketAdapter;
import com.example.practicaunonavigation.rest.model.Post;
import com.example.practicaunonavigation.ui.AdaptadorPost;

import java.security.acl.Owner;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Post> listaPost;
    RecyclerView recyclerViewPost;
    TextView textViewTittle,textViewdescription,textViewUrl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTittle = findViewById(R.id.textViewTittle);
        textViewdescription = findViewById(R.id.textViewDescription);
        textViewUrl = findViewById(R.id.textViewUrl);

         listaPost = new ArrayList<>();
        recyclerViewPost = (RecyclerView)findViewById(R.id.recyclerViewPost);

        recyclerViewPost.setLayoutManager(new LinearLayoutManager(this));

        mostrarDatos();

    }

    private void mostrarDatos(){
        MarketAdapter adapter = new MarketAdapter();
        Call<List<Post>> call = adapter.getPosts();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                List<Post> lista = response.body();
                for (Post post: lista
                ) {
                    Log.e("Url", post.getUrlImage());

                    listaPost.add(post);
                }
                AdaptadorPost adaptadorPost = new AdaptadorPost(listaPost);
                recyclerViewPost.setAdapter(adaptadorPost);

            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {


            }
        });
    }



}



