package com.example.googleplay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlayAdapter extends RecyclerView.Adapter<PlayViewHolder> {
    private ArrayList<Play> playList = new ArrayList<>();
    public PlayAdapter(ArrayList<Play> playList){
        this.playList = playList;
    }

    @Override
    public PlayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new PlayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayViewHolder holder, int position) {
        Play play = playList.get(position);
        holder.stetData(play);
    }

    @Override
    public int getItemCount() {
        return playList.size();
    }
}
