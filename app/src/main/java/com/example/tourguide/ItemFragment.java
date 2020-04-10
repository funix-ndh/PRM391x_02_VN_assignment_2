package com.example.tourguide;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class ItemFragment extends Fragment {

    final private Item[] items;
    final private int titleResId;

    public ItemFragment(Item[] items, int titleResId) {
        this.items = items;
        this.titleResId = titleResId;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);
        ((TextView) view.findViewById(R.id.titleListTxt)).setText(titleResId);
        ((ListView) view.findViewById(R.id.list)).setAdapter(new Adapter(view.getContext(), items));
        view.findViewById(R.id.backBtn).setOnClickListener(v -> ((MainActivity) getActivity()).updateFragment(new MainFragment()));
        return view;
    }
}
