package com.example.mylenovo.bealert;

import android.app.Notification;
import android.app.NotificationManager;
import android.media.MediaPlayer;
import android.media.audiofx.BassBoost;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView a;
private customadapter madapter;

    @Override
    protected void onStop() {
        super.onStop();
        NotificationManager t = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("hello")
                .setContentText("notification").setSound(Settings.System.DEFAULT_RINGTONE_URI)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        t.notify(0,mBuilder.build());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView a= (ListView)findViewById(R.id.listview) ;
        final ArrayList<country> countries = new ArrayList<>();
        countries.add(new country("Delhi","India",R.raw.hello));
        countries.add(new country("Berlin","Germany",R.raw.hello));
        countries.add(new country("Washington","America",R.raw.hello));
        countries.add(new country("Wellington","NewZealand",R.raw.hello));
        countries.add(new country("Canberra","Australia",R.raw.hello));
        countries.add(new country("Delhi","India",R.raw.hello));
        countries.add(new country("Berlin","Germany",R.raw.hello));
        countries.add(new country("Washington","America",R.raw.hello));
        countries.add(new country("Wellington","NewZealand",R.raw.hello));
        countries.add(new country("Canberra","Australia",R.raw.hello));
        countries.add(new country("Delhi","India",R.raw.hello));
        countries.add(new country("Berlin","Germany",R.raw.hello));
        countries.add(new country("Washington","America",R.raw.hello));
        countries.add(new country("Wellington","NewZealand",R.raw.hello));
        countries.add(new country("Canberra","Australia",R.raw.hello));
        madapter = new customadapter(this,countries);
        a.setAdapter(madapter);
        a.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(MainActivity.this,"wowo",Toast.LENGTH_SHORT).show();
              country a= countries.get(position);
                MediaPlayer M = MediaPlayer.create(MainActivity.this,a.getSn());
                M.start();
            }
        });


    }


 }