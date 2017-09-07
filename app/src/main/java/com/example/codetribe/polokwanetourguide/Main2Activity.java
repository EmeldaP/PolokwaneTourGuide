package com.example.codetribe.polokwanetourguide;

import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import java.util.ArrayList;

import static com.example.codetribe.polokwanetourguide.R.id.map;

public class Main2Activity extends AppCompatActivity implements OnMapReadyCallback {

    CardView cv;
    RecyclerView recycle;
    PlaceDetails placeDetails;
    //Button Direction;
    public Fragment map;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recycle =(RecyclerView)findViewById(R.id.recycle_view);
        recycle.setLayoutManager(new LinearLayoutManager(this));

        cv = (CardView)findViewById(R.id.cardList);
       // Direction = (Button)findViewById(R.id.info);

        ArrayList<Places>arrayList = new ArrayList<>();

        Places places = new Places();
        places.setName("Bakone Malapa Museum");
        places.setAddress("9 km from Polokwane on the R37 (Burgersfort Road)");
        places.setPhone_number("015-290 6430");
        places.setIcon(R.drawable.bakonem);
        arrayList.add(places);

        //cricketclub
        Places places1 = new Places();
        places1.setName("Cricket Club");
        places1.setAddress("Cnr 23 Gen Joubert & Rissik str");
        places1.setPhone_number("015-299 1508");
        places1.setIcon(R.drawable.cricket);
        arrayList.add(places1);

        //wildLife
        Places places2 = new Places();
        places2.setName("Polokwane Game Reserve");
        places2.setAddress("242 Ivy Park ");
        places2.setPhone_number("015-287 8773");
        places2.setIcon(R.drawable.reserveplk);
        arrayList.add(places2);

        //lion tour
        Places places3 = new Places();
        places3.setName("Protea Hotel");
        places3.setAddress("25 km South of Polokwane \n" +
                " on either the N1 or the R101, \n" +
                " Limpopo Province, South Africa");
        places3.setPhone_number("+27 15 290 5000");
        places3.setIcon(R.drawable.proteas);
        arrayList.add(places3);

        //mall
        Places places4 = new Places();
        places4.setName("Mall Of The North");
        places4.setAddress(" Cnr R81 and N1 interchange, Bendor, Polokwane");
        places4.setPhone_number("015-265 1026");
        places4.setIcon(R.drawable.mallorth2);
        arrayList.add(places4);

       //casino
        Places places5 = new Places();
        places5.setName("Meropa Casino");
        places5.setAddress("67 cnr Thabo Mbeki & R101 road");
        places5.setPhone_number("015-265 1026");
        places5.setIcon(R.drawable.meropa);
        arrayList.add(places5);

        //old house
        Places places6 = new Places();
        places6.setName("Polokwane Bird and Reptile Park");
        places6.setAddress("Lordten road, 118 Ivydale, Polokwane");
        places6.setPhone_number("+27 (0)15 292-1719");
        places6.setIcon(R.drawable.polokwanebirdandreptileparkcrimson);
        arrayList.add(places6);

        //park
        Places places7 = new Places();
        places7.setName("Gen Piet Joubert Park");
        places7.setAddress("cnr Schoeman and Thabo Mbeki str");
        places7.setPhone_number("015-295 0437");
        places7.setIcon(R.drawable.park);
        arrayList.add(places7);

        //stadium
        Places places8 = new Places();
        places8.setName("Peter Mokaba Sports Complex");
        places8.setAddress("97 Rissik drive");
        places8.setPhone_number("015-288 1958");
        places8.setIcon(R.drawable.petermokabastadium05);
        arrayList.add(places8);

        //park
        Places places9 = new Places();
        places9.setName("Polokwane Irish Meseum");
        places9.setAddress(" Metropolitan Centre on the corner of Thabo Mbeki Street and Market Street, Polokwane.\n");
        places9.setPhone_number(" +27 015-2902 182");
        places9.setIcon(R.drawable.isris2);
         arrayList.add(places9);


        //resort
        Places places0 = new Places();
        places0.setName("Town House Lodge");
        places0.setAddress("P O Box 3303, Polokwane, 0700");
        places0.setPhone_number("+27 15 292 4400");
        places0.setIcon(R.drawable.townlodgepolokwane);
        arrayList.add(places0);

        //Town pool
        Places places91 = new Places();
        places91.setName("Polokwane Town Pool & resort");
        places91.setAddress("7 N1 road ");
        places91.setPhone_number("015-285 1240");
        places91.setIcon(R.drawable.resorts);
        arrayList.add(places91);
        placeDetails=new PlaceDetails(this,arrayList);
        recycle.setAdapter(placeDetails);

       }

  @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        AlertDialog.Builder alert = new AlertDialog.Builder(Main2Activity.this);
        alert.setTitle("");
        alert.setMessage("Do you wanna exit?");

        alert.setPositiveButton("No" , new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alert.setNegativeButton("Yes", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });
        alert.show();


        return super.onOptionsItemSelected(item);
    }

    @Override
    //for item menu exit
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        //inflater to call/utilize the layout in main resource then retrurn true if its avail
        inflater.inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mMap = googleMap;
        googleMap.setMapType(googleMap.MAP_TYPE_SATELLITE);

    }
}
