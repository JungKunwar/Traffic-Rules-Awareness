package com.codewithsudesh.trafficsrules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        // Setting  title to the Activity
        getSupportActionBar().setTitle(R.string.title_contactus);


        // Setting the Up button in Activity to return to More fragment
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // About Us //

        Element element = new Element();
        element.setTitle("Advertise here");

        View aboutpage = new AboutPage(this)
                .isRTL(false)
//                .setImage(R.drawable.about_bg)
                .setDescription("Welcome To Traffic Rules Awareness")
                .addItem(new Element().setTitle("Version 1.0"))
                .addItem( element)
                .addGroup("Connect With Us")
                .addEmail("sudesh6kunwar@gmail.com")
                .addWebsite("https://traffic.nepalpolice.gov.np/")
                .addFacebook("NepalPolicePHQ")
                .addYoutube("UCHbQpMEaQjKW961qPjKe0-A")
                .addInstagram("nepalpolice")
                .addGitHub("JungKunwar")
                .addItem(createCopyright())
                .create();


        setContentView(aboutpage);
    }

    private Element createCopyright() {

        Element copyright = new Element();
        final String copyrightstring = String.format("@Copyright %d by Traffic Rules Awareness", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightstring);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContactUs.this, copyrightstring, Toast.LENGTH_SHORT).show();
            }
        });

        return copyright;
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
