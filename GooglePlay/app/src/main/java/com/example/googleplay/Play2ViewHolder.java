package com.example.googleplay;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Play2ViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvImage;
    private TextView mtvName;
    private ImageView mtvMore;
    private TextView mtvFree;
    public Play2ViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mtvImage = itemView.findViewById(R.id.img);
        mtvName = itemView.findViewById(R.id.nameofapp);
        mtvMore =itemView.findViewById(R.id.more);
        mtvFree = itemView.findViewById(R.id.tvFree);
    }
    public void setData2(Play2 play2){
        mtvImage.setImageResource(play2.getMtvImage());
        mtvName.setText(play2.getMtvName());
        mtvMore.setImageResource(play2.getMtvMore());
        mtvFree.setText(play2.getMtvFree());
    }
}
