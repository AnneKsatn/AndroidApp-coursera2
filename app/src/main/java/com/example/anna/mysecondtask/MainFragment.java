package com.example.anna.mysecondtask;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Anna on 17.02.2018.
 */

public class MainFragment extends Fragment{
    public static MainFragment newInstance() {return new MainFragment();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fr_main, container, false);

        return v;
    }
}
