package com.example.hassan.timersabith;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.Timer);
        Timer();
    }

    private void Timer(){
        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tv.setText("Timer is :" + millisUntilFinished / 1000 + "s");
            }

            @Override
            public void onFinish() {
             tv.setText("Timer is finished");
            }
        }.start();
    }
}
