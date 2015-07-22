package com.example.recyclerviewbug;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yi01 on 2015/07/22.
 */
public class ViewHolder extends RecyclerView.ViewHolder {
    public final TextView itemText;

    public ViewHolder(View itemView) {
        super(itemView);
        itemText = (TextView)itemView.findViewById(R.id.recycler_item_text);
    }
}
