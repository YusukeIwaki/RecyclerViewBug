package com.example.recyclerviewbug;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by yi01 on 2015/07/22.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initializeRecyclerView();
    }

    private void initializeRecyclerView() {
        RecyclerView recycler = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setReverseLayout(true);
        recycler.setLayoutManager(layoutManager);
        Adapter recyclerAdapter = new Adapter(createItemList());
        recycler.setAdapter(recyclerAdapter);

    }

    private static ArrayList<String> createItemList(){
        ArrayList<String> items= new ArrayList<>();
        for(int i=0;i<20;i++){
            items.add(String.format("item %02d",20-i));
        }
        return items;
    }

}
