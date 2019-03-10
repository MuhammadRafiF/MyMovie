package com.test.asus.mymovie.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.test.asus.mymovie.Adapter.AnimeAdapter;
import com.test.asus.mymovie.Model.AnimeModel;
import com.test.asus.mymovie.Presenter.AnimePresenter;
import com.test.asus.mymovie.R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    RecyclerView recyclerView,recyclerView1,recyclerView2;
    AnimeAdapter adapter;
    AnimePresenter presenter;
    List<AnimeModel> animeModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recview);
        recyclerView1 = findViewById(R.id.recview1);
        recyclerView2 = findViewById(R.id.recview2);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        adapter = new AnimeAdapter(this,animeModels);
        recyclerView.setAdapter(adapter);
        presenter = new AnimePresenter(this,this);
        presenter.setData();

        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AnimeAdapter(this,animeModels);
        recyclerView1.setAdapter(adapter);
        presenter = new AnimePresenter(this,this);
        presenter.setData();

        recyclerView2.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        adapter = new AnimeAdapter(this,animeModels);
        recyclerView2.setAdapter(adapter);
        presenter = new AnimePresenter(this,this);
        presenter.setData();
    }

    @Override
    public void onSucsess(List<AnimeModel> animeModels) {
        this.animeModels.clear();
        this.animeModels.addAll(animeModels);
        this.adapter.notifyDataSetChanged();
    }
}
