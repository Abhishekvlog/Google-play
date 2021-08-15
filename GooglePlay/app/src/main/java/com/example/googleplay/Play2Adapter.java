package com.example.googleplay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Play2Adapter extends RecyclerView.Adapter<Play2ViewHolder> {
    private ArrayList<Play2> play2List = new ArrayList<>();
    public Play2Adapter(ArrayList<Play2> play2List){
        this.play2List = play2List;
    }

    @Override
    public Play2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout2,parent,false);
        return new Play2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Play2ViewHolder holder, int position) {
        Play2 play2 = play2List.get(position);
        holder.setData2(play2);
    }

    @Override
    public int getItemCount() {
        return play2List.size();
    }
}
