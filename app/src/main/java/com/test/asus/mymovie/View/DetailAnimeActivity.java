package com.test.asus.mymovie.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.test.asus.mymovie.R;
import android.widget.TextView;

public class DetailAnimeActivity extends AppCompatActivity {
        TextView tvName,tvOverview;
        ImageView ivAnime;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_anime);
            tvName = findViewById(R.id.tv_judul);
            tvOverview = findViewById(R.id.tv_overview);
            ivAnime = findViewById(R.id.iv_anime);

            String nama = getIntent().getStringExtra("nama");
            String overview = getIntent().getStringExtra("overview");
            int gambar = getIntent().getIntExtra("gambar",0);

            tvName.setText(nama);
            tvOverview.setText(overview);
            ivAnime.setImageResource(gambar);
        }
}

