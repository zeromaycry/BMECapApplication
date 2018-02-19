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
 * Huge thanks to Journal Dev: https://www.journaldev.com/10024/android-recyclerview-android-cardview-example-tutorial
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

    public SavedImageScrollAdapter(ArrayList<Photo> photolist){this.dataSet = photolist;}

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_saved_scroll, parent, false);
        view.setOnClickListener(SavedScrollActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        TextView imageName = holder.imageName;
        TextView imageVersion = holder.imageVersion;
        ImageView imgView = holder.imageViewIcon;

        imageName.setText(dataSet.get(position).getName());
        imageVersion.setText(dataSet.get(position).getVersion());
        imgView.setImageResource(dataSet.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }



}
