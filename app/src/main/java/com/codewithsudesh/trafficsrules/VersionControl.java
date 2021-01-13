package com.codewithsudesh.trafficsrules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class VersionControl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_version_control);

        // Setting  title to the Activity
        getSupportActionBar().setTitle(R.string.title_feedback);


        // Setting the Up button in Activity to return to More fragment
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    // Setting the Up button in Activity to return to More fragment
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }

        return true;
    }



}
