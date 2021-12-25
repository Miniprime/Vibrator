package com.miniprime1.vibrator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_start = (Button)findViewById(R.id.button);
        Button btn_stop = (Button)findViewById(R.id.button2);

        final Vibrator vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        btn_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vibrator.vibrate(new long[]{1,1000,1,100,1,1000,1,1000}, 0);
                Log.i("Start", "Vibrating Started");
            }
        });

        btn_stop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vibrator.cancel();
                Log.i("Stop", "Vibrating Stopped");
            }
        });
    }
}