package com.example.gridlayoutspan;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static String LOG_TAG = "MainActivity";

    private Button button1;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button9;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.doyouspeakenglish);
        button3 = findViewById(R.id.goodevening);
        button4 = findViewById(R.id.hello);
        button5 = findViewById(R.id.howareyou);
        button6 = findViewById(R.id.mynameis);
        button7 = findViewById(R.id.please);
        button9 = findViewById(R.id.welcome);
    }

    @Override
    public void onClick(View v) {
        // widget internal id
        int id = v.getId();
        String viewId = "";

        // id of the button
        viewId = getResources().getResourceEntryName(id);

        Log.i(LOG_TAG, viewId);

        // id of the resource from the raw folder
        int resourceId = getResources().getIdentifier(viewId, "raw", "com.example.gridlayoutspan");

        mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();
    }
}

