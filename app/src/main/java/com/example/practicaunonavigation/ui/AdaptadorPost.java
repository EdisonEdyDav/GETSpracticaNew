package com.example.practicaunonavigation.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practicaunonavigation.R;
import com.example.practicaunonavigation.rest.model.Post;

import java.util.ArrayList;

public class AdaptadorPost extends RecyclerView.Adapter<AdaptadorPost.ViewHolderPost>{

    ArrayList<Post> listaPost;

    public AdaptadorPost(ArrayList<Post> listaPost) {
        this.listaPost = listaPost;
    }


    @NonNull
    @Override
    public ViewHolderPost onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,
                null, false);
        return new ViewHolderPost(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPost holder, int position) {

        holder.Url.setText(listaPost.get(position).getUrlImage());
        holder.Tittle.setText(listaPost.get(position).getTittle());
        holder.Description.setText(listaPost.get(position).getDescription());

        //holder.foto.setImageResource(listaFollowers.get(position).get);



    }

    @Override
    public int getItemCount() {
        return listaPost.size();
    }

    public class ViewHolderPost extends RecyclerView.ViewHolder {

        TextView Url;
        TextView Tittle;
        TextView Description;


        public ViewHolderPost(View itemView) {
            super(itemView);

            Url = (TextView) itemView.findViewById(R.id.textViewUrl);
            Tittle = (TextView) itemView.findViewById(R.id.textViewTittle);
            Description = (TextView) itemView.findViewById(R.id.textViewDescription);


        }
    }

}
