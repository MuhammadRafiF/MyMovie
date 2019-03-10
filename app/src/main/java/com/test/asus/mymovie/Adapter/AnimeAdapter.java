package com.test.asus.mymovie.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.test.asus.mymovie.Model.AnimeModel;
import com.test.asus.mymovie.View.DetailAnimeActivity;
import com.test.asus.mymovie.R;
import java.util.ArrayList;
import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder>{
    Context context;
    List<AnimeModel> animeModels = new ArrayList<>();

    public AnimeAdapter(Context context, List<AnimeModel> animeModels) {
        this.context = context;
        this.animeModels = animeModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_anime, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvName.setText(animeModels.get(i).getName());
        viewHolder.imageView.setImageResource(animeModels.get(i).getGambar());
        viewHolder.overview.setText(animeModels.get(i).getOverview());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // ketika recycler di click
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailAnimeActivity.class);
                intent.putExtra("name", animeModels.get(i).getName());
                intent.putExtra("gambar", animeModels.get(i).getGambar());
                intent.putExtra("overview", animeModels.get(i).getOverview());
                context.startActivity(intent);
                Toast.makeText(context, animeModels.get(i).getName(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return animeModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imageView;
        TextView overview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_nama);
            imageView = itemView.findViewById(R.id.iv_anime);
            overview = itemView.findViewById(R.id.tv_overview);
        }

    }
}

