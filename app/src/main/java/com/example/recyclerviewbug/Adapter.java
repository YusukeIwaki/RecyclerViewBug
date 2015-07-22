package com.example.recyclerviewbug;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by yi01 on 2015/07/22.
 */
public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private final ArrayList<String> mItemList;

    public Adapter(ArrayList<String> itemList) {
        mItemList = itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View item = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item,viewGroup,false);
        return new ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemText.setText(mItemList.get(i));
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }
}
