package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {

    private final Item[] items;
    private final LayoutInflater layoutInflater;

    public Adapter(Context cxt, Item[] items) {
        this.items = items;
        layoutInflater = LayoutInflater.from(cxt);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = layoutInflater.inflate(R.layout.fragment_item, null);
        ((TextView) view.findViewById(R.id.content)).setText(items[i].content);
        view.findViewById(R.id.content).setBackgroundResource(items[i].colorResId);
        ((ImageView) view.findViewById(R.id.icon)).setImageResource(items[i].iconResId);
        return view;
    }
}
