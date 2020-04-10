package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Objects;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Spinner spinner = view.findViewById(R.id.spinner);
        view.findViewById(R.id.atmBtn).setOnClickListener(v ->
                ((MainActivity) Objects.requireNonNull(getActivity())).updateFragment(new ItemFragment(isHanoiLocation(spinner) ? Item.atm : Item.atmHcm, R.string.atm)));
        view.findViewById(R.id.hospitalBtn).setOnClickListener(v ->
                ((MainActivity) Objects.requireNonNull(getActivity())).updateFragment(new ItemFragment(isHanoiLocation(spinner) ? Item.hospital : Item.hospitalHcm, R.string.hospital)));
        view.findViewById(R.id.busBtn).setOnClickListener(v ->
                ((MainActivity) Objects.requireNonNull(getActivity())).updateFragment(new ItemFragment(isHanoiLocation(spinner) ? Item.bus : Item.busHcm, R.string.bus)));
        view.findViewById(R.id.hotelBtn).setOnClickListener(v ->
                ((MainActivity) Objects.requireNonNull(getActivity())).updateFragment(new ItemFragment(isHanoiLocation(spinner) ? Item.hotel : Item.hotelHcm, R.string.hotel)));
        spinner.setAdapter(
                ArrayAdapter.createFromResource(getContext(), R.array.location, android.R.layout.simple_spinner_dropdown_item));

        return view;
    }

    private boolean isHanoiLocation(Spinner spinner) {
        return spinner.getSelectedItemPosition() == 0;
    }
}
