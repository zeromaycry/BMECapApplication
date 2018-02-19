package com.example.student.bmecapapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by Charles Pritchett on 2/19/2018.
 */

public class SavedImageScrollAdapter extends RecyclerView.Adapter<SavedImageScrollAdapter.MyViewHolder> {

    private ArrayList<Photo> dataSet;


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView imageName;
        TextView imageVersion;
        ImageView imageViewIcon;

        public MyViewHolder(View itemView){
            super(itemView);
            imageName = (TextView) itemView.findViewById(R.id.item_name);
            imageVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageThumbnail);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }



}
