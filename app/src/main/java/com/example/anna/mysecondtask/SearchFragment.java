package com.example.anna.mysecondtask;

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


public class SearchFragment extends Fragment {

    private EditText mText;
    private Button mButton;
    private String s = "https://www.google.ru/search?q=";


    public static SearchFragment newInstance() {return new SearchFragment(); }

    private View.OnClickListener mFindInGoogle = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
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



