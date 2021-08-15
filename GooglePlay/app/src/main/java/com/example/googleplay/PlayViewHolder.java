package com.example.googleplay;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlayViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvImage;
    public PlayViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mtvImage = itemView.findViewById(R.id.tvimage);
    }
    public void stetData(Play play){
        mtvImage.setImageResource(play.getImage());
    }
}
