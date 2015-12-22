package com.example.aum.traffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bind Widget
        bindWidget();

        // button Controller

        buttonController();

        listViewController();

    } // Main Method

    private void listViewController() {

        //#1
        int[] icon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_16, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};
        //#2
        String[] strTitle = new String[20];
        strTitle[0] = "หัวข้อ 1";
        strTitle[1] = "หัวข้อ 2";
        strTitle[2] = "หัวข้อ 3";
        strTitle[3] = "หัวข้อ 4";
        strTitle[4] = "หัวข้อ 5";
        strTitle[5] = "หัวข้อ 6";
        strTitle[6] = "หัวข้อ 7";
        strTitle[7] = "หัวข้อ 8";
        strTitle[8] = "หัวข้อ 9";
        strTitle[9] = "หัวข้อ 10";
        strTitle[10] = "หัวข้อ 11";
        strTitle[11] = "หัวข้อ 12";
        strTitle[12] = "หัวข้อ 13";
        strTitle[13] = "หัวข้อ 14";
        strTitle[14] = "หัวข้อ 15";
        strTitle[15] = "หัวข้อ 16";
        strTitle[16] = "หัวข้อ 17";
        strTitle[17] = "หัวข้อ 18";
        strTitle[18] = "หัวข้อ 19";
        strTitle[19] = "หัวข้อ 20";

    //#3 XML
        String[] strDetail = getResources().getStringArray(R.array.detail_short);

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, strTitle, strDetail, icon);
        trafficListView.setAdapter(objMyAdapter);

    } // ListViewController

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.lion);
                buttonMediaPlayer.start();

                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/rdvEBrFAnfs"));
                startActivity(objIntent);
            }       //events
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

} // Main Class
