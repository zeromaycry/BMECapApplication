package com.example.student.bmecapapplication;

/**
 * Created by Charles Pritchett on 2/19/2018.
 */

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SavedScrollActivity extends AppCompatActivity{

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManger;
    private static RecyclerView recyclerView;
    private static ArrayList<Photo>  data;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_scroll);
        myOnClickListener = new MyOnClickListener(this);

        recyclerView = (RecyclerView) findViewById(R.id.saved_pictures_scroll);
        recyclerView.setHasFixedSize(true);

        layoutManger = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManger);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<Photo>();


            //use this once we finish setting up the MyData class


        for (int i = 0; i < MyData.nameArray.length; i++) {
            data.add(new Photo(
                    MyData.nameArray[i],
                    MyData.versionArray[i],
                    MyData.id[i],
                    MyData.drawables[i]
            ));
        }

         //for removing
        removedItems = new ArrayList<Integer>();

        adapter = new SavedImageScrollAdapter(data);
        recyclerView.setAdapter(adapter);

    }


    private static class MyOnClickListener implements View.OnClickListener{

        private final Context context;
        private MyOnClickListener(Context context){this.context = context;}
        @Override
        public void onClick(View view) {
            //optional remove item
        }
        private void removeItem(View v){

        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);
        return true;
    }

    private void addRemovedItemToList(){
        //optional stuff for removing item
    }
}
