package com.umitcelebi.cardlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    Context context;
    List<Item> mData;

    public Adapter(Context context, List<Item> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(context);
        View v=inflater.inflate(R.layout.card_item,parent,false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.backgroundd_img.setImageResource(mData.get(position).getBackground());
        holder.profilePhoto.setImageResource(mData.get(position).getProfilePhone());
        holder.tv_title.setText(mData.get(position).getItemTitle());
        holder.tv_nbFollowers.setText(mData.get(position).getNbFollowers()+" Followers");
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView profilePhoto,backgroundd_img;
        TextView tv_title,tv_nbFollowers;


        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            profilePhoto=itemView.findViewById(R.id.profile_img);
            backgroundd_img=itemView.findViewById(R.id.card_background);
            tv_title=itemView.findViewById(R.id.card_title);
            tv_nbFollowers=itemView.findViewById(R.id.card_nb_follower);
        }
    }
}
