package com.example.medicalresearchdream.activity;


import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalresearchdream.R;

import java.util.Timer;

public class YingActivity extends AppCompatActivity implements View.OnClickListener {

    private Timer timer;
    private ImageView mImYing;
    private long mMillisUntilFinished1;
    private TextView mTe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ying);
        initView();
        Count();
    }


    private void initView() {
        mImYing = (ImageView) findViewById(R.id.im_ying);
        mImYing.setOnClickListener(this);
        mTe = (TextView) findViewById(R.id.te);
    }

    public void Count() {
        CountDownTimer countDownTimer = new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mMillisUntilFinished1 = millisUntilFinished;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mTe.setText(mMillisUntilFinished1 / 1000 + "s");
                    }
                });
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(YingActivity.this, YingwActivity.class);
                startActivity(intent);
            }
        };
        countDownTimer.start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.im_ying:
                break;
        }
    }
}
