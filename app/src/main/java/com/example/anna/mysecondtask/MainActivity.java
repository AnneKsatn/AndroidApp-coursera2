package com.example.anna.mysecondtask;

import android.content.SharedPreferences;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentMainContainer, MainFragment.newInstance())
                .addToBackStack(MainFragment.class.getName())
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profile_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void showMessage(@StringRes int string) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.actionFind:
                showMessage(R.string.action_find);
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentMainContainer, SearchFragment.newInstance())
                        .addToBackStack(SearchFragment.class.getName())
                        .commit();
                break;
            case R.id.actionLogout:
                showMessage(R.string.action_logout);
                finish();
                break;
            case R.id.actionOptions:
                showMessage(R.string.action_options);
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentMainContainer, OptionsFragment.newInstance())
                        .addToBackStack(OptionsFragment.class.getName())
                        .commit();
                break;
            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}