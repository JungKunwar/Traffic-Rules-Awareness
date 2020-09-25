package com.codewithsudesh.trafficsrules;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;
    ArrayList<LatLng> arrayList=new ArrayList<LatLng>();
    LatLng Kathmandu = new LatLng(27.678137, 85.349244);
    LatLng Bharatpur = new LatLng(27.689523, 84.430713);
    LatLng Pokhara = new LatLng(28.209844, 83.986388);



}
