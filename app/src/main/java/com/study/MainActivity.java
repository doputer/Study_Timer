package com.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private Context mContext;

    private ArrayList<TimeData> array_time;
    private ListView mListView;
    private TimeAdapter mTimeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mContext = getApplicationContext();

        mListView = (ListView) findViewById(R.id.main_time_listview);

        array_time = new ArrayList<TimeData>();

        TimeData tmp = new TimeData("안드로이드");
        array_time.add(tmp);

        mTimeAdapter = new TimeAdapter(mContext, array_time);
        mListView.setAdapter(mTimeAdapter);
    }


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        start_button = findViewById(R.id.start_button);
//        time_text = findViewById(R.id.time_text);
//
//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.start_button:
//                        startTimer();
//                        break;
//                }
//            }
//        };
//
//        start_button.setOnClickListener(listener);
//    }

//    void startTimer() {
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        time_text.setText(seconds + " 밀리초");
//                        seconds++;
//                    }
//                });
//
//            }
//        };
//        Timer timer = new Timer();
//        timer.schedule(timerTask, 0, 1);
//    }
}