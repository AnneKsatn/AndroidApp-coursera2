package com.example.anna.mysecondtask;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Anna on 16.02.2018.
 */

public class OptionsFragment extends Fragment{

    RadioButton radioGoogle;
    RadioButton radioYandex;
    RadioButton radioBing;

    public static OptionsFragment newInstance() {return new OptionsFragment();}
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fr_options, container, false) ;

        radioGoogle = v.findViewById(R.id.radioGoogle);
        radioYandex = v.findViewById(R.id.radioYandex);
        radioBing = v.findViewById(R.id.radioBind);

        return v;
    }


}
