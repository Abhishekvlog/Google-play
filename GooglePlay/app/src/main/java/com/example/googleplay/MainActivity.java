package com.example.googleplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Play> playList = new ArrayList<>();
    private RecyclerView recyclerView1;
    private ArrayList<Play2> play2List = new ArrayList<>();
    private RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView1 = findViewById(R.id.recyclerView_1);
        recyclerView2 = findViewById(R.id.recyclerView_2);
        buildRecyclerViewData();
        setRecyclerViewAdapter();
        buildRecyclerViewData2();
        setRecyclerViewAdapter2();
    }

    private void setRecyclerViewAdapter2() {
        Play2Adapter play2Adapter = new Play2Adapter(play2List);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setAdapter(play2Adapter);

    }

    private void buildRecyclerViewData2() {
        play2List.add(new Play2(R.drawable.sico,"Sico",R.drawable.ic_more,"Free"));
        play2List.add(new Play2(R.drawable.spider,"Spider",R.drawable.ic_more,"Free"));
        play2List.add(new Play2(R.drawable.taso,"Taso",R.drawable.ic_more,"Free"));
        play2List.add(new Play2(R.drawable.temple,"Temple Run",R.drawable.ic_more,"Free"));

    }

    private void setRecyclerViewAdapter() {
        PlayAdapter  playAdapter = new PlayAdapter(playList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        recyclerView1.setAdapter(playAdapter);


    }

    private void buildRecyclerViewData() {
    playList = new ArrayList<>();
    playList.add(new Play(R.drawable.pubg));
    playList.add(new Play(R.drawable.airspae));
    playList.add(new Play(R.drawable.z));
    playList.add(new Play(R.drawable.dgt));
    playList.add(new Play(R.drawable.fortnaight));
    }

}