package com.codewithsudesh.trafficsrules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LanguageActivity extends AppCompatActivity {

    Spinner spinner;
    Locale myLocale;
    String currentLanguage = "en", currentLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        loadLocale();
        setContentView(R.layout.activity_language);

       getSupportActionBar().hide();


}


//         Button changeLang = findViewById(R.id.changeMyLanguage);
//         changeLang .setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
//
//                 showChangeLanguageDialog();
//
//
//
//             }
//         });



//    }

//    private void showChangeLanguageDialog() {
//
//        final String[] listItems = {"नेपाली" , "English"};
//        AlertDialog.Builder mBuilder = new AlertDialog.Builder(LanguageActivity.this);
//        mBuilder.setTitle("Choose Language... ");
//        mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int i) {
//
//                if (i == 0){
//                    setLocale("nep");
//                    recreate();
//                }
//
//                else if (i==1){
//                    setLocale("eng");
//                    recreate();
//                }
//
//                // dismiss alert dialog when language selected
//                dialog.dismiss();
//            }
//        });
//
//        AlertDialog mDialog = mBuilder.create();
//
//        mDialog.show();
//
//    }
//
//    private void setLocale(String lang) {
//        Locale locale = new Locale(lang);
//        Locale.setDefault(locale);
//        Configuration config = new Configuration();
//        config.locale = locale;
//        getBaseContext().getResources().updateConfiguration(config, getBaseContext(). getResources().getDisplayMetrics());
//
//        //save Data to shared Preference
//        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
//        editor.putString("My_Lang", lang);
//        editor.apply();
//
//    }
//
//    //load language saved in shared preferences
//    public void loadLocale(){
//        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
//        String language = prefs.getString("My_Lang", "");
//        setLocale(language);
//
//    }

//}
