package com.example.anna.mysecondtask;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;


public class SearchFragment extends Fragment {

    private EditText mText;
    private Button mButton;
    public static final String APP_PREFERENCES = "mysettings";
    final String KEY_RADIOBUTTON_INDEX = "SAVED_RADIO_BUTTON_INDEX";
    private String s = "";


    public static SearchFragment newInstance() {return new SearchFragment(); }

    private View.OnClickListener mFindInGoogle = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            SharedPreferences sharedPreferences = getActivity().getSharedPreferences(
                    APP_PREFERENCES, MODE_PRIVATE);
            int savedRadioIndex = sharedPreferences.getInt(
                    KEY_RADIOBUTTON_INDEX, 0);
            switch (savedRadioIndex) {
                case 0:
                    s = "https://www.google.ru/search?q=";
                    break;
                case 1:
                    s = "https://yandex.ru/search/?text=";
                    break;
                case 2:
                    s = "https://www.bing.com/?q=";
                    break;
                default:
                    break;
            }

            s=s+(mText.getText().toString());
            Intent BrowseIntent =
                    new Intent(Intent.ACTION_VIEW, Uri.parse(s));
            startActivity(BrowseIntent);
        }

    };



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fr_search, container, false) ;

        mText = v.findViewById(R.id.etInputText);
        mButton = v.findViewById(R.id.btFindInGoogle);
        mButton.setOnClickListener(mFindInGoogle);

        return v;
    }




}



